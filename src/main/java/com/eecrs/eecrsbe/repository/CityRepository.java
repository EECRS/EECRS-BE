package com.eecrs.eecrsbe.repository;

import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City,Integer> {
    List<City> findAllByZone(Zone zone);
}
