package com.semicolon.africa.task_zero.Controller;

import com.semicolon.africa.task_zero.Response.ApiResponse;
import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
@CrossOrigin(origins = "*")
class ApiController {


    @GetMapping("/api")
    public ApiResponse getInfo() {
        String email = "Stanleyugoo5@gmail.com";
        String githubUrl = "https://github.com/Mr-Stanley/Hng-Task_zero-";
        String currentDatetime = Instant.now().toString();

        ApiResponse response = new ApiResponse();

        response.setEmail(email);
        response.setGithub_url(githubUrl);
        response.setCurrent_datetime(currentDatetime);

        return response;
    }
}
