package com.dzl.cloudprovider.service;

import com.dzl.cloudapi.entitys.Dept;

public interface DeptService {
     Dept selectByPrimaryKey(Integer deptNo);
     boolean insertSelective(Dept record);
}
