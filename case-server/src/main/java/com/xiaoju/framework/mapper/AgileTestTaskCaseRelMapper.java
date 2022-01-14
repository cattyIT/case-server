package com.xiaoju.framework.mapper;

import com.xiaoju.framework.entity.persistent.AgileTestTaskCaseRel;
import com.xiaoju.framework.entity.persistent.TestCase;
import org.springframework.stereotype.Repository;

/**
 * 用例和task关系映射
 *
 * @author cattyIT
 * @date 2022/01/13
 * @see TestCase
 */
@Repository
public interface AgileTestTaskCaseRelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AgileTestTaskCaseRel record);

    int insertSelective(AgileTestTaskCaseRel record);

    AgileTestTaskCaseRel selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AgileTestTaskCaseRel record);

    int updateByPrimaryKey(AgileTestTaskCaseRel record);
}