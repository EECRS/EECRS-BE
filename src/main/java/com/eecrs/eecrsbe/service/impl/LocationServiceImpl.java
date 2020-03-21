package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.Location;
import com.eecrs.eecrsbe.entity.Woreda;
import com.eecrs.eecrsbe.service.LocationService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    @Override
    public Location findById(long id) {
        return null;
    }

    @Override
    public Location findByCoordinate(String longitude, String latitude) {
        return null;
    }

    @Override
    public List<Location> findByWoreda(Woreda woreda) {
        return null;
    }
}
