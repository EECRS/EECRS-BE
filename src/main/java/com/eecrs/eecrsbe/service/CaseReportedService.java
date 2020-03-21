package com.eecrs.eecrsbe.service;

import com.eecrs.eecrsbe.entity.*;

import java.time.LocalDate;
import java.util.List;

public interface CaseReportedService {

    CaseReported findById(long id);
    List<CaseReported> findByType(CaseType caseType);
    List<CaseReported> findByReportedDate(LocalDate reportedDate);
    List<CaseReported> findByLocation(Location location);
    List<CaseReported> findByCity(City city);
    List<CaseReported> findByZone(Zone zone);

}
