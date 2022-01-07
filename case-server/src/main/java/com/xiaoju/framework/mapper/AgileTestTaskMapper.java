package com.xiaoju.framework.mapper;

import com.xiaoju.framework.entity.persistent.AgileTestTask;

public interface AgileTestTaskMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgileTestTask record);

    int insertSelective(AgileTestTask record);

    AgileTestTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgileTestTask record);

    int updateByPrimaryKeyWithBLOBs(AgileTestTask record);

    int updateByPrimaryKey(AgileTestTask record);
}