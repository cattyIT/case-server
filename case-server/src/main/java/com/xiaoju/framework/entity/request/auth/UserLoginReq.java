package com.xiaoju.framework.entity.request.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by didi on 2021/4/22.
 */
@ApiModel(value = "用户登录接口实体类", description = "请求类")
@Data
public class UserLoginReq {
    @ApiModelProperty(value = "用户名称", example = "username", required = true)
    private String username;
    @ApiModelProperty(value = "用户密码", example = "password", required = true)
    private String password;
}
