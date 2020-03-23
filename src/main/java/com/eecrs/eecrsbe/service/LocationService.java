package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.Location;
import com.eecrs.eecrsbe.entity.Woreda;

import java.util.List;

public interface LocationService {

    Location findById(Integer id);
    Location findByCoordinate(String longitude, String latitude);
    List<Location> findByWoreda(Woreda woreda);
}
