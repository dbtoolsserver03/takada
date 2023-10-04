package org.mybatis.generator.plugins;
 
 
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

/**   
 * @Title: MyCommentGenerator.java 
 * @Package com.fendo.mybatis_generator_plus 
 * @Description:  mybatis generator 自定义comment生成器.
 *                基于MBG 1.3.5
 * @author fendo
 * @date 2017年10月5日 下午3:07:26 
 * @version V1.0   
*/
public class LombokMyCommentGenerator {
 
	public static final String S_XML = "src"+File.separator+"main"+File.separator+"resources"+File.separator+"com"+File.separator+"baizhi"+File.separator+"dao"+File.separator+"original";
	public static final String S_DAO = "src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"baizhi"+File.separator+"dao"+File.separator+"original";
	public static final String S_PO = "src"+File.separator+"main"+File.separator+"java"+File.separator+"com"+File.separator+"baizhi"+File.separator+"entity"+File.separator+"original";
	
	
	public static void main(String[] args) throws URISyntaxException {
		
		run();
	}

	public static void run() {
        try {
        	System.out.println("--------------------start generator-------------------");
            List<String> warnings = new ArrayList<String>();
            boolean overwrite = true;
            String filePath = "res" + File.separator+"generatorConfigMysqlLombok.xml";
            File f = new File(filePath);
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(f);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            
			delFile(new File(S_PO));
			delFile(new File(S_DAO));

            myBatisGenerator.generate(null);
        	System.out.println("--------------------end generator-------------------");
        	
        	
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (InvalidConfigurationException e) {
            e.printStackTrace();
        } catch (XMLParserException e) {
            e.printStackTrace();
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