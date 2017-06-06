package com.dh.example.demo.web;

import com.dh.example.demo.domain.Teacher;
import com.dh.example.demo.service.TeacherService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.awt.*;

/**
 * Created by Alavi on 03/06/2017.
 */
@RestController
@RequestMapping("/teachers")
@Api(value="onlinestore", description="Operations pertaining to products in Online Store")
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    @RequestMapping(method = RequestMethod.GET)
    public List<Teacher>  getAllTeachers(){
        return  teacherService.getAllTeacher();

    }

    @RequestMapping(method = RequestMethod.POST)
    public  void addTeacher(@RequestBody Teacher  newteacher){
        teacherService.addTeacher(newteacher);



    }

    @RequestMapping(method = RequestMethod.GET, value = "/{Id}")
    public  Teacher getTeacher(@PathVariable String Id){
       return teacherService.getTeacher(Id);



    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{Id}")
    public  void delete(@PathVariable String Id){
        teacherService.deleteTeacher(Id);



    }

}
