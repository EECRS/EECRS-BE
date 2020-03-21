package com.eecrs.eecrsbe.repository;

import com.eecrs.eecrsbe.entity.SubCity;
import com.eecrs.eecrsbe.entity.Woreda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WoredaRepository extends JpaRepository<Woreda,Integer> {

    List<Woreda> findBySubCity(SubCity subCity);
}
