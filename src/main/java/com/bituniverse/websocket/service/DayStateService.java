package com.bituniverse.websocket.service;

import com.bituniverse.websocket.entity.DayState;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author: autogeneration
 * @date: 2019-01-04 20:32:20
 **/ 
public interface DayStateService {
    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    int insert(DayState record);

    /**
     * 添加
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    int insertSelective(DayState record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    int updateByPrimaryKey(DayState record);

    /**
     * 更新
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    int updateByPrimaryKeySelective(DayState record);

    /**
     * 删除
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    int deleteByPrimaryKey(Integer id);

    /**
     * 按主键查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    DayState selectByPrimaryKey(Integer id);

    /**
     * 条件查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    List<DayState> selectAll(Map<Object, Object> param);

    /**
     * 分页查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    List<DayState> selectPaging(Map<Object, Object> param);

    /**
     * 统计查询
     * 
     * @author: autogeneration
     * @date: 2019-01-04 20:32:20
     **/ 
    int selectCount(Map<Object, Object> param);

    void saveOrUpdate(DayState dayState);
}