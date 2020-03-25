package com.eecrs.eecrsbe.contoroller;

import com.eecrs.eecrsbe.entity.*;
import com.eecrs.eecrsbe.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/location")
@PreAuthorize("hasAnyRole(T(com.eecrs.eecrsbe.entity.enums.Role).ADMIN)")
public class LocationController {

    private LocationService locationService;
    private ZoneService zoneService;
    private CityService cityService;
    private SubCityService subCityService;
    private WoredaService woredaService;

    @Autowired
    public LocationController(LocationService locationService,ZoneService zoneService,CityService cityService,SubCityService subCityService,WoredaService woredaService){
        this.locationService=locationService;
        this.cityService=cityService;
        this.subCityService=subCityService;
        this.woredaService=woredaService;
        this.zoneService=zoneService;
    }

    @GetMapping("/region/zones")
    public ResponseEntity<?> getZonesByRegion(@RequestParam("regionId") Region region){
        return ResponseEntity.ok(zoneService.findByRegion(region));
    }
    @GetMapping("/region/zone/cities")
    public ResponseEntity<?>  getCityByZone(@RequestParam("zoneId") Zone zone){
        return ResponseEntity.ok(cityService.findByZone(zone));
    }

    @GetMapping("/region/zone/city/sub-cities")
    public ResponseEntity<?>  getSubCityByCity(@RequestParam("cityId") City city){
        return ResponseEntity.ok(subCityService.findByCity(city));
    }
    @GetMapping("/region/zone/city/sub-city/woreda")
    public ResponseEntity<?>  getWoredaBySubCity(@RequestParam("subCityId") SubCity subCity){
        return ResponseEntity.ok(woredaService.findBySubCity(subCity));
    }


}
