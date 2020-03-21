package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.*;

import java.time.LocalDate;
import java.util.List;

public interface CaseService {

    Case findById(long id);
    List<Case> findByType(CaseType caseType);
    List<Case> findByReportedDate(LocalDate reportedDate);
    List<Case> findByLocation(Location location);
    List<Case> findByCity(City city);
    List<Case> findByZone(Zone zone);

}
