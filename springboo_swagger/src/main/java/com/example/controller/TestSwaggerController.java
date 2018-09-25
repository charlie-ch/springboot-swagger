package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@Api(value="/test", tags="测试接口模块")
@RestController
@RequestMapping("/test")
public class TestSwaggerController {
    @ApiOperation(value="展示首页信息", notes = "展示首页信息")
    @GetMapping("/show")
    public Object showInfo(){
        return "hello world";
    }

    
    @ApiOperation(value="添加用户信息", notes = "添加用户信息")
    @ApiImplicitParams({
    	@ApiImplicitParam(name="username", value="用户名", required = true, dataType = "String"),
    	@ApiImplicitParam(name="password", value="密码", required = true, dataType = "String")
    })
    @PostMapping("/addUser")
    public Object addUser(String username,String password){
        return "success";
    }
}