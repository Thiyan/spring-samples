package org.yanmakes.lms.controller.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {


    @GetMapping("/health-check")
    public String healthCheckup() {
        return "I'm running without any issues.. Happy!!";
    }
}
