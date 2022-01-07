package com.xiaoju.framework.entity.persistent;

import lombok.Data;

import java.util.Date;

@Data
public class AgileTestCase {
    private Integer id;

    private Integer stepNumber;

    private String preCondition;

    private String actions;

    private String expectedResults;

    private String remark;

    private Byte delFlag;

    private Integer createUserId;

    private Date createTime;

    private Date updateTime;

    private Integer executionType;
}