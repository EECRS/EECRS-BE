package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.SubCity;
import com.eecrs.eecrsbe.entity.Woreda;

import java.util.List;

public interface WoredaService {

    Woreda findById(Integer id);
    List<Woreda> findBySubCity(SubCity subCity);

}
