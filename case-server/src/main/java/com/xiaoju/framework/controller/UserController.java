package com.xiaoju.framework.controller;

import com.xiaoju.framework.entity.request.auth.UserLoginReq;
import com.xiaoju.framework.entity.request.auth.UserRegisterReq;
import com.xiaoju.framework.entity.response.controller.Response;
import com.xiaoju.framework.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by didi on 2021/4/22.
 */
@Api(tags = "用户管理模块")
@CrossOrigin
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Resource
    UserService userService;
    /**
     * 用户注册
     * @param req
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("用户注册接口")
    @PostMapping("/register")
    public Response<?> register(@RequestBody UserRegisterReq req, HttpServletRequest request, HttpServletResponse response) {
        return Response.success(userService.register(req,request,response));
    }

    /**
     * 用户登录
     * @param req
     * @param request
     * @param response
     * @return
     */
    @ApiOperation("用户登录接口")
    @PostMapping("/login")
    public Response<?> login(@RequestBody UserLoginReq req, HttpServletRequest request, HttpServletResponse response) {
        return Response.success(userService.login(req,request,response));
    }

    @ApiOperation("用户退出接口")
    @PostMapping("/quit")
    public Response<?> logout(HttpServletRequest request,HttpServletResponse response) {
        return Response.success(userService.logout(request, response));
    }
}
