package com.welfare.mapper;

import com.welfare.entity.Place;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface PlaceMapper {


    /**
     * 添加场地信息-A202
     *
     * @param place
     * @return
     */
    @Insert("insert into tb_place (placeName,placeArea,placePeoples,typeId,placePic,placeInfo,placeState) values (#{placeName},#{placeArea},#{placePeoples},#{typeId},#{placePic},#{placeInfo},#{placeState})")
    Integer insertPlace(Place place);

    /**
     * 场地信息列表-A201
     * 查询所有场地信息
     * @return
     */
    @Select("select placeId,placeName,placeArea,placePeoples,typeId,placePic,placeInfo,placeState from tb_place")
    List<Place> selectAllPlace();

    /**
     * 移除场地信息-A203
     * @return
     */
    @Update("update tb_place set placeState = 0 where placeId=#{placeId}")
    Integer deletePlace(Place place);

    /**
     * 修改场地信息-A204
     * @param place
     * @return
     */
    @Update("update tb_place set placeName=#{placeName},placeArea=#{placeArea},placePeoples=#{placePeoples},placePeoples=#{placePeoples},placePic=#{placePic},placeInfo=#{placeInfo} " +
            "where placeId=#{placeId}")
    Integer updatePlace(Place place);


    /**
     * 场地详情信息-A205
     * @param placeId
     * @return
     */
    @Select("select placeId,placeName,placeArea,placePeoples,typeId,placePic,placeInfo,placeState from tb_place where placeId=#{placeId}")
    Place selectById(Integer placeId);

    /**
     * 释放场地状态
     */
    @Update("update tb_place set placeState=1 where placeId=#{placeId}")
    Integer releasePlace(Integer placeId);
}
