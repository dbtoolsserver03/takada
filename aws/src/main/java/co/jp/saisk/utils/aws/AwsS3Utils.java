package co.jp.saisk.utils.aws;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.amazonaws.AmazonServiceException;
import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.Bucket;
import com.amazonaws.services.s3.model.GetObjectRequest;
import com.amazonaws.services.s3.model.ListObjectsRequest;
import com.amazonaws.services.s3.model.ObjectListing;
import com.amazonaws.services.s3.model.S3ObjectSummary;

import co.jp.saisk.utils.base.MyStrUtils;

public class AwsS3Utils {

	private static Properties properties = new Properties();

	//プロパティファイルのパスを指定する
	static {
		String strpass = "properties/aws.properties";

		try {
			InputStream istream = new FileInputStream(strpass);
			properties.load(istream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	//    
	//    /*
	//     * The ProfileCredentialsProvider will return your [default]
	//     * credential profile by reading from the credentials file located at
	//     * (~/.aws/credentials).
	//     */
	//    AWSCredentials credentials = null;
	//    try {
	//        credentials = new ProfileCredentialsProvider().getCredentials();
	//    } catch (Exception e) {
	//        throw new AmazonClientException(
	//                "Cannot load the credentials from the credential profiles file. " +
	//                "Please make sure that your credentials file is at the correct " +
	//                "location (~/.aws/credentials), and is in valid format.",
	//                e);
	//    }
	//
	//    AmazonS3 s3 = AmazonS3ClientBuilder.standard()
	//        .withCredentials(new AWSStaticCredentialsProvider(credentials))
	//        .withRegion("us-west-2")
	//        .build();
	//    
	//  AWSCredentials credentials = new BasicAWSCredentials("アクセスキー","シークレットキー");
	public static AWSCredentials credentials = new BasicAWSCredentials(
			properties.getProperty("aws.accesskey"),
			properties.getProperty("aws.secretkey")
	//			  "AKIA43GGCL4VARMBBIWR",//<AWS accesskey> 
	//			  "hSJ3bGIJGrGVP2+jTMiLB2WwBFru1QrW4eAi8uye"//<AWS secretkey>
	);

	public static AmazonS3 s3client = AmazonS3ClientBuilder
			.standard()
			.withCredentials(new AWSStaticCredentialsProvider(credentials))
			.withRegion(Regions.fromName(properties.getProperty("aws.region")))
			//.withRegion(Regions.AP_NORTHEAST_1)
			.build();

	public static void main(String[] args) {

		try {
			//			Map<String,String> repFolderMap= new LinkedHashMap<>();
			//			repFolderMap.put(MyConst.YYYYMMDD,MyConst.REG_YYYYMMDD );
			//			repFolderMap.put(MyConst.YYYYMM,MyConst.REG_YYYYMM);
			//			System.out.println(getPathSetLike("s3://bucketsaisk01/bucketsaisk01/YYYYMM/YYYYMMDD/", repFolderMap));

			//System.out.println(getNameSetByS3Path("s3://bucket-souka-test-001/20200501/", false));
			//System.out.println(getFileNameSet("bucketsaisk02","bucket",true));

			listAll();

		} catch (Throwable e) {
			e.printStackTrace();
			System.exit(1);
		}
		System.exit(0);
	}

	private static void listAll() {
		List<Bucket> buckets = s3client.listBuckets();
		for (Bucket bucket : buckets) {
			System.out.println(bucket.getName());

			// 指定されたバケット配下のキーのオブジェクト（ファイル）リストを取得する。
			ObjectListing objectListing = s3client.listObjects(new ListObjectsRequest()
					.withBucketName(bucket.getName())
			//.withPrefix("20")
			);
			for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {
				System.out.println(" - " + objectSummary.getKey() + "  " +
						"(size = " + objectSummary.getSize() + ")");
				downLoadFile(bucket.getName(), objectSummary.getKey(),
						"C:\\file\\aws_test" + File.separator + bucket.getName() + File.separator);

			}

			//	            System.out.println("---------------------");
			//	            
			//	            ListObjectsV2Result result = s3client.listObjectsV2(bucket.getName());
			//	            List<S3ObjectSummary> objects = result.getObjectSummaries();
			//	            for (S3ObjectSummary os : objects) {
			//	                System.out.println("* " + os.getKey());
			//	            }
		}
	}

	public static Set<String> getFileNameSet(String bucketName, String prefix, boolean hasSub) {

		ObjectListing aObjectListing = MyStrUtils.isEmpty(
				prefix) ? AwsS3Utils.s3client.listObjects(new ListObjectsRequest()
						.withBucketName(bucketName))
						: AwsS3Utils.s3client.listObjects(new ListObjectsRequest()
								.withBucketName(bucketName).withPrefix(prefix));

		Set<String> nameSet = getFileNm(aObjectListing);

		if (hasSub) {
			return nameSet;
		} else {
			Set<String> filterNameSet = new TreeSet<>();
			for (String key : nameSet) {
				if (MyStrUtils.isEmpty(prefix)) {
					if (MyStrUtils.getCntForSameStr(key, "/") == 0) {
						filterNameSet.add(key);
					}
				} else {
					key = key.substring(prefix.length());
					if (MyStrUtils.getCntForSameStr(key, "/") == 1) {
						filterNameSet.add(key.substring(1));
					}
				}

			}
			return filterNameSet;
		}
	}

	public static Set<String> getAwsPathList(String awsCmd) {

		if (awsCmd.endsWith("/")) {
			awsCmd = awsCmd.substring(0, awsCmd.length() - 1);
		}

		String pre = "s3://";
		String bucketName = "";
		String prefix = "";

		String afterStr = awsCmd.substring(pre.length());
		if (afterStr.contains("/")) {
			bucketName = afterStr.substring(0, afterStr.indexOf("/"));
			prefix = afterStr.substring(bucketName.length() + "/".length());
		} else {
			bucketName = afterStr;
		}
		return getS3Path(bucketName, prefix);
	}

	public static Set<String> getS3Path(String bucketName, String prefix) {

		ObjectListing objectListing = MyStrUtils.isEmpty(
				prefix) ? AwsS3Utils.s3client.listObjects(new ListObjectsRequest()
						.withBucketName(bucketName))
						: AwsS3Utils.s3client.listObjects(new ListObjectsRequest()
								.withBucketName(bucketName).withPrefix(prefix));

		Set<String> retSet = new TreeSet<String>();
		for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {

			String key = objectSummary.getKey();
			if (key.endsWith("/")) {
				retSet.add("s3://" + bucketName + "/" + key);
			} else if (key.contains("/")) {
				retSet.add("s3://" + bucketName + "/" + key.substring(0, key.lastIndexOf("/") + 1));
			}
		}
		return retSet;
	}

	public static Set<String> getFileNm(ObjectListing objectListing) {

		Set<String> retLst = new TreeSet<String>();
		for (S3ObjectSummary objectSummary : objectListing.getObjectSummaries()) {

			String key = objectSummary.getKey();
			if (key.endsWith("/")) {
				// do nothing
			} else if (key.contains("/")) {
				retLst.add(key);
			} else {
				retLst.add(key);
			}
		}
		return retLst;
	}

	/**
	 * 
	 * @param awsCmd s3://bucketsaisk02
	 * @param b
	 * @return
	 */
	public static Set<String> getNameSetByS3Path(String awsCmd, boolean hasSub) {

		if (awsCmd.endsWith("/")) {
			awsCmd = awsCmd.substring(0, awsCmd.length() - 1);
		}

		String pre = "s3://";
		String bucketName = "";
		String prefix = "";

		String afterStr = awsCmd.substring(pre.length());
		if (afterStr.contains("/")) {
			bucketName = afterStr.substring(0, afterStr.indexOf("/"));
			prefix = afterStr.substring(bucketName.length() + "/".length());
		} else {
			bucketName = afterStr;
		}

		return getFileNameSet(bucketName, prefix, hasSub);
	}

	public static Map<String, String> getPathSetLike(String awsPath, String subPathReg, String commonKeyFolder) {

		Map<String, String> retMap = new TreeMap<>();
		if (MyStrUtils.isEmpty(subPathReg)) {
			retMap.put(subPathReg, awsPath);
		} else {
			for (String key : getAwsPathList(awsPath)) {
				key = key.substring(0, key.length()-1);
				String str = key.substring(awsPath.length()+1);
				if (str.matches(subPathReg)) {
					if (commonKeyFolder.length() == 0) {
						if (MyStrUtils.isEmpty(subPathReg)) {
							retMap.put(str, key);
						} else {
							Pattern p = Pattern.compile("("+subPathReg+")");
							Matcher m = p.matcher(str);
							if (m.find()) {
								retMap.put(m.group(),key);
							}
						}
					} else {
						Pattern p = Pattern.compile(commonKeyFolder);
						Matcher m = p.matcher(str);
						if (m.find()) {
							retMap.put(m.group(), key);
						}
					}
				}
			}
		}
		return retMap;
	}

	public static File downLoadFile(String bucketName, String key, String toFolder) {

		File toFile = null;
		String toName = "";

		if (key.endsWith("/")) {
			toFolder = toFolder + key;
		} else if (key.contains("/")) {
			toName = key.substring(key.lastIndexOf("/") + 1);
			//toFolder = toFolder + File.separator + key.substring(0,key.lastIndexOf("/")).replaceAll("/", File.separator);
			toFolder = toFolder + File.separator + key.substring(0, key.lastIndexOf("/"));
			toFolder = MyStrUtils.funReplace(toFolder, "/", File.separator);

		} else {
			toName = key;
		}

		System.out.format("Downloading %s from S3 bucket %s...\n", key, bucketName);

		// バケット名とS3のファイルパス（キー値）を指定
		GetObjectRequest request = new GetObjectRequest(bucketName, key);

		// ファイルダウンロード
		try {
			// ファイル保存先
			new File(toFolder).mkdirs();

			if (toName.length() != 0) {
				toFile = new File(toFolder + File.separator + toName);
				s3client.getObject(request, toFile);
			}

		} catch (AmazonServiceException e) {
			e.printStackTrace();
			toName = null;
		}
		return toFile;

	}
}

/*
 
 C:\Users\tech>aws configure
	AWS Access Key ID [None]: AKIA43GGCL4VHWRYZXM2
	AWS Secret Access Key [None]: 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
	Default region name [None]: ap-northeast-1
	Default output format [None]: json
	
 C:\Users\tech>aws s3 ls s3://bucketsaisk01/bucketsaisk01/202301/20230101/

https://blog.51cto.com/beanxyz/2578835
https://g-weblog.com/blog/26



arn:aws:s3:::bucketsaisk01
arn:aws:iam::883031170858:user/saisk


 {
    "Version": "2012-10-17",
    "Id": "Policy1680903312724",
    "Statement": [
        {
            "Sid": "Stmt1680903296939",
            "Effect": "Allow",
            "Principal": {
                "AWS": "arn:aws:iam::883031170858:user/saisk"
            },
            "Action": "s3:*",
            "Resource": "arn:aws:s3:::bucketsaisk01"
        }
    ]
}


コマンド	説明
aws s3 ls	バケットの一覧を表示する
aws s3 ls s3://{バケット名}/{パス}	バケットの内容を表示する
aws s3 mb s3://{バケット名}	バケットを作成する
aws s3 rb s3://{バケット名}	バケットを削除する(空でない場合は削除されない)
aws s3 rb s3://{バケット名} --force	バケットを削除する(空でなくても削除される)
aws s3 sync {フォルダパス} s3://{バケット名}/{パス}	バケットの内容をローカルのフォルダと同期する(追加・更新のみで削除されない)
aws s3 sync {フォルダパス} s3://{バケット名}/{パス} --delete	バケットの内容をローカルのフォルダと同期する(削除もされる)
aws s3 cp {ファイルパス} s3://{バケット名}/{パス}	ローカルのファイルをバケットにコピーする
aws s3 mv {ファイルパス} s3://{バケット名}/{パス}	ローカルのファイルをバケットに移動する
aws s3 rm s3://{バケット名}/{ファイルパス}	バケットのファイルを削除する
aws s3 rm s3://{バケット名}/{フォルダパス} --recursive	バケットのフォルダを削除する
 */
