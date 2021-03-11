package com.fltprep.airportsservice.dao;

import com.fltprep.airportsservice.entity.Chart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface ChartDao extends JpaRepository<Chart, Long> {
    Optional<Chart> findByPdfName(String pdfName);
}
