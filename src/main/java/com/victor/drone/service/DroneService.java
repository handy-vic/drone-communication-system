package com.victor.drone.service;

import com.victor.drone.model.Drone;
import com.victor.drone.model.Message;
import com.victor.drone.repository.DroneRepository;
import com.victor.drone.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DroneService {
    @Autowired
    private DroneRepository droneRepo;
    @Autowired
    private MessageRepository messageRepo;

    public Drone register(Drone drone) {
        return droneRepo.save(drone);
    }

    public List<Message> getMessagesForDrone(Long droneId) {
        return messageRepo.findByDroneId(droneId);
    }
}
