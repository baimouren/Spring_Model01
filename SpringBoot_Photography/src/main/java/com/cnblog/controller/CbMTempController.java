package com.cnblog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cnblog.module.CbMTempModule;
import com.cnblog.service.ICbMTempService;

@RequestMapping
@RestController
public class CbMTempController {

    @Autowired
    private ICbMTempService CbMTempService;

    @RequestMapping("/search")
    public List<CbMTempModule> searchCbmTemp() {
        List<CbMTempModule> selectAll = CbMTempService.selectAll();
        return selectAll;
    }
}
