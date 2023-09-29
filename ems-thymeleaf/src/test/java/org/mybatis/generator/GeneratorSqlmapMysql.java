package org.mybatis.generator;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;

public class GeneratorSqlmapMysql {

	public static final String PO_PATH = File.separator+"src"+File.separator+"cn"+File.separator+"itcast+"+File.separator+"+ssm"+File.separator+"po"+File.separator+"original";
	public static final String PO_MAPPER = File.separator+"src"+File.separator+"cn"+File.separator+"itcast"+File.separator+"ssm"+File.separator+"mapper"+File.separator+"original";
	public void generator() throws Exception{

		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		//指定 逆向工程配置文件
		File configFile = new File("res"+File.separator+"generatorConfigMysql.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configFile);
		DefaultShellCallback callback = new DefaultShellCallback(overwrite);
		MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config,
				callback, warnings);
		myBatisGenerator.generate(null);

	}
	public static void main(String[] args) throws Throwable {
		run();

	}

	public static void run() {
		try {

			File directory = new File("");//参数为空

			String courseFile = directory.getCanonicalPath() ;

			
			//delFile(new File(courseFile +PO_PATH));
			//delFile(new File(courseFile +PO_MAPPER));
			
			GeneratorSqlmapMysql generatorSqlmap = new GeneratorSqlmapMysql();
			generatorSqlmap.generator();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	public static void delFile(File f)throws Throwable {
		try {
			if (f == null) {
				return;
			}
			if (f.isDirectory()) {
				File[] list = f.listFiles();
				for (int i = 0; i < list.length; i++) {
					if (list[i].isDirectory()) {
						delFile(list[i]);
					}else{
						if(list[i].isFile())
							list[i].delete();
					}
				}
				f.delete();
			} else {
				if (f.isFile()) {
					f.delete();
				}
		
			}
		} catch (Throwable e) {
			throw e;
		}
	}
}
