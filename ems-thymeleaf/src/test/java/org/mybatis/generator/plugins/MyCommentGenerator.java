package org.mybatis.generator.plugins;
 
 
import static org.mybatis.generator.internal.util.StringUtility.*;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.dom.java.CompilationUnit;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.InnerClass;
import org.mybatis.generator.api.dom.java.InnerEnum;
import org.mybatis.generator.api.dom.java.JavaElement;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.Parameter;
import org.mybatis.generator.api.dom.java.TopLevelClass;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.MergeConstants;
import org.mybatis.generator.config.PropertyRegistry;
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
public class MyCommentGenerator implements CommentGenerator{
 
	
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
            String filePath = "res" + File.separator+"generatorConfigMysql.xml";
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


	
	
    /**
      * properties配置文件
     */
    private Properties properties;
    /**
      * properties配置文件
     */
    private Properties systemPro;
    
    /*
     * 父类时间
     */
    private boolean suppressDate;
    
    /**
     * 父类所有注释
     */
    private boolean suppressAllComments;
    
    /**
     * 当前时间
     */
    private String currentDateStr;
    
    public MyCommentGenerator() {
        super();
        properties = new Properties();
        systemPro = System.getProperties();
        suppressDate = false;
        suppressAllComments = false;
        currentDateStr = (new SimpleDateFormat("yyyy-MM-dd")).format(new Date());
    }
    
    
    
	
	
	////////////////////////////////////////////////////////////////////
	
    
    /**
     * Java类的类注释
     */
	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (suppressAllComments) {
            return;
        }
 
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable() + " " + introspectedTable.getRemarks());
        sb.append(" aaaaaaaa");
        sb.append(getDateString());
        innerClass.addJavaDocLine(sb.toString().replace("\n", " "));
        innerClass.addJavaDocLine(" */");
	}
 
	/**
	 * 为类添加注释
	 */
	@Override
	public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
		if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        innerClass.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable()+ " " + introspectedTable.getRemarks());
        innerClass.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        sb.append(" * @author ");
        sb.append(systemPro.getProperty("user.name"));
        sb.append(" aaaaaaaaa ");
        sb.append(currentDateStr);
        innerClass.addJavaDocLine(" */");
	}
 
	
	/**
	 * Mybatis的Mapper.xml文件里面的注释
	 */
	@Override
	public void addComment(XmlElement xmlElement) {
		
	}
 
	/**
	 * 
	 *@Title addConfigurationProperties 
	 *@Description: 从该配置中的任何属性添加此实例的属性CommentGenerator配置。
	 *              这个方法将在任何其他方法之前被调用。
	 *@Author fendo
	 *@Date 2017年10月5日 下午3:45:58
	 *@return
	 *@throws
	 */
	@Override
	public void addConfigurationProperties(Properties properties) {
		this.properties.putAll(properties);
        suppressDate = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_DATE));
        suppressAllComments = isTrue(properties.getProperty(PropertyRegistry.COMMENT_GENERATOR_SUPPRESS_ALL_COMMENTS));
	}
 
	/**
	 * 
	 *@Title getDateString 
	 *@Description: 此方法返回格式化的日期字符串以包含在Javadoc标记中和XML注释。 如果您不想要日期，则可以返回null在这些文档元素中。
	 *@Author fendo
	 *@Date 2017年10月5日 下午3:45:58
	 *@return
	 *@throws
	 */
    protected String getDateString() {
        String result = null;
        if (!suppressDate) {
            result = currentDateStr;
        }
        return result;
    }
    
    /**
     * 
     *@Title addJavadocTag 
     *@Description: 此方法为其添加了自定义javadoc标签。
     *@Author fendo
     *@Date 2017年10月5日 下午3:49:05
     *@param javaElement
     *@param markAsDoNotDelete
     *@throws
     */
	protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        javaElement.addJavaDocLine(" *");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(MergeConstants.NEW_ELEMENT_TAG);
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }
        String s = getDateString();
        if (s != null) {
            sb.append(' ');
            sb.append(s);
        }
        javaElement.addJavaDocLine(sb.toString());
    }
	
	
	/**
	 * 为枚举添加注释
	 */
	@Override
	public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        innerEnum.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        innerEnum.addJavaDocLine(sb.toString().replace("\n", " "));
        innerEnum.addJavaDocLine(" */");
	}
 
	/**
	 * Java属性注释
	 */
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
		if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedTable.getFullyQualifiedTable());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
        
        
        
	}
 
	/**
	 * 为字段添加注释
	 */
	@Override
	public void addFieldComment(Field field, IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        field.addJavaDocLine("/**");
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        field.addJavaDocLine(sb.toString().replace("\n", " "));
        field.addJavaDocLine(" */");
	}
 
	/**
	 * 普通方法的注释，这里主要是XXXMapper.java里面的接口方法的注释
	 */
	@Override
	public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
	  if (suppressAllComments) {
        return;
      }
      method.addJavaDocLine("/**");
      addJavadocTag(method, false);
      method.addJavaDocLine(" */");
	}
 
	
	/**
	 * 给getter方法加注释
	 */
	@Override
	public void addGetterComment(Method method, IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
	    if (suppressAllComments) {
            return;
        }
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        sb.setLength(0);
        sb.append(" * @return ");
        sb.append(introspectedColumn.getActualColumnName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        method.addJavaDocLine(" */");
	}
 
	/**
	 * 给Java文件加注释，这个注释是在文件的顶部，也就是package上面。
	 */
	@Override
	public void addJavaFileComment(CompilationUnit compilationUnit) {
    	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
    	compilationUnit.addFileCommentLine("/*");
    	compilationUnit.addFileCommentLine("*");
    	compilationUnit.addFileCommentLine("* "+compilationUnit.getType().getShortName()+".java");
    	compilationUnit.addFileCommentLine("* Copyright(C) 2010-2030 saisk");
    	compilationUnit.addFileCommentLine("* @date "+sdf.format(new Date())+"");
    	compilationUnit.addFileCommentLine("*/");
	}
 
	/**
	 * 为模型类添加注释
	 */
	@Override
	public void addModelClassComment(TopLevelClass arg0, IntrospectedTable arg1) {
		
	}
 
	/**
	 * 为调用此方法作为根元素的第一个子节点添加注释。
	 */
	@Override
	public void addRootComment(XmlElement arg0) {
		
	}
 
	
	/**
	 * 给setter方法加注释
	 */
	@Override
	public void addSetterComment(Method method, IntrospectedTable introspectedTable,IntrospectedColumn introspectedColumn) {
		if (suppressAllComments) {
            return;
        }
        method.addJavaDocLine("/**");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        Parameter parm = method.getParameters().get(0);
        sb.setLength(0);
        sb.append(" * @param ");
        sb.append(parm.getName());
        sb.append(" ");
        sb.append(introspectedColumn.getRemarks());
        method.addJavaDocLine(sb.toString().replace("\n", " "));
        method.addJavaDocLine(" */");
	}

	@Override
	public void addClassAnnotation(InnerClass arg0, IntrospectedTable arg1, Set<FullyQualifiedJavaType> arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFieldAnnotation(Field arg0, IntrospectedTable arg1, Set<FullyQualifiedJavaType> arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addFieldAnnotation(Field arg0, IntrospectedTable arg1, IntrospectedColumn arg2,
			Set<FullyQualifiedJavaType> arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGeneralMethodAnnotation(Method arg0, IntrospectedTable arg1, Set<FullyQualifiedJavaType> arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addGeneralMethodAnnotation(Method arg0, IntrospectedTable arg1, IntrospectedColumn arg2,
			Set<FullyQualifiedJavaType> arg3) {
		// TODO Auto-generated method stub
		
	}
}