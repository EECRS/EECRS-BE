package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.Location;
import com.eecrs.eecrsbe.entity.Woreda;
import com.eecrs.eecrsbe.repository.LocationRepository;
import com.eecrs.eecrsbe.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    private LocationRepository locationRepository;

    @Autowired
    public LocationServiceImpl(LocationRepository locationRepository){
        this.locationRepository= locationRepository;
    }

    @Override
    public Location findById(Integer id) {
        return locationRepository.getOne(id);
    }

    @Override
    public Location findByCoordinate(String longitude, String latitude) {
        return locationRepository.findByLongitudeAndLatitude(longitude,latitude);
    }

    @Override
    public List<Location> findByWoreda(Woreda woreda) {
        return locationRepository.findAllByWoreda(woreda);
    }
}
