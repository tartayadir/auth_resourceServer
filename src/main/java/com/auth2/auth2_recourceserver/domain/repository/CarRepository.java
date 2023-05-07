package com.auth2.auth2_recourceserver.domain.repository;

import com.auth2.auth2_recourceserver.domain.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
