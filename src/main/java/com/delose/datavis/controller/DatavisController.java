package com.delose.datavis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author U51199
 *
 */
@Controller
public class DatavisController {

    @GetMapping("/welcome")
    public String welcome(@RequestParam(name="name", required=false, defaultValue="User") String name, Model model) {
        model.addAttribute("name", name);
        return "welcome/welcome";
    }

    @RequestMapping(value = "/dashboard", method = RequestMethod.GET)
    public String home(@RequestParam(name="name", required=false, defaultValue="User") String name, Model model) {
        model.addAttribute("name", name);
        return "dashboard/dashboard";
    }

}
