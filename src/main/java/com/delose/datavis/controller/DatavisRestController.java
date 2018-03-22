package com.delose.datavis.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.delose.datavis.model.Circle;

@RestController
public class DatavisRestController {

    /*
     * commented to avoid overriding the home page / index.html
     */
//    @RequestMapping("/")
//    public String randomGreeting() {
//        return "Hi";
//    }

    @RequestMapping("/int")
    public int intN() {
        return 1;
    }

    @GetMapping("/json")
    @ResponseBody
    public Circle circle(@RequestParam(name="radius", required=false, defaultValue="1") int radius) {
        return new Circle(radius);
    }

}
