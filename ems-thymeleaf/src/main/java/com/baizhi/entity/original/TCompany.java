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
 * t_company 会社テーブル
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TCompany implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.id
     *
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamet_company
     * @TableRemarks 会社テーブル
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
     * This field corresponds to the database column t_company.name
     *
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamet_company
     * @TableRemarks 会社テーブル
     * @ActualColumnName name
     * @ActualColumnRemarks 会社名前
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
     * This field corresponds to the database column t_company.type
     *
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamet_company
     * @TableRemarks 会社テーブル
     * @ActualColumnName type
     * @ActualColumnRemarks 会社類型　00:株式会社　01:合同会社
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
     * This field corresponds to the database column t_company.peopleNum
     *
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamet_company
     * @TableRemarks 会社テーブル
     * @ActualColumnName peopleNum
     * @ActualColumnRemarks 会社人数
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
    private Integer peoplenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.beginDay
     *
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamet_company
     * @TableRemarks 会社テーブル
     * @ActualColumnName beginDay
     * @ActualColumnRemarks 会社設立年月日
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
    private Date beginday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_company.photo
     *
     * @mbg.generated Sun Sep 01 17:17:11 JST 2024
     */
    /**
     * @TableNamet_company
     * @TableRemarks 会社テーブル
     * @ActualColumnName photo
     * @ActualColumnRemarks アイコン
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