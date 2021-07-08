package com.welfare.controller;

import com.welfare.entity.Place;
import com.welfare.entity.StatusCode;
import com.welfare.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/***
 * (2)场地管理
 * 2021/7/5
 */
@Controller
@RequestMapping("/place")
public class PlaceController {
    @Autowired
    PlaceService placeService;


    @GetMapping("/all")
    public ModelAndView selectAllPlace(ModelAndView modelAndView){
        List<Place> places = placeService.selectAllPlace();
        modelAndView.addObject("place",places);
        modelAndView.setViewName("picture-list");
        return modelAndView;
    }

    @PostMapping("/insert")
    public String insertPlace(@RequestBody Place place){
        Integer integer = placeService.insertPlace(place);
        if (integer==1){
            return StatusCode.OK;
        }else {
            return StatusCode.error;
        }
    }
    @GetMapping("/{id}")
    public Place selectById(@PathVariable("id") Integer placeId){
        return placeService.selectById(placeId);
    }

    @PostMapping("/update")
    public String updatePlace(@RequestBody Place place){
        Integer integer = placeService.updatePlace(place);
        System.out.println(integer);
        if (integer==1){
            return StatusCode.OK;
        }else {
            return StatusCode.error;
        }
    }

    @PostMapping("/del")
    public String delPlace(@RequestBody Place place){
        Integer integer = placeService.deletePlace(place);
        if (integer==1){
            return StatusCode.OK;
        }else {
            return StatusCode.error;
        }
    }
}
