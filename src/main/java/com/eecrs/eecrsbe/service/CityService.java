package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.Zone;

import java.util.List;

public interface CityService {

    City findById(long id);
    List<City> findByZone(Zone zone);
}
