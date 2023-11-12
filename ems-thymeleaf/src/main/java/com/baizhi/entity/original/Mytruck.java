package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author tech
 * @date 2023/11/12 11:55:54
 * mytruck 卡车
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Mytruck implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mytruck.id
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamemytruck
     * @TableRemarks 卡车
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
     * This field corresponds to the database column mytruck.car_name
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamemytruck
     * @TableRemarks 卡车
     * @ActualColumnName car_name
     * @ActualColumnRemarks 公司名
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
    private String carName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mytruck.price
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamemytruck
     * @TableRemarks 卡车
     * @ActualColumnName price
     * @ActualColumnRemarks 价格
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
    private Double price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mytruck.product_day
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamemytruck
     * @TableRemarks 卡车
     * @ActualColumnName product_day
     * @ActualColumnRemarks 生产日
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
    private Date productDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column mytruck.photo
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamemytruck
     * @TableRemarks 卡车
     * @ActualColumnName photo
     * @ActualColumnRemarks 图片路径
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
}