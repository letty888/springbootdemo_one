package com.iking.springbootdemo_one.controller;

import com.iking.springbootdemo_one.model.Result;
import com.iking.springbootdemo_one.model.User;
import com.iking.springbootdemo_one.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@Api(tags = "用户管理相关接口")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectUserById/{UserId}")
    @ApiOperation("根据id查询用户的接口")
    @ApiImplicitParam(name = "UserId", value = "用户id", required = true)
    public Result selectUserById(@PathVariable("UserId") String UserId) {
        User user = userService.selectUserById(UserId);
        return new Result(true, "根据id查询成功", user);
    }

    @PutMapping("/updateById")
    @ApiOperation("根据id修改用户的接口")
    public Result updateById(@RequestBody User user){
        userService.updateById(user);
        return new Result(true, "根据年龄修改用户信息成功");
    }
}
