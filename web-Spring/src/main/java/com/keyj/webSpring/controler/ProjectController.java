package com.keyj.webSpring.controler;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProjectController {
    @GetMapping("/projects")
    public String projects(Model model) {
        model.addAttribute("title", "keyj web");
        return "projects";
    }
}
