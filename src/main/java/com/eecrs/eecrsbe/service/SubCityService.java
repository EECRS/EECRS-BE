package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.SubCity;

import java.util.List;

public interface SubCityService {

    SubCity findById(Integer id);
    List<SubCity> findByCity(City city);
}
