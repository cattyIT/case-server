package com.xiaoju.framework.mapper;

import com.xiaoju.framework.entity.persistent.AgileTestTaskCaseRel;

public interface AgileTestTaskCaseRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgileTestTaskCaseRel record);

    int insertSelective(AgileTestTaskCaseRel record);

    AgileTestTaskCaseRel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgileTestTaskCaseRel record);

    int updateByPrimaryKey(AgileTestTaskCaseRel record);
}