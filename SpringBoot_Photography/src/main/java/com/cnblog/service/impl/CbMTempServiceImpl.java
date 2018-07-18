package com.cnblog.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnblog.mapper.CbMTempMapper;
import com.cnblog.model.CbMTempModel;
import com.cnblog.service.ICbMTempService;

@Service("CbMTempService")
public class CbMTempServiceImpl implements ICbMTempService {

    @Autowired
    private CbMTempMapper cbMTempMapper;

    @Override
    public List<CbMTempModel> selectAll() {
        List<CbMTempModel> selectAll = cbMTempMapper.selectAll();
        return selectAll;
    }

}
