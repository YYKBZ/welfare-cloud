package com.welfare.controller;

import com.welfare.entity.Device;
import com.welfare.entity.StatusCode;
import com.welfare.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/***
 *(1)设备管理
 * 2021/7/5
 */


@RestController
@RequestMapping("/dev")
public class DeviceController {

    @Autowired
    private DeviceService deviceService;

    @GetMapping("/{page}/{size}")
    public ModelAndView selectPageDevice(@PathVariable("page") int page, @PathVariable("size") int size ,ModelAndView modelAndView){
        List<Device> devices = deviceService.selectPageDevice(page, size);
        modelAndView.addObject("devices",devices);
        modelAndView.setViewName("product-list");
        return modelAndView;

    }


    @PostMapping("/add")
    public String addDevice(@RequestBody Device device, MultipartFile file, ModelAndView modelAndView){
        Integer integer = deviceService.addDevice(device);
        if (1==integer){
            return StatusCode.OK;
        }else {
            return StatusCode.error;
        }
    }

    @PostMapping("/del")
    public String delDevice(@RequestBody Device device){
        Integer integer = deviceService.delDevice(device);
        System.out.println(integer);
        if (1==integer){
            return StatusCode.OK;
        }else {
            return StatusCode.error;
        }
    }

    @PostMapping("/update")
    public String updateDevice(@RequestBody  Device device){
        Integer integer = deviceService.updateDevice(device);
        if (1==integer){
            return StatusCode.OK;
        }else {
            return StatusCode.error;
        }
    }

    @GetMapping("/{deviceId}")
    public Device selectById(@PathVariable("deviceId") Integer deviceId){
        return deviceService.selectById(deviceId);
    }
}
