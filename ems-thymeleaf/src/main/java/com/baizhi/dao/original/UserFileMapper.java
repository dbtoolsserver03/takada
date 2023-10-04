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
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    long countByExample(UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int deleteByExample(UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int insert(UserFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int insertSelective(UserFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    List<UserFile> selectByExample(UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    UserFile selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int updateByExampleSelective(@Param("row") UserFile row, @Param("example") UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int updateByExample(@Param("row") UserFile row, @Param("example") UserFileExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int updateByPrimaryKeySelective(UserFile row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_files
     *
     * @mbg.generated Tue Oct 03 13:01:33 JST 2023
     */
    int updateByPrimaryKey(UserFile row);
}