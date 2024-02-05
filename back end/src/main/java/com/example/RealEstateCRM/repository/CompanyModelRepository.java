package com.example.RealEstateCRM.repository;

import com.example.RealEstateCRM.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyModelRepository extends JpaRepository<Company,Long> {
}
