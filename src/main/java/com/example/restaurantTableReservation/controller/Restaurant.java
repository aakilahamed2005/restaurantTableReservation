package com.example.restaurantTableReservation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Restaurant {
    @GetMapping("/restaurant")
    @ResponseBody
    public String restaurant(){
        return "Restaurant";
    }
}
