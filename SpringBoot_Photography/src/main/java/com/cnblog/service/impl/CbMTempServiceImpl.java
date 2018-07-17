package com.cnblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnblog.mapper.CbMTempMapper;
import com.cnblog.model.CbMTempModule;
import com.cnblog.service.ICbMTempService;

@Service("CbMTempService")
public class CbMTempServiceImpl implements ICbMTempService {

    @Autowired
    private CbMTempMapper cbMTempMapper;

    @Override
    public List<CbMTempModule> selectAll() {
        List<CbMTempModule> selectAll = cbMTempMapper.selectAll();
        return selectAll;
    }

}
