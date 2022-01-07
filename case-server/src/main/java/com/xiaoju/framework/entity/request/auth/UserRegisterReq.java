package com.xiaoju.framework.entity.request.auth;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * Created by didi on 2021/4/22.
 */
@ApiModel(value = "用户注册接口实体类", description = "请求类")
@Data
public class UserRegisterReq {
    @ApiModelProperty(value="username", example="muxue",required=true)
    private String username;
    @ApiModelProperty(value="password", example="123456",required=true)
    private String password;
}
