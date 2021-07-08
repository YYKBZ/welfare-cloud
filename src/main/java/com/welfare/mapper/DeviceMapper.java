package com.welfare.mapper;

import com.welfare.entity.Device;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DeviceMapper {

    /***
     * 设备信息列表-A101
     * 以分页列表的形式显示现有设备信息。
     */
    @Select("select deviceName,devicePic,deviceInfo,deviceOwner,deviceNum from tb_device")
    List<Device> selectPageDevice(int page,int size);
    /***
     * 添加设备信息-A102
     * 向数据库中添加设备信息并将设备图片上传至系统。
     */
    @Insert("insert into tb_device (deviceName,devicePic,deviceInfo,deviceOwner,deviceNum) values (#{deviceName},#{devicePic},#{deviceInfo},#{deviceOwner},#{deviceNum}) ")
    Integer addDevice(Device device);

    /***
     * 移除设备信息-A103
     * 将设备信息以及设备相关图片资料从系统中移除。
     */
    @Delete("delete from tb_device where deviceId=#{deviceId}")
    Integer delDevice(Device device);

    /***
     * 修改设备信息-A104
     * 修改设备信息并更正设备图片。
     */
    @Update("update tb_device set deviceName=#{deviceName},devicePic=#{devicePic},deviceInfo=#{deviceInfo},deviceOwner=#{deviceOwner},deviceNum=#{deviceNum} where deviceId=#{deviceId}")
    Integer updateDevice(Device device);

    /***
     * 设备详情信息-A105
     * 显示指定设备的详情信息（包括文字信息与图片信息）
     */
    @Select("select deviceName,devicePic,deviceInfo,deviceOwner,deviceNum from tb_device where deviceId=#{deviceId}")
    Device selectById(Integer deviceId);
}
