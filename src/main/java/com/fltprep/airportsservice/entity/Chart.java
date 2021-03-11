package com.fltprep.airportsservice.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "Chart")
@Table(name = "charts")
public class Chart {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "volume")
    private String volume;

    @Column(name = "pdf_name")
    private String pdfName;

    @Column(name = "procedure_name")
    private String procedureName;

    @Column(name = "chart_type")
    private String chartType;

    @Column(name = "png_name")
    private String pngName;

    @Column(name = "cycle")
    private int cycle;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "airport_id")
    @JsonBackReference
    private Airport airport;

}
