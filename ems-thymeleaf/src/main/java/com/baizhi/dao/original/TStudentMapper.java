package com.baizhi.dao.original;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.baizhi.entity.original.TStudent;
import com.baizhi.entity.original.TStudentExample;

public interface TStudentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    long countByExample(TStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int deleteByExample(TStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int deleteByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int insert(TStudent row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int insertSelective(TStudent row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    List<TStudent> selectByExample(TStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    TStudent selectByPrimaryKey(Integer studentId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int updateByExampleSelective(@Param("row") TStudent row, @Param("example") TStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int updateByExample(@Param("row") TStudent row, @Param("example") TStudentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int updateByPrimaryKeySelective(TStudent row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student
     *
     * @mbg.generated Sun May 12 16:12:58 JST 2024
     */
    int updateByPrimaryKey(TStudent row);
}