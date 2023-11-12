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
 * m_code m_code
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MCode extends MCodeKey implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_value
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_value
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 50
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
    private String mValue;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_order
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_order
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
    private Integer mOrder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display1
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display1
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
    private String mDisplay1;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display2
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display2
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
    private String mDisplay2;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display3
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display3
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
    private String mDisplay3;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display4
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display4
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
    private String mDisplay4;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display5
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display5
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
    private String mDisplay5;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display6
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display6
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
    private String mDisplay6;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display7
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display7
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
    private String mDisplay7;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display8
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display8
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
    private String mDisplay8;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.m_display9
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName m_display9
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
    private String mDisplay9;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.delete_flg
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
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
     * This field corresponds to the database column m_code.create_time
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
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
     * This field corresponds to the database column m_code.create_user_id
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
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
     * This field corresponds to the database column m_code.update_time
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
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
     * This field corresponds to the database column m_code.update_user_id
     *
     * @mbg.generated Sun Nov 12 11:55:54 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
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
}