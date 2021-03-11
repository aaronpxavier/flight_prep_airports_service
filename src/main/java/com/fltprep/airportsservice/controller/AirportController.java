package com.fltprep.airportsservice.controller;

import com.fltprep.airportsservice.entity.Airport;
import com.fltprep.airportsservice.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    private AirportService airportService;

    @GetMapping("/airport-ident/{ident}")
    public ResponseEntity<Airport> findByAiportIdent(@PathVariable String ident) {
        Optional<Airport> airport = airportService.findByAirportIdent(ident.toUpperCase());
        if(!airport.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.status(HttpStatus.OK).body(airport.get());
    }

    @GetMapping("/icao-ident/{ident}")
    public ResponseEntity<Airport> findByIcaoIdent(@PathVariable String ident) {
        Optional<Airport> airport = airportService.findByIcaoIdent(ident.toUpperCase());
        if(!airport.isPresent())
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        return ResponseEntity.status(HttpStatus.OK).body(airport.get());
    }


}
