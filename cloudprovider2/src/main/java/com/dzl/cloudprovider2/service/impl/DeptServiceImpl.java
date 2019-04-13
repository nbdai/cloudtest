package com.dzl.cloudprovider2.service.impl;

import com.dzl.cloudapi.entitys.Dept;
import com.dzl.cloudprovider2.mapper.DeptMapper;
import com.dzl.cloudprovider2.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    public Dept selectByPrimaryKey(Integer deptNo) {
       return deptMapper.selectByPrimaryKey(deptNo);
    }
    public boolean insertSelective(Dept record) {
        return deptMapper.insertSelective(record)==0?false:true;
    }
}
