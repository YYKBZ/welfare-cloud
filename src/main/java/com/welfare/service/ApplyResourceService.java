package com.welfare.service;

import com.welfare.entity.ApplyResource;
import com.welfare.mapper.ApplyResourceMapper;

import java.util.List;

public interface ApplyResourceService {

    List<ApplyResource> selectAllApplyResource();

    Integer updateFirstState(ApplyResource applyResource);

    Integer updateSecondState(ApplyResource applyResource);

    List<ApplyResource> selectDateAndState(ApplyResource applyResource);
}
