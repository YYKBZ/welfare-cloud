package com.welfare.entity;

/**
 * 场地信息表
 */
public class Place {
    private String placeId;//场地编号
    private String placeName;//场地名称
    private Double placeArea;//场地面积
    private Integer placePeoples;//场地容纳人数
    private String typeId;//场地类型
    private String placePic;//场地图片
    private String placeInfo;//场地说明
    private String placeState;//场地状态

    public Place() {
    }

    public Place(String placeName, Double placeArea, Integer placePeoples, String typeId, String placePic, String placeInfo, String placeState) {
        this.placeName = placeName;
        this.placeArea = placeArea;
        this.placePeoples = placePeoples;
        this.typeId = typeId;
        this.placePic = placePic;
        this.placeInfo = placeInfo;
        this.placeState = placeState;
    }

    public Place(String placeId, String placeName, Double placeArea, Integer placePeoples, String typeId, String placePic, String placeInfo, String placeState) {
        this.placeId = placeId;
        this.placeName = placeName;
        this.placeArea = placeArea;
        this.placePeoples = placePeoples;
        this.typeId = typeId;
        this.placePic = placePic;
        this.placeInfo = placeInfo;
        this.placeState = placeState;
    }

    public String getPlaceId() {
        return placeId;
    }

    public void setPlaceId(String placeId) {
        this.placeId = placeId;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public Double getPlaceArea() {
        return placeArea;
    }

    public void setPlaceArea(Double placeArea) {
        this.placeArea = placeArea;
    }

    public Integer getPlacePeoples() {
        return placePeoples;
    }

    public void setPlacePeoples(Integer placePeoples) {
        this.placePeoples = placePeoples;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getPlacePic() {
        return placePic;
    }

    public void setPlacePic(String placePic) {
        this.placePic = placePic;
    }

    public String getPlaceInfo() {
        return placeInfo;
    }

    public void setPlaceInfo(String placeInfo) {
        this.placeInfo = placeInfo;
    }

    public String getPlaceState() {
        return placeState;
    }

    public void setPlaceState(String placeState) {
        this.placeState = placeState;
    }
}
