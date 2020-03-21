package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.*;
import com.eecrs.eecrsbe.service.CaseService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CaseServiceImpl implements CaseService {
    @Override
    public Case findById(long id) {
        return null;
    }

    @Override
    public List<Case> findByType(CaseType caseType) {
        return null;
    }

    @Override
    public List<Case> findByReportedDate(LocalDate reportedDate) {
        return null;
    }

    @Override
    public List<Case> findByLocation(Location location) {
        return null;
    }

    @Override
    public List<Case> findByCity(City city) {
        return null;
    }

    @Override
    public List<Case> findByZone(Zone zone) {
        return null;
    }
}
