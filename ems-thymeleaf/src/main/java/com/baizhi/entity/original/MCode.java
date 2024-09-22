package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author USER
 * @date 2024/09/01 17:17:11
 * m_code マスタコード
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_value
     * @ActualColumnRemarks 内容
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_order
     * @ActualColumnRemarks 並び順
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display1
     * @ActualColumnRemarks 表示１
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display2
     * @ActualColumnRemarks 表示２
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display3
     * @ActualColumnRemarks 表示３
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display4
     * @ActualColumnRemarks 表示４
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display5
     * @ActualColumnRemarks 表示５
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display6
     * @ActualColumnRemarks 表示６
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display7
     * @ActualColumnRemarks 表示７
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display8
     * @ActualColumnRemarks 表示８
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName m_display9
     * @ActualColumnRemarks 表示９
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName delete_flg
     * @ActualColumnRemarks 削除フラグ
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName create_time
     * @ActualColumnRemarks 登録日時
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName create_user_id
     * @ActualColumnRemarks 登録者
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName update_time
     * @ActualColumnRemarks 更新日時
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
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamem_code
     * @TableRemarks マスタコード
     * @ActualColumnName update_user_id
     * @ActualColumnRemarks 更新者
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