package com.baizhi.dao.original;

import com.baizhi.entity.original.Employee;
import com.baizhi.entity.original.EmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmployeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    long countByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int deleteByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int insert(Employee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int insertSelective(Employee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    List<Employee> selectByExample(EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    Employee selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int updateByExampleSelective(@Param("row") Employee row, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int updateByExample(@Param("row") Employee row, @Param("example") EmployeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int updateByPrimaryKeySelective(Employee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table employee
     *
     * @mbg.generated Sun May 26 15:04:25 JST 2024
     */
    int updateByPrimaryKey(Employee row);
}