package org.launchcode.enumerableplanets.controllers;

import org.launchcode.enumerableplanets.models.Planets;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("index")
public class PlanetController {

    @GetMapping
    public String displayIndex(Model model) {

        model.addAttribute("planets", Planets.values());

        return "index";
    }
}
