package com.welfare.service;

import com.welfare.entity.Device;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface DeviceService {

    /***
     * 设备信息列表-A101
     * 以分页列表的形式显示现有设备信息。
     */

    List<Device> selectPageDevice(int page, int size);

    /***
     * 添加设备信息-A102
     * 向数据库中添加设备信息并将设备图片上传至系统。
     */
    Integer addDevice(Device device);

    /***
     * 移除设备信息-A103
     * 将设备信息以及设备相关图片资料从系统中移除。
     */
    Integer delDevice(Device device);

    /***
     * 修改设备信息-A104
     * 修改设备信息并更正设备图片。
     */
    Integer updateDevice(Device device);

    /***
     * 设备详情信息-A105
     * 显示指定设备的详情信息（包括文字信息与图片信息）
     */
    Device selectById(Integer deviceId);
}
