package com.dzl.cloudconsumer.controller;

import com.dzl.cloudapi.entitys.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {
    private static final  String  PRIFIX_URL = "http://CLOUDPROVIDER-DEPT/";
    @Autowired
    private RestTemplate restTemplate;
    @PostMapping("consumer/add")
    public boolean add(@RequestBody Dept dept){
        return restTemplate.patchForObject(PRIFIX_URL+"dept/insert",dept,Boolean.class);
    }
    @GetMapping("consumer/get/{id}")
    public Dept get(@PathVariable("id")Integer id){
        return restTemplate.getForObject(PRIFIX_URL+"dept/get/"+id,Dept.class);
    }
}
