package com.baizhi.entity.original;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author zj_brand
 * @date 2023/11/19 14:45:13
 * carinfo 
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Carinfo implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carinfo.id
     *
     * @mbg.generated Sun Nov 19 14:45:13 JST 2023
     */
    /**
     * @TableNamecarinfo
     * @TableRemarks 
     * @ActualColumnName id
     * @ActualColumnRemarks 
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
     * This field corresponds to the database column carinfo.username
     *
     * @mbg.generated Sun Nov 19 14:45:13 JST 2023
     */
    /**
     * @TableNamecarinfo
     * @TableRemarks 
     * @ActualColumnName username
     * @ActualColumnRemarks 用户名
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 40
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
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carinfo.carType
     *
     * @mbg.generated Sun Nov 19 14:45:13 JST 2023
     */
    /**
     * @TableNamecarinfo
     * @TableRemarks 
     * @ActualColumnName carType
     * @ActualColumnRemarks 车型
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
    private String cartype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column carinfo.photo
     *
     * @mbg.generated Sun Nov 19 14:45:13 JST 2023
     */
    /**
     * @TableNamecarinfo
     * @TableRemarks 
     * @ActualColumnName photo
     * @ActualColumnRemarks 图片
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 40
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
     * This field corresponds to the database column carinfo.odometer
     *
     * @mbg.generated Sun Nov 19 14:45:13 JST 2023
     */
    /**
     * @TableNamecarinfo
     * @TableRemarks 
     * @ActualColumnName odometer
     * @ActualColumnRemarks 里程
     * @ActualTypeName TINYINT UNSIGNED
     * @isNullable true
     * @Length 3
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName TINYINT
     * @JdbcType -6
     */
    private Byte odometer;
}