package org.mybatis.generator.plugins;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/*
使用该类时  使用该路劲 需要与jar包路径一致
package org.mybatis.generator.plugins;
 */

import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.Field;
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * @author takada  2023/10/02
 */
public class LombokPlugin extends PluginAdapter {

	public static String S_DATE = (new SimpleDateFormat("yyyy/MM/dd HH:mm:ss")).format(new Date());
	
    @Override
    public boolean validate(List<String> list) {
        return true;
    }
    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
    	
    	topLevelClass.addImportedType("lombok.AllArgsConstructor");
        topLevelClass.addImportedType("lombok.Builder");
        topLevelClass.addImportedType("lombok.Data");
        topLevelClass.addImportedType("lombok.NoArgsConstructor");
        topLevelClass.addImportedType("lombok.experimental.Accessors");
        
        topLevelClass.addAnnotation("@Accessors(chain = true)");
        topLevelClass.addAnnotation("@Data");
        topLevelClass.addAnnotation("@Builder");
        topLevelClass.addAnnotation("@NoArgsConstructor");
        topLevelClass.addAnnotation("@AllArgsConstructor");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * @author " + System.getProperty("user.name"));
        topLevelClass.addJavaDocLine(" * @date " + S_DATE);
        
        topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable()+ " " + introspectedTable.getRemarks());
        
        topLevelClass.addJavaDocLine(" */");
        topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));
        return true;
    }
    public boolean clientGenerated(Interface anInterface, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        anInterface.addJavaDocLine("/**");
        anInterface.addJavaDocLine(" * @author "+ System.getProperty("user.name"));
        anInterface.addJavaDocLine(" * @date " + S_DATE);
        anInterface.addJavaDocLine(" */");
        return true;
    }


    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        //不生成getter
        return false;
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn, IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        //不生成setter
        return false;
    }
	@Override
	public boolean modelFieldGenerated(Field field, TopLevelClass topLevelClass, IntrospectedColumn introspectedColumn,
			IntrospectedTable introspectedTable, ModelClassType modelClassType) {
		
		System.out.println(introspectedColumn);
        field.addJavaDocLine("/**");
        field.addJavaDocLine(" * " + "@TableName" + introspectedTable.getFullyQualifiedTable().getIntrospectedTableName());
        field.addJavaDocLine(" * " + "@TableRemarks " + introspectedTable.getRemarks());
        field.addJavaDocLine(" * " + "@ActualColumnName " + introspectedColumn.getActualColumnName());
        field.addJavaDocLine(" * " + "@ActualColumnRemarks " + introspectedColumn.getRemarks());
        field.addJavaDocLine(" * " + "@ActualTypeName " + introspectedColumn.getActualTypeName());
        field.addJavaDocLine(" * " + "@isNullable " + introspectedColumn.isNullable());
        field.addJavaDocLine(" * " + "@Length " + introspectedColumn.getLength());
        field.addJavaDocLine(" * " + "@Scale " + introspectedColumn.getScale());
        field.addJavaDocLine(" * " + "@DefaultValue " + introspectedColumn.getDefaultValue());
        
        field.addJavaDocLine(" * " + "@isAutoIncrement " + introspectedColumn.isAutoIncrement());
        field.addJavaDocLine(" * " + "@isIdentity " + introspectedColumn.isIdentity());
        field.addJavaDocLine(" * " + "@isStringColumn " + introspectedColumn.isStringColumn());
        field.addJavaDocLine(" * " + "@isBLOBColumn " + introspectedColumn.isBLOBColumn());
        field.addJavaDocLine(" * " + "@isJDBCDateColumn " + introspectedColumn.isJDBCDateColumn());
        field.addJavaDocLine(" * " + "@isJDBCTimeColumn " + introspectedColumn.isJDBCTimeColumn());
        
//        field.addJavaDocLine(" * " + "***********************" );
        field.addJavaDocLine(" * " + "@JdbcTypeName " + introspectedColumn.getJdbcTypeName());
        field.addJavaDocLine(" * " + "@JdbcType " + introspectedColumn.getJdbcType());
        field.addJavaDocLine(" */");
        
		return super.modelFieldGenerated(field, topLevelClass, introspectedColumn, introspectedTable, modelClassType);
	}
	@Override
	public boolean modelPrimaryKeyClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		// TODO 自動生成されたメソッド・スタブ
        topLevelClass.addImportedType("lombok.Data");
        topLevelClass.addImportedType("lombok.experimental.Accessors");
        
        topLevelClass.addAnnotation("@Accessors(chain = true)");
        topLevelClass.addAnnotation("@Data");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * @author " + System.getProperty("user.name"));
        topLevelClass.addJavaDocLine(" * @date " + S_DATE);
        topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable()+ " " + introspectedTable.getRemarks());
        topLevelClass.addJavaDocLine(" */");
        
        
		return super.modelPrimaryKeyClassGenerated(topLevelClass, introspectedTable);
	}
	@Override
	public boolean modelRecordWithBLOBsClassGenerated(TopLevelClass topLevelClass,
			IntrospectedTable introspectedTable) {
		// TODO 自動生成されたメソッド・スタブ
//    	topLevelClass.addImportedType("lombok.AllArgsConstructor");
//        topLevelClass.addImportedType("lombok.Builder");
//        topLevelClass.addImportedType("lombok.Data");
//        topLevelClass.addImportedType("lombok.experimental.Accessors");
//        
//        topLevelClass.addAnnotation("@Accessors(chain = true)");
//        topLevelClass.addAnnotation("@Data");
//        topLevelClass.addAnnotation("@Builder");
//        topLevelClass.addAnnotation("@AllArgsConstructor");
//        topLevelClass.addJavaDocLine("/**");
//        topLevelClass.addJavaDocLine(" * @author " + System.getProperty("user.name"));
//        topLevelClass.addJavaDocLine(" * @date " + S_DATE);
//        
//        topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable()+ " " + introspectedTable.getRemarks());
//        
//        topLevelClass.addJavaDocLine(" */");
//        topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));
//        
        
		return super.modelRecordWithBLOBsClassGenerated(topLevelClass, introspectedTable);
	}
	@Override
	public boolean modelExampleClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
		// TODO 自動生成されたメソッド・スタブ
    	topLevelClass.addImportedType("lombok.AllArgsConstructor");
        topLevelClass.addImportedType("lombok.Builder");
        topLevelClass.addImportedType("lombok.Data");
        topLevelClass.addImportedType("lombok.experimental.Accessors");
        
        topLevelClass.addAnnotation("@Accessors(chain = true)");
        topLevelClass.addAnnotation("@Data");
        topLevelClass.addAnnotation("@Builder");
        topLevelClass.addAnnotation("@AllArgsConstructor");
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine(" * @author " + System.getProperty("user.name"));
        topLevelClass.addJavaDocLine(" * @date " + S_DATE);
        
        topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable()+ " " + introspectedTable.getRemarks());
        topLevelClass.addJavaDocLine(" */");
        topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));
        
        
		return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
	}

}










