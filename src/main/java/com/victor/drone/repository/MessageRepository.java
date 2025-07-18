package com.victor.drone.repository;

import com.victor.drone.model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByDroneId(Long droneId);
}
