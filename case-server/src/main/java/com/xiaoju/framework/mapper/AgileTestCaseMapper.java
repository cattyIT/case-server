package com.xiaoju.framework.mapper;

import com.xiaoju.framework.entity.persistent.AgileTestCase;
import com.xiaoju.framework.entity.persistent.TestCase;
import org.springframework.stereotype.Repository;

/**
 * 用例映射
 *
 * @author cattyIT
 * @date 2022/01/13
 * @see TestCase
 */
@Repository
public interface AgileTestCaseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgileTestCase record);

    int insertSelective(AgileTestCase record);

    AgileTestCase selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgileTestCase record);

    int updateByPrimaryKey(AgileTestCase record);
}