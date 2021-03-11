package com.fltprep.airportsservice.dao;

import com.fltprep.airportsservice.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface AirportDao extends JpaRepository<Airport, Long> {

    Optional<Airport> findByAirportIdent(String ident);

    Optional<Airport> findByIcaoIdent(String ident);

}
