package com.api.parking_control.services;
import com.api.parking_control.repositories.ParkingSpotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotService {

    @Autowired
     ParkingSpotRepository parkingSpotRepository;
}
