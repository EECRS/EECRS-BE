package com.eecrs.eecrsbe.repository;

import com.eecrs.eecrsbe.entity.Region;
import com.eecrs.eecrsbe.entity.Zone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZoneRepository extends JpaRepository<Zone,Integer> {

    List<Zone> findByRegion(Region region);
}
