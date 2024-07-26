package com.compass.repository;

import com.compass.model.Vehicle;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.compass.model.Fuel;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    
    // Find vehicles by passenger capacity greater than a specified value
    List<Vehicle> findByPassengerCapacityGreaterThan(int capacity);

    // Find vehicles by whether they are cargo vehicles
    List<Vehicle> findByIsCargo(boolean isCargo);

    // Find vehicles by fuel type
    List<Vehicle> findByFuel(Fuel fuel);

    // Count vehicles by whether they are cargo vehicles
    long countByIsCargo(boolean isCargo);
}
