package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.Region;
import com.eecrs.eecrsbe.entity.Zone;

import java.util.List;

public interface ZoneService {

    Zone findById(long id);
    List<Zone> findByRegion(Region region);
}
