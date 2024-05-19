package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2024/05/12 16:12:58
 * employee 
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.id
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName id
     * @ActualColumnRemarks NO
     * @ActualTypeName INT UNSIGNED
     * @isNullable false
     * @Length 10
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement true
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName INTEGER
     * @JdbcType 4
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.name
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName name
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 60
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName VARCHAR
     * @JdbcType 12
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.salary
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName salary
     * @ActualColumnRemarks 
     * @ActualTypeName DOUBLE
     * @isNullable true
     * @Length 10
     * @Scale 2
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName DOUBLE
     * @JdbcType 8
     */
    private Double salary;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.birthday
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName birthday
     * @ActualColumnRemarks 
     * @ActualTypeName DATETIME
     * @isNullable true
     * @Length 19
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName TIMESTAMP
     * @JdbcType 93
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.photo
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName photo
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 200
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName VARCHAR
     * @JdbcType 12
     */
    private String photo;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.sex
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName sex
     * @ActualColumnRemarks 
     * @ActualTypeName CHAR
     * @isNullable true
     * @Length 2
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName CHAR
     * @JdbcType 1
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.foreign_type
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName foreign_type
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 255
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName VARCHAR
     * @JdbcType 12
     */
    private String foreignType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column employee.job_role
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    /**
     * @TableNameemployee
     * @TableRemarks 
     * @ActualColumnName job_role
     * @ActualColumnRemarks 
     * @ActualTypeName CHAR
     * @isNullable true
     * @Length 2
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn true
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName CHAR
     * @JdbcType 1
     */
    private String jobRole;
}