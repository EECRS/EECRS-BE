package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.Zone;
import com.eecrs.eecrsbe.repository.CityRepository;
import com.eecrs.eecrsbe.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    private CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository){
        this.cityRepository=cityRepository;
    }

    @Override
    public City findById(Integer id) {
        return null;
    }

    @Override
    public List<City> findByZone(Zone zone) {
        return null;
    }
}
