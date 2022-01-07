package com.xiaoju.framework.mapper;

import com.xiaoju.framework.entity.persistent.AgileTestCase;

public interface AgileTestCaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgileTestCase record);

    int insertSelective(AgileTestCase record);

    AgileTestCase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgileTestCase record);

    int updateByPrimaryKey(AgileTestCase record);
}