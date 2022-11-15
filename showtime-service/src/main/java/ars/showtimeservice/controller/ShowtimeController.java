package ars.showtimeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShowtimeController {

    @Autowired
    private RestTemplate restTemplate;

    @Value("${service.user-management-service.base-url}")
    private String userManagementUrl;

    @GetMapping
    public ResponseEntity<Object> showtime(){
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(String.format("%s/get-username", userManagementUrl), String.class);
        String username = responseEntity.getBody();

        return new ResponseEntity<>(username, HttpStatus.OK);
    }

}
