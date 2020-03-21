package com.eecrs.eecrsbe.repository;

import com.eecrs.eecrsbe.entity.Location;
import com.eecrs.eecrsbe.entity.Woreda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocationRepository extends JpaRepository<Location,Integer> {
    List<Location> findAllByWoreda(Woreda woreda);

    Location findByLongitudeAndLatitude(String longitude, String latitude);

}
