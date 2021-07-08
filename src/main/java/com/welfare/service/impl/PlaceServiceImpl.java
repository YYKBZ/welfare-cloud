package com.welfare.service.impl;

import com.welfare.entity.Place;
import com.welfare.mapper.PlaceMapper;
import com.welfare.service.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlaceServiceImpl implements PlaceService{

    @Autowired
    private PlaceMapper placeMapper;

    public List<Place> selectAllPlace() {
        return placeMapper.selectAllPlace();
    }

    public Integer updatePlace(Place place) {
        return placeMapper.updatePlace(place);
    }

    public Integer insertPlace(Place place) {
        return placeMapper.insertPlace(place);
    }

    public Place selectById(Integer placeId) {
        return placeMapper.selectById(placeId);
    }

    public Integer deletePlace(Place place) {
        return placeMapper.deletePlace(place);
    }
}
