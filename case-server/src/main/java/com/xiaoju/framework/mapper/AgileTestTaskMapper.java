package com.xiaoju.framework.mapper;

import com.xiaoju.framework.entity.persistent.AgileTestTask;
import com.xiaoju.framework.entity.persistent.TestCase;
import org.springframework.stereotype.Repository;

/**
 * 用例task映射
 *
 * @author cattyIT
 * @date 2022/01/13
 * @see TestCase
 */
@Repository
public interface AgileTestTaskMapper  {
    int deleteByPrimaryKey(Integer id);

    int insert(AgileTestTask record);

    int insertSelective(AgileTestTask record);

    AgileTestTask selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgileTestTask record);

    int updateByPrimaryKeyWithBLOBs(AgileTestTask record);

    int updateByPrimaryKey(AgileTestTask record);
}