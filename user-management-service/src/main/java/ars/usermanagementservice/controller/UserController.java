package ars.usermanagementservice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserController {

    @GetMapping(value = "/get-username")
    public ResponseEntity<Object> getUser(){
        log.info("starting execute get dummy user");
        return new ResponseEntity<>("get-user-dummy", HttpStatus.OK);
    }


}
