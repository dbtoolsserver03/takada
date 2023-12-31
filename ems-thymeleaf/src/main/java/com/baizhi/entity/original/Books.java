package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author tech
 * @date 2023/11/19 11:14:01
 * books 书
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Books implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.id
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    /**
     * @TableNamebooks
     * @TableRemarks 书
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
     * This field corresponds to the database column books.book_name
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    /**
     * @TableNamebooks
     * @TableRemarks 书
     * @ActualColumnName book_name
     * @ActualColumnRemarks 书名
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
    private String bookName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.author_name
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    /**
     * @TableNamebooks
     * @TableRemarks 书
     * @ActualColumnName author_name
     * @ActualColumnRemarks 作者
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
    private String authorName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.price
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    /**
     * @TableNamebooks
     * @TableRemarks 书
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
     * This field corresponds to the database column books.publication_day
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    /**
     * @TableNamebooks
     * @TableRemarks 书
     * @ActualColumnName publication_day
     * @ActualColumnRemarks 出版日
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
    private Date publicationDay;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column books.photo
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    /**
     * @TableNamebooks
     * @TableRemarks 书
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