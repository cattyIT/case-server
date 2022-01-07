package com.xiaoju.framework.entity.persistent;

import lombok.Data;

import java.util.Date;

@Data
public class AgileTestTask {
    private Integer id;

    private String name;

    private Integer createUserId;

    private Integer caseCount;

    private String remark;

    private Byte taskType;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private String testCommand;
}