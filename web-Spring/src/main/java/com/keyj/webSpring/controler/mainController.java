package com.keyj.webSpring.controler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class mainController {

    @GetMapping("/")
    public String greeting(Model model) {
        model.addAttribute("title", "keyj web");
        return "home";
    }
    @GetMapping("/faq")
    public String icon(Model model) {
        model.addAttribute("title", "keyj web");
        return "faq/faq";
    }


}