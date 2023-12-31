package com.baizhi.dao.original;

import com.baizhi.entity.original.Salesrecords;
import com.baizhi.entity.original.SalesrecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesrecordsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    long countByExample(SalesrecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int deleteByExample(SalesrecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int insert(Salesrecords row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int insertSelective(Salesrecords row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    List<Salesrecords> selectByExample(SalesrecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    Salesrecords selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByExampleSelective(@Param("row") Salesrecords row, @Param("example") SalesrecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByExample(@Param("row") Salesrecords row, @Param("example") SalesrecordsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByPrimaryKeySelective(Salesrecords row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table salesrecords
     *
     * @mbg.generated Sun Nov 19 11:14:02 JST 2023
     */
    int updateByPrimaryKey(Salesrecords row);
}