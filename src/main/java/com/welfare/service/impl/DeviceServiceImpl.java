package com.welfare.service.impl;

import com.github.pagehelper.PageHelper;
import com.welfare.entity.Device;
import com.welfare.mapper.DeviceMapper;
import com.welfare.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    @Autowired
    private DeviceMapper deviceMapper;

    public List<Device> selectPageDevice(int page, int size) {
        PageHelper.startPage(page,size);
        List<Device> devices = deviceMapper.selectPageDevice(page, size);
        return devices;
    }

    public Integer addDevice(Device device) {
        return deviceMapper.addDevice(device);
    }

    public Integer delDevice(Device device) {
        return deviceMapper.delDevice(device);
    }

    public Integer updateDevice(Device device) {
        return deviceMapper.updateDevice(device);
    }

    public Device selectById(Integer deviceId) {
        return deviceMapper.selectById(deviceId);
    }
}
