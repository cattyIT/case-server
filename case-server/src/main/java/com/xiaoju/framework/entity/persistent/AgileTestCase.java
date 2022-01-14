package com.xiaoju.framework.entity.persistent;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.baomidou.mybatisplus.annotation.TableName;


import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("agile_test_case")
public class AgileTestCase {
    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用例步骤数值
     */
    private Integer stepNumber;


    /**
     * 用例前置条件
     */
    private String preCondition;

    /**
     * 用例每步操作
     */
    private String actions;

    /**
     * 用例每步预期结果
     */
    private String expectedResults;

    /**
     * 用例备注
     */
    private String remark;

    /**
     * 是否删除
     */
    private Byte delFlag;

    /**
     * 创建用户ID
     */
    private Integer createUserId;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 执行类型
     */
    private Integer executionType;
}