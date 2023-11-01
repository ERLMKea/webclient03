package com.example.webclient03.controller;

import com.example.webclient03.model.Student;
import com.example.webclient03.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class MyController {

    @Autowired
    MyService myService;

    @GetMapping("/data")
    public Mono<String> getData() {
        Mono<String> res = myService.fetchHello();
        return res;
    }

    @GetMapping("/students")
    public Mono<List<Student>> getStudents() {
        Mono<List<Student>> res = myService.fetchStudents();
        return res;
    }


}