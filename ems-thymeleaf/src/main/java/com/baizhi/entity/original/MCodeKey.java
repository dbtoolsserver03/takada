package com.baizhi.entity.original;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2023/10/05 21:17:21
 * m_code m_code
 */
@Accessors(chain = true)
@Data
public class MCodeKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.key
     *
     * @mbg.generated Thu Oct 05 21:17:21 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName key
     * @ActualColumnRemarks key
     * @ActualTypeName VARCHAR
     * @isNullable false
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
    private String key;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column m_code.code
     *
     * @mbg.generated Thu Oct 05 21:17:21 JST 2023
     */
    /**
     * @TableNamem_code
     * @TableRemarks m_code
     * @ActualColumnName code
     * @ActualColumnRemarks code
     * @ActualTypeName CHAR
     * @isNullable false
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
    private String code;
}