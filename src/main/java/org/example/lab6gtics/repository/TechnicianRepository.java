package org.example.lab6gtics.repository;

import org.example.lab6gtics.entity.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician, Integer> {
}
