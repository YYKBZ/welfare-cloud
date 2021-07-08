package com.welfare.entity;

/**
 * 设备信息表
 */
public class Device {
    private String deviceId;  //设备编号
    private String deviceName;//设备名称
    private String devicePic;//设备图片
    private String deviceInfo;//设备介绍
    private String deviceOwner;//设备拥有者
    private Integer deviceNum;//设备数量

    public Device() {
    }

    public Device(String deviceId, String deviceName, String devicePic, String deviceInfo, String deviceOwner, Integer deviceNum) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
        this.devicePic = devicePic;
        this.deviceInfo = deviceInfo;
        this.deviceOwner = deviceOwner;
        this.deviceNum = deviceNum;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDevicePic() {
        return devicePic;
    }

    public void setDevicePic(String devicePic) {
        this.devicePic = devicePic;
    }

    public String getDeviceInfo() {
        return deviceInfo;
    }

    public void setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
    }

    public String getDeviceOwner() {
        return deviceOwner;
    }

    public void setDeviceOwner(String deviceOwner) {
        this.deviceOwner = deviceOwner;
    }

    public Integer getDeviceNum() {
        return deviceNum;
    }

    public void setDeviceNum(Integer deviceNum) {
        this.deviceNum = deviceNum;
    }
}
