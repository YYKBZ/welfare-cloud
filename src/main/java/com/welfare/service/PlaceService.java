package com.welfare.service;

import com.welfare.entity.Place;

import java.util.List;

public interface PlaceService {

    List<Place> selectAllPlace();

    Integer updatePlace(Place place);

    Integer insertPlace(Place place);

    Place selectById(Integer placeId);

    Integer deletePlace(Place place);
}
