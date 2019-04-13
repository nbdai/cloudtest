package com.dzl.cloudprovider3.controller;

import com.dzl.cloudapi.entitys.Dept;
import com.dzl.cloudprovider3.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("dept/insert")
    public boolean insert(@RequestBody Dept dept){
        return  deptService.insertSelective(dept);
    }

    @GetMapping("dept/get/{id}")
    public Dept get(@PathVariable("id")Integer id){
        return  deptService.selectByPrimaryKey(id);
    }
}
