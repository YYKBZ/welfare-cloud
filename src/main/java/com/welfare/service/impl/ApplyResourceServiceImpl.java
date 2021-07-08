package com.welfare.service.impl;

import com.welfare.entity.ApplyResource;
import com.welfare.mapper.ApplyResourceMapper;
import com.welfare.service.ApplyResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ApplyResourceServiceImpl implements ApplyResourceService {

    @Autowired
    ApplyResourceMapper applyResourceMapper;

    public List<ApplyResource> selectAllApplyResource() {
        return applyResourceMapper.selectAllApplyResource();
    }

    public Integer updateFirstState(ApplyResource applyResource) {

        return applyResourceMapper.updateFirstState(applyResource);
    }

    public Integer updateSecondState(ApplyResource applyResource) {
        Integer integer = applyResourceMapper.updateSecondState(applyResource);

        return integer;
    }

    public List<ApplyResource> selectDateAndState(ApplyResource applyResource) {
        return applyResourceMapper.selectDateAndState(applyResource);
    }
}
