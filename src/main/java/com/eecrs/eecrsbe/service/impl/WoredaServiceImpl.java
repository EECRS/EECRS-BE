package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.SubCity;
import com.eecrs.eecrsbe.entity.Woreda;
import com.eecrs.eecrsbe.service.WoredaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WoredaServiceImpl implements WoredaService {
    @Override
    public Woreda findById(long id) {
        return null;
    }

    @Override
    public Woreda findByNameAndId(String name, long id) {
        return null;
    }

    @Override
    public List<Woreda> findBySubCity(SubCity subCity) {
        return null;
    }
}
