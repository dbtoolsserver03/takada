package org.mybatis.generator;

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
import org.mybatis.generator.api.dom.java.FullyQualifiedJavaType;
import org.mybatis.generator.api.dom.java.Interface;
import org.mybatis.generator.api.dom.java.Method;
import org.mybatis.generator.api.dom.java.TopLevelClass;

/**
 * @author Liweizhou  2018/6/6
 */
public class LombokPlugin extends PluginAdapter {

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
        topLevelClass.addJavaDocLine(" * @date " + (new SimpleDateFormat("yyyy/MM/dd/hh:mm")).format(new Date()));
        
        topLevelClass.addJavaDocLine(" * " + introspectedTable.getFullyQualifiedTable()+ " " + introspectedTable.getRemarks());
        
        topLevelClass.addJavaDocLine(" */");
        topLevelClass.addSuperInterface(new FullyQualifiedJavaType("java.io.Serializable"));
        return true;
    }
    public boolean clientGenerated(Interface anInterface, TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        anInterface.addJavaDocLine("/**");
        anInterface.addJavaDocLine(" * @author "+ System.getProperty("user.name"));
        anInterface.addJavaDocLine(" * @date " + (new SimpleDateFormat("yyyy/MM/dd/hh:mm")).format(new Date()));
        anInterface.addJavaDocLine(" */ kkkkkkkkkk");
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

}