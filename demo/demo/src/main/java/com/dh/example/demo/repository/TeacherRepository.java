package com.dh.example.demo.repository;

import com.dh.example.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Alavi on 03/06/2017.
 */
public interface TeacherRepository extends MongoRepository<Teacher,String> {

}
