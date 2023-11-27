package com.pr04.sbb8;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Controller
public class MainController {
    @GetMapping("/sbb8")
    @ResponseBody
    public String init() {
        return "안녕하세요";
    }
    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }


}
