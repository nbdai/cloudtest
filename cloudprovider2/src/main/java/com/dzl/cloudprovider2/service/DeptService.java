package com.dzl.cloudprovider2.service;

import com.dzl.cloudapi.entitys.Dept;

public interface DeptService {
     Dept selectByPrimaryKey(Integer deptNo);
     boolean insertSelective(Dept record);
}
