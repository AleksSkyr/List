package com.example.listset.controller;

import com.example.listset.Employer;
import com.example.listset.InterfaceEmploeServ;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/employey")
public class EmployerController {
    private final InterfaceEmploeServ service;

    public EmployerController(InterfaceEmploeServ service) {
        this.service = service;
    }
    @GetMapping("/add")
    public Employer addEmployer(@RequestParam String fio,
                                @RequestParam int departament,
                                @RequestParam int salary){
       return service.add(fio,departament,salary);
    }
    @GetMapping("/remove")
    public Employer removeEmployer(@RequestParam String fio,
                                @RequestParam int departament,
                                @RequestParam int salary){
        return service.remove(fio,departament,salary);
    }
    @GetMapping("/find")
    public Employer findEmployer(@RequestParam String fio,
                                @RequestParam int departament,
                                @RequestParam int salary){
        return service.find(fio,departament,salary);
    }

    @GetMapping
    public Collection<Employer> findAll() {
        return service.findAll;
    }
}
