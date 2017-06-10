package com.dh.demo.repository;

import com.dh.demo.domain.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Alavi on 10/06/2017.
 */
public interface SuscriptionRepository  extends MongoRepository<Teacher, String> {
}
