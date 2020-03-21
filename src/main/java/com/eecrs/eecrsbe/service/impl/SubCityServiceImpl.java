package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.SubCity;
import com.eecrs.eecrsbe.service.SubCityService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCityServiceImpl implements SubCityService {
    @Override
    public SubCity findById(long id) {
        return null;
    }

    @Override
    public List<SubCity> findByCity(City city) {
        return null;
    }
}
