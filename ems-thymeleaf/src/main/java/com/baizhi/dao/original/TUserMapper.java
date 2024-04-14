package com.baizhi.dao.original;

import com.baizhi.entity.original.TUser;
import com.baizhi.entity.original.TUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    long countByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int deleteByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int insert(TUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int insertSelective(TUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    List<TUser> selectByExample(TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    TUser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int updateByExampleSelective(@Param("row") TUser row, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int updateByExample(@Param("row") TUser row, @Param("example") TUserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int updateByPrimaryKeySelective(TUser row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbg.generated Thu Feb 15 17:26:08 JST 2024
     */
    int updateByPrimaryKey(TUser row);
}