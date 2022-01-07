package com.xiaoju.framework.entity.persistent;

import lombok.Data;

import java.util.Date;

@Data
public class AgileTestTaskCaseRel {
    private Integer id;

    private Integer createUserId;

    private Integer taskId;

    private Integer caseId;

    private Date createTime;

    private Date updateTime;
}