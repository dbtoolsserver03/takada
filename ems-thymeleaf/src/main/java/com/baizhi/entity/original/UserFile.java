package com.baizhi.entity.original;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author user
 * @date 2024/05/12 14:45:26
 * t_files 
 */
@Accessors(chain = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserFile implements java.io.Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.id
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName id
     * @ActualColumnRemarks key
     * @ActualTypeName INT
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
     * This field corresponds to the database column t_files.old_file_name
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName old_file_name
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
    private String oldFileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.new_file_name
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName new_file_name
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 300
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
    private String newFileName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.ext
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName ext
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
    private String ext;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.path
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName path
     * @ActualColumnRemarks 
     * @ActualTypeName VARCHAR
     * @isNullable true
     * @Length 300
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
    private String path;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.size
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName size
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
    private String size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.type
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName type
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
    private String type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.is_img
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName is_img
     * @ActualColumnRemarks 
     * @ActualTypeName CHAR
     * @isNullable true
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
    private String isImg;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.downcounts
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName downcounts
     * @ActualColumnRemarks 
     * @ActualTypeName INT
     * @isNullable true
     * @Length 10
     * @Scale 0
     * @DefaultValue 0
     * @isAutoIncrement false
     * @isIdentity false
     * @isStringColumn false
     * @isBLOBColumn false
     * @isJDBCDateColumn false
     * @isJDBCTimeColumn false
     * @JdbcTypeName INTEGER
     * @JdbcType 4
     */
    private Integer downcounts;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.username
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName username
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
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_files.delete_flg
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName delete_flg
     * @ActualColumnRemarks 
     * @ActualTypeName CHAR
     * @isNullable true
     * @Length 1
     * @Scale 0
     * @DefaultValue 0
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
     * This field corresponds to the database column t_files.create_time
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName create_time
     * @ActualColumnRemarks 
     * @ActualTypeName DATETIME
     * @isNullable true
     * @Length 19
     * @Scale 0
     * @DefaultValue CURRENT_TIMESTAMP
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
     * This field corresponds to the database column t_files.create_user_id
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
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
     * This field corresponds to the database column t_files.update_time
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
     * @TableRemarks 
     * @ActualColumnName update_time
     * @ActualColumnRemarks 
     * @ActualTypeName DATETIME
     * @isNullable true
     * @Length 19
     * @Scale 0
     * @DefaultValue CURRENT_TIMESTAMP
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
     * This field corresponds to the database column t_files.update_user_id
     *
     * @mbg.generated Sun May 12 14:45:27 JST 2024
     */
    /**
     * @TableNamet_files
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
}