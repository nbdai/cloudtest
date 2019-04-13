package com.dzl.cloudprovider2.mapper;

import com.dzl.cloudapi.entitys.Dept;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface DeptMapper {
    int deleteByPrimaryKey(Integer deptNo);

    int insert(Dept record);

    int insertSelective(Dept record);

    Dept selectByPrimaryKey(Integer deptNo);

    int updateByPrimaryKeySelective(Dept record);

    int updateByPrimaryKey(Dept record);
}