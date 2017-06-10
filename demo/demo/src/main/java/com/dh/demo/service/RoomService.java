package com.dh.demo.service;

import com.dh.demo.domain.Room;

import com.dh.demo.repository.RoomRepository;
import com.dh.demo.web.RoomController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Alavi on 10/06/2017.
 */
@Service
public class RoomService {
    @Autowired
    private RoomRepository romRepository;

    public List<Room> getAllRoms()
    {
      return   romRepository.findAll();
    }

    public  void addRom(RoomController.RoomRequestDTO roomRequestDTO){

        Room newRoom = new Room();
        newRoom.setCode(roomRequestDTO.getCode());
        newRoom.setCapacity(roomRequestDTO.getCapacity());
        romRepository.save(newRoom);
    }
}
