package com.dh.demo.repository;

import com.dh.demo.domain.Room;
import com.dh.demo.domain.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Alavi on 10/06/2017.
 */
public interface RoomRepository extends MongoRepository<Room, String> {
}
