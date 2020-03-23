package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.SubCity;
import com.eecrs.eecrsbe.repository.SubCityRepository;
import com.eecrs.eecrsbe.service.SubCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubCityServiceImpl implements SubCityService {

    private SubCityRepository subCityRepository;

    @Autowired
    public SubCityServiceImpl(SubCityRepository subCityRepository){
        this.subCityRepository=subCityRepository;
    }

    @Override
    public SubCity findById(Integer id) {
        return subCityRepository.getOne(id);
    }

    @Override
    public List<SubCity> findByCity(City city) {
        return subCityRepository.findAllByCity(city);
    }
}
