package org.example.lab6gtics.repository;

import org.example.lab6gtics.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository<Location, Long> {
}
