package com.cyx.spring.springboot._05_freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springboot")
public class FreemarkerController {

    @RequestMapping("/helloFreemarker")
    public String helloFreemarker(Model model) {
        model.addAttribute("msg", "Hello FreeMarker!!!");
        return "/01_helloFreemarker/helloFreemarker";
    }
}
