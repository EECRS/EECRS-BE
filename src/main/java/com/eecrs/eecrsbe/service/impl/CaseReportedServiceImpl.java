package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.*;
import com.eecrs.eecrsbe.service.CaseReportedService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CaseReportedServiceImpl implements CaseReportedService {
    @Override
    public CaseReported findById(long id) {
        return null;
    }

    @Override
    public List<CaseReported> findByType(CaseType caseType) {
        return null;
    }

    @Override
    public List<CaseReported> findByReportedDate(LocalDate reportedDate) {
        return null;
    }

    @Override
    public List<CaseReported> findByLocation(Location location) {
        return null;
    }

    @Override
    public List<CaseReported> findByCity(City city) {
        return null;
    }

    @Override
    public List<CaseReported> findByZone(Zone zone) {
        return null;
    }
}
