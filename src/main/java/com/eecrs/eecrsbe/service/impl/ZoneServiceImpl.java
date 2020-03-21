package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.Region;
import com.eecrs.eecrsbe.entity.Zone;
import com.eecrs.eecrsbe.service.ZoneService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZoneServiceImpl implements ZoneService {
    @Override
    public Zone findById(long id) {
        return null;
    }

    @Override
    public List<Zone> findByRegion(Region region) {
        return null;
    }
}
