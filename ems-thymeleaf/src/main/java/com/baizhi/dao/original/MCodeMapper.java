package com.baizhi.dao.original;

import com.baizhi.entity.original.MCode;
import com.baizhi.entity.original.MCodeExample;
import com.baizhi.entity.original.MCodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    long countByExample(MCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int deleteByExample(MCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int deleteByPrimaryKey(MCodeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int insert(MCode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int insertSelective(MCode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    List<MCode> selectByExample(MCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    MCode selectByPrimaryKey(MCodeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int updateByExampleSelective(@Param("row") MCode row, @Param("example") MCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int updateByExample(@Param("row") MCode row, @Param("example") MCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int updateByPrimaryKeySelective(MCode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table m_code
     *
     * @mbg.generated Sun Aug 04 17:31:22 JST 2024
     */
    int updateByPrimaryKey(MCode row);
}