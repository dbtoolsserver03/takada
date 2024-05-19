package com.baizhi.dao.original;

import com.baizhi.entity.original.UserFile;
import com.baizhi.entity.original.UserFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserFileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    long countByExample(UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int deleteByExample(UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int insert(UserFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int insertSelective(UserFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    List<UserFile> selectByExample(UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    UserFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByExampleSelective(@Param("row") UserFile row, @Param("example") UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByExample(@Param("row") UserFile row, @Param("example") UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByPrimaryKeySelective(UserFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByPrimaryKey(UserFile row);
}