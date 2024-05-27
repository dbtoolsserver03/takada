package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2024/05/27 17:56:13
 * rentlist 
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Trent implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rentlist.id
     *
     * @mbg.generated Mon May 27 17:56:13 JST 2024
     */
    /**
     * @TableNamerentlist
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
     * This field corresponds to the database column rentlist.houseid
     *
     * @mbg.generated Mon May 27 17:56:13 JST 2024
     */
    /**
     * @TableNamerentlist
     * @TableRemarks 
     * @ActualColumnName houseid
     * @ActualColumnRemarks 
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
    private String houseid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rentlist.rentdate_start
     *
     * @mbg.generated Mon May 27 17:56:13 JST 2024
     */
    /**
     * @TableNamerentlist
     * @TableRemarks 
     * @ActualColumnName rentdate_start
     * @ActualColumnRemarks 
     * @ActualTypeName DATE
     * @isNullable true
     * @Length 10
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn true
     * @isJDBCTimeColumn false
     * @JdbcTypeName DATE
     * @JdbcType 91
     */
    private Date rentdateStart;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rentlist.rentdate_end
     *
     * @mbg.generated Mon May 27 17:56:13 JST 2024
     */
    /**
     * @TableNamerentlist
     * @TableRemarks 
     * @ActualColumnName rentdate_end
     * @ActualColumnRemarks 
     * @ActualTypeName DATE
     * @isNullable true
     * @Length 10
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn true
     * @isJDBCTimeColumn false
     * @JdbcTypeName DATE
     * @JdbcType 91
     */
    private Date rentdateEnd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column rentlist.rentvalue
     *
     * @mbg.generated Mon May 27 17:56:13 JST 2024
     */
    /**
     * @TableNamerentlist
     * @TableRemarks 
     * @ActualColumnName rentvalue
     * @ActualColumnRemarks 
     * @ActualTypeName FLOAT
     * @isNullable true
     * @Length 12
     * @Scale 0
     * @DefaultValue null
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName REAL
     * @JdbcType 7
     */
    private Float rentvalue;
}