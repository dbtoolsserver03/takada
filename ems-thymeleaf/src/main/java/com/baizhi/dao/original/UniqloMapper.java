/*
*
* UniqloMapper.java
* Copyright(C) 2017-2020 fendo公司
* @date 2023-09-29
*/
package com.baizhi.dao.original;

import com.baizhi.entity.original.Uniqlo;
import com.baizhi.entity.original.UniqloExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UniqloMapper {
    long countByExample(UniqloExample example);

    int deleteByExample(UniqloExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Uniqlo row);

    int insertSelective(Uniqlo row);

    List<Uniqlo> selectByExample(UniqloExample example);

    Uniqlo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("row") Uniqlo row, @Param("example") UniqloExample example);

    int updateByExample(@Param("row") Uniqlo row, @Param("example") UniqloExample example);

    int updateByPrimaryKeySelective(Uniqlo row);

    int updateByPrimaryKey(Uniqlo row);
}