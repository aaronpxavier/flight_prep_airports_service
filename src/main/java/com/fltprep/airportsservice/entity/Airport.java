package com.fltprep.airportsservice.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Airport")
@Table(name = "airports")
public class Airport {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long airportId;

    @Column(name = "airport_ident")
    private String airportIdent;

    @Column(name = "icao_ident")
    private String icaoIdent;

    @Column(name = "airport_name")
    private String airportName;

    @Column(name = "state")
    private String state;

    @Column(name = "city")
    private String city;

    @OneToMany(mappedBy = "airport", fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    private List<Chart> charts;
}
