package com.victor.drone.controller;

import com.victor.drone.model.Drone;
import com.victor.drone.model.Message;
import com.victor.drone.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/drones")
public class DroneController {
    @Autowired
    private DroneService droneService;

    @PostMapping
    public ResponseEntity<Drone> register(@RequestBody Drone drone) {
        return ResponseEntity.ok(droneService.register(drone));
    }

    @GetMapping("/{id}/messages")
    public List<Message> getMessages(@PathVariable Long id) {
        return droneService.getMessagesForDrone(id);
    }
}
