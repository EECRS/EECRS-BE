package com.eecrs.eecrsbe.contoroller;

import com.eecrs.eecrsbe.entity.*;
import com.eecrs.eecrsbe.service.CaseReportedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", maxAge = 3600)
@PreAuthorize("hasAnyRole(T(com.eecrs.eecrsbe.entity.enums.Role).ADMIN)")
@RestController
@RequestMapping("/cases")
public class CaseReportedController {

    private CaseReportedService caseReportedService;

    @Autowired
    public CaseReportedController(CaseReportedService caseReportedService){
        this.caseReportedService=caseReportedService;
    }
    @GetMapping()
    public ResponseEntity<?> getAllCases(){
        return ResponseEntity.ok(caseReportedService.findAll());
    }

    @GetMapping("/region")
    public ResponseEntity<?>  getByRegion(@RequestParam("regionId") Region region ){
        return null;
    }

    @GetMapping("/region/zone")
    public ResponseEntity<?>  getByZone(@RequestParam("zoneId")Zone zone){
        return ResponseEntity.ok(caseReportedService.findByZone(zone));
    }
    @GetMapping("/region/zone/city")
    public ResponseEntity<?>  getByCity(@RequestParam("cityId")City city){
        return ResponseEntity.ok(caseReportedService.findByCity(city));
    }
    @GetMapping("/region/zone/city/sub-city")
    public ResponseEntity<?>  getBySubCity(@RequestParam("subCityId")SubCity subCity){
        return null;
    }

    @GetMapping("/region/zone/city/sub-city/woreda")
    public ResponseEntity<?>  getByWoreda(@RequestParam("woreda") Woreda woreda){
        return null;
    }

}
