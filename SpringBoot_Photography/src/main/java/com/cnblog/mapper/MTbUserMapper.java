package com.cnblog.mapper;

import com.cnblog.model.MTbUser;

public interface MTbUserMapper {
    int deleteByPrimaryKey(Integer rowId);

    int insert(MTbUser record);

    int insertSelective(MTbUser record);

    MTbUser selectByPrimaryKey(Integer rowId);

    int updateByPrimaryKeySelective(MTbUser record);

    int updateByPrimaryKey(MTbUser record);
}