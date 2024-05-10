package org.example.lab6gtics.repository;

import org.example.lab6gtics.entity.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device, Long> {
}
