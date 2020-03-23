package com.eecrs.eecrsbe.repository;


import com.eecrs.eecrsbe.entity.City;
import com.eecrs.eecrsbe.entity.SubCity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubCityRepository extends JpaRepository<SubCity,Integer> {

    List<SubCity> findAllByCity(City city);
}
