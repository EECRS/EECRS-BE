package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.SubCity;

import java.util.List;

public interface SubCityService {

    SubCity findById(long id);
    List<SubCity> findByCity(City city);
}
