package com.baizhi.dao.original;

import com.baizhi.entity.original.TCompany;
import com.baizhi.entity.original.TCompanyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCompanyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    long countByExample(TCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int deleteByExample(TCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int insert(TCompany row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int insertSelective(TCompany row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    List<TCompany> selectByExample(TCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    TCompany selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByExampleSelective(@Param("row") TCompany row, @Param("example") TCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByExample(@Param("row") TCompany row, @Param("example") TCompanyExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByPrimaryKeySelective(TCompany row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_company
     *
     * @mbg.generated Sun May 19 13:57:47 JST 2024
     */
    int updateByPrimaryKey(TCompany row);
}