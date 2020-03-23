package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.SubCity;
import com.eecrs.eecrsbe.entity.Woreda;
import com.eecrs.eecrsbe.repository.WoredaRepository;
import com.eecrs.eecrsbe.service.WoredaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WoredaServiceImpl implements WoredaService {

    private WoredaRepository woredaRepository;

    @Autowired
    public WoredaServiceImpl(WoredaRepository woredaRepository){
        this.woredaRepository=woredaRepository;
    }

    @Override
    public Woreda findById(Integer id) {
        return woredaRepository.getOne(id);
    }

    @Override
    public List<Woreda> findBySubCity(SubCity subCity) {
        return woredaRepository.findBySubCity(subCity);
    }
}
