package com.yygh.service_hosp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResController {
    @RequestMapping("/login")
    public String clsj() {
        return "hello-world";

    }
}
