package com.eecrs.eecrsbe.service.impl;

import com.eecrs.eecrsbe.entity.*;
import com.eecrs.eecrsbe.repository.CaseReportedRepository;
import com.eecrs.eecrsbe.service.CaseReportedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CaseReportedServiceImpl implements CaseReportedService {

    private CaseReportedRepository caseReportedRepository;

    @Autowired
    public CaseReportedServiceImpl(CaseReportedRepository caseReportedRepository){
        this.caseReportedRepository=caseReportedRepository;
    }

    @Override
    public CaseReported findById(Integer id) {
        return caseReportedRepository.getOne(id);
    }

    @Override
    public List<CaseReported> findByType(CaseType caseType) {
        return caseReportedRepository.findAllByType(caseType);
    }

    @Override
    public List<CaseReported> findByReportedDate(LocalDate reportedDate) {
        return caseReportedRepository.findAllByReportedDate(reportedDate);
    }

    @Override
    public List<CaseReported> findByLocation(Location location) {
        return caseReportedRepository.findAllByLocation(location);
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
