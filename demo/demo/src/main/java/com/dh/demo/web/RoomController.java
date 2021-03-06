package com.dh.demo.web;

import com.dh.demo.domain.Room;
import com.dh.demo.repository.RoomRepository;
import com.dh.demo.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Alavi on 10/06/2017.
 */
@RestController
@RequestMapping("/rooms")
public class RoomController {
    @Autowired
    private RoomService roomService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Room> getAllRooms(){
        return roomService.getAllRoms();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void addStudent(@RequestBody  RoomRequestDTO roomRequestDTO){

        roomService.addRom(roomRequestDTO);
    }

    public static class RoomRequestDTO
    {
        private String code;
        private  int capacity;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public int getCapacity() {
            return capacity;
        }

        public void setCapacity(int capacity) {
            this.capacity = capacity;
        }
    }
}
