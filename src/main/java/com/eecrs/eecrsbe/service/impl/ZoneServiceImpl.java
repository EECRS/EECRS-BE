package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.Region;
import com.eecrs.eecrsbe.entity.Zone;
import com.eecrs.eecrsbe.repository.ZoneRepository;
import com.eecrs.eecrsbe.service.ZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {

    private ZoneRepository zoneRepository;

    @Autowired
    public ZoneServiceImpl (ZoneRepository zoneRepository){
        this.zoneRepository = zoneRepository;
    }


    @Override
    public Zone findById(Integer id) {
        return zoneRepository.getOne(id);
    }

    @Override
    public List<Zone> findByRegion(Region region) {
        return zoneRepository.findByRegion(region);
    }
}
