package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.Zone;
import com.eecrs.eecrsbe.service.CityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {
    @Override
    public City findById(long id) {
        return null;
    }

    @Override
    public List<City> findByZone(Zone zone) {
        return null;
    }
}
