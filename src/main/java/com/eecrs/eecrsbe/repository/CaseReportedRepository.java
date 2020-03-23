package com.eecrs.eecrsbe.repository;

import com.eecrs.eecrsbe.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CaseReportedRepository extends JpaRepository<CaseReported,Integer> {
    List<CaseReported> findAllByType(CaseType caseType);
    List<CaseReported> findAllByReportedDate(LocalDate reportedDate);
    List<CaseReported> findAllByLocation(Location location);

  /*  @Query("SELECT cr FROM CaseReported cr WHERE cr.location.woreda.subCity.city = ?1")
    List<CaseReported> findAllByCity(City city);

    @Query("SELECT cr FROM CaseReported cr WHERE cr.location.woreda.subCity.city.zone = ?1")
    List<CaseReported> findAllByZone(Location l);*/
}
