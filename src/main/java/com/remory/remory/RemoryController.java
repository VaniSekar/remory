/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.remory.remory;

/**
 *
 * @author Vani Sekar
 */
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RemoryController {

    @Autowired
    IRemoryRepository remoryRepository;

    @RequestMapping("/greeting")
    public String index(@RequestParam(value = "name", required = false, defaultValue = "user") String name, Model model) {
        System.out.println("Inside greeting");
        List<Test> tests = remoryRepository.findAll();
        List<String> names = new ArrayList<>();
        for (Test test : tests) {
            names.add(test.getName());
        }

        model.addAttribute("name", "Vani");
        model.addAttribute("names", names);
        return "greeting";
    }

    @RequestMapping("/test")
    public String test() {
        return "success";
    }

    @RequestMapping("/add")
    public String add(Model model) {
        // do stuff
        System.out.println("inside add");
        model.addAttribute("add", "active");
        return "greeting";
    }

}
