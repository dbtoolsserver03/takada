package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2024/02/08 18:45:15
 * uniqlo 
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Uniqlo implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.id
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
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
     * This field corresponds to the database column uniqlo.name
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
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
     * This field corresponds to the database column uniqlo.type
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName type
     * @ActualColumnRemarks //
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
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.size
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName size
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
    private String size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.sex
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
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
     * This field corresponds to the database column uniqlo.photo
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
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
     * This field corresponds to the database column uniqlo.sale_begin
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName sale_begin
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
    private Date saleBegin;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.sale_end
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName sale_end
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
    private Date saleEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.price
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName price
     * @ActualColumnRemarks 
     * @ActualTypeName INT
     * @isNullable true
     * @Length 10
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName INTEGER
     * @JdbcType 4
     */
    private Integer price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.delete_flg
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName delete_flg
     * @ActualColumnRemarks 
     * @ActualTypeName CHAR
     * @isNullable false
     * @Length 1
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
    private String deleteFlg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.create_time
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName create_time
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
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.create_user_id
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName create_user_id
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 20
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
    private String createUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.update_time
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName update_time
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
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.update_user_id
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName update_user_id
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 20
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
    private String updateUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column uniqlo.lblob
     *
     * @mbg.generated Thu Feb 08 18:45:15 JST 2024
     */
    /**
     * @TableNameuniqlo
     * @TableRemarks 
     * @ActualColumnName lblob
     * @ActualColumnRemarks 
     * @ActualTypeName LONGBLOB
     * @isNullable true
     * @Length 2147483647
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn true
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName LONGVARBINARY
     * @JdbcType -4
     */
    private byte[] lblob;
}