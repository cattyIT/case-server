package com.xiaoju.framework.entity.persistent;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("agile_test_task")
public class AgileTestTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 创建的任务名称
     */
    private String name;

    /**
     * 创建人的用户ID
     */
    private Integer createUserId;

    /**
     * 该task的用例总量
     */
    private Integer caseCount;

    /**
     * 任务备注信息
     */
    private String remark;

    /**
     * 任务类型
     */
    private Byte taskType;

    /**
     * 任务状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 命令脚本
     */
    @TableField(exist = false)
    private String testCommand;
}