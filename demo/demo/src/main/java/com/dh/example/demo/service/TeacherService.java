package com.dh.example.demo.service;

import com.dh.example.demo.domain.Teacher;
import com.dh.example.demo.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alavi on 03/06/2017.
 */
@Service
public class TeacherService {
//injection de dependencai
    @Autowired
    private TeacherRepository teacherRepository;
    public List<Teacher> getAllTeacher(){
        //todo user repository

        List<Teacher> res= teacherRepository.findAll();
        /**
        res.add(new Teacher("is","jhonny",8778,"Ing sistemas"));
        res.add(new Teacher("is","jhonny",8778,"Ing sistemas"));
        res.add(new Teacher("is","jhonny",8778,"Ing sistemas"));
        res.add(new Teacher("is","jhonny",8778,"Ing sistemas"));
         */
        return  res;
    }


    public void addTeacher(Teacher newteacher) {
        teacherRepository.save(newteacher);
      //  teacherRepository.findOne(newteacher.getId());
      //  teacherRepository.delete(newteacher);
System.out.println( " Hola que tal ");
    }
    public  Teacher getTeacher(String id){
      return   teacherRepository.findOne(id);
    }

    public  void deleteTeacher(String id)
    {
        teacherRepository.delete(id);
    }
}
