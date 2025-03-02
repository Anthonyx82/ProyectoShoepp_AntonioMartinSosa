package com.antonio.store.store.config;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class GlobalController {
    @ModelAttribute("baseUrl")
    public String baseUrl() {
        return "https://anthonyx82.ddns.net/springboot";
    }
}
