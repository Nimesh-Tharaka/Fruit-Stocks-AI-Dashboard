package com.example.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {

    @GetMapping("/")
    public String index() {
        return "Fruit Stocks API is running 🚀 Use /api/v1/stocks, /api/v1/kpis, /api/v1/summarize";
    }
}
