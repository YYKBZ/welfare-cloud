package com.welfare.controller;

import com.welfare.entity.ApplyResource;
import com.welfare.entity.StatusCode;
import com.welfare.service.ApplyResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.text.ParseException;
import java.util.List;

/***
 * (3)审批管理
 * 2021/7/5
 */
@Controller
@RequestMapping("/apply")
public class ApplyResourceController {

    @Autowired
    ApplyResourceService applyResourceService;

    @GetMapping("/all")
    public ModelAndView selectAllApply(ModelAndView modelAndView) {
        List<ApplyResource> applyResources = applyResourceService.selectAllApplyResource();
        modelAndView.addObject("apply",applyResources);
        modelAndView.setViewName("member-list");
        return modelAndView;
    }

    @PostMapping("/firstState")
    public String updateFirstState(@RequestBody ApplyResource applyResource) {
        Integer integer = applyResourceService.updateFirstState(applyResource);
        System.out.println(integer);
        if (integer == 1) {
            return StatusCode.OK;
        } else {
            return StatusCode.error;
        }
    }

    @PostMapping("/secondState")
    public String updateSecondState(ApplyResource applyResource) {
        Integer integer = applyResourceService.updateSecondState(applyResource);
        System.out.println(integer);
        if (integer == 1) {
            return StatusCode.OK;
        } else {
            return StatusCode.error;
        }
    }

    @PostMapping("/dateAndState")
    public List<ApplyResource> selectDateAndState(@RequestBody ApplyResource applyResource) throws ParseException {
        return applyResourceService.selectDateAndState(applyResource);
    }
}
