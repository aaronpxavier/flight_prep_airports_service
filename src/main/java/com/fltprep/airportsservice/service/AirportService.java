package com.fltprep.airportsservice.service;

import com.fltprep.airportsservice.dao.AirportDao;
import com.fltprep.airportsservice.entity.Airport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AirportService {

    @Autowired
    private AirportDao airportDao;

    public Optional<Airport> findByAirportIdent(String ident) {
        return airportDao.findByAirportIdent(ident);
    }
}
