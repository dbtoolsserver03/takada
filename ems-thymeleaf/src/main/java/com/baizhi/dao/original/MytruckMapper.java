package com.baizhi.dao.original;

import com.baizhi.entity.original.Mytruck;
import com.baizhi.entity.original.MytruckExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MytruckMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    long countByExample(MytruckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int deleteByExample(MytruckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int insert(Mytruck row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int insertSelective(Mytruck row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    List<Mytruck> selectByExample(MytruckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    Mytruck selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByExampleSelective(@Param("row") Mytruck row, @Param("example") MytruckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByExample(@Param("row") Mytruck row, @Param("example") MytruckExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByPrimaryKeySelective(Mytruck row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table mytruck
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByPrimaryKey(Mytruck row);
}