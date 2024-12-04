package com.ecoride.service;

import com.ecoride.dao.VehicleDAO;
import com.ecoride.model.Vehicle;

public class VehicleService {
    private VehicleDAO vehicleDAO = new VehicleDAO();

    public boolean addVehicle(Vehicle vehicle) {
        return vehicleDAO.saveVehicle(vehicle);
    }

    public Vehicle findVehicleById(int vehicleId) {
        return vehicleDAO.getVehicleById(vehicleId);
    }
}
