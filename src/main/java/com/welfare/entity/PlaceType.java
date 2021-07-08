package com.welfare.entity;

/**
 * 场地类型表
 */
public class PlaceType {
    private String typeId;  //类型编号
    private String typeName; //类型名称

    public PlaceType() {
    }

    public PlaceType(String typeId, String typeName) {
        this.typeId = typeId;
        this.typeName = typeName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}
