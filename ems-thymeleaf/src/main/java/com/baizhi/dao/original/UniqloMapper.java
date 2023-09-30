/*
*
* UniqloMapper.java
* Copyright(C) 2010-2030 saisk
* @date 2023-09-30
*/
package com.baizhi.dao.original;

import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.original.UniqloExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UniqloMapper {
    /**
     *
     * @mbg.generated 2023-09-30
     */
    long countByExample(UniqloExample example);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int deleteByExample(UniqloExample example);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int insert(Uniqlo row);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int insertSelective(Uniqlo row);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    List<Uniqlo> selectByExample(UniqloExample example);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    Uniqlo selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int updateByExampleSelective(@Param("row") Uniqlo row, @Param("example") UniqloExample example);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int updateByExample(@Param("row") Uniqlo row, @Param("example") UniqloExample example);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int updateByPrimaryKeySelective(Uniqlo row);

    /**
     *
     * @mbg.generated 2023-09-30
     */
    int updateByPrimaryKey(Uniqlo row);
}