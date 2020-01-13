package com.example.demo;

import com.example.demo.dto.RequestRegistry;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("automatic")
public class AutomaticController {

    @PostMapping("reg")
    public ResponseEntity registry(@RequestBody RequestRegistry requestRegistry) {
        //generate and save application number for specific application);
        System.out.println("called generation for app with applicationId = " + requestRegistry.getApplicationId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("dbo")
    public ResponseEntity checkDbo() {
        //get dbo value from application
        boolean dbo = true;
        System.out.println("called");
       /* ObjectMapper mapper = new ObjectMapper();
        try {
            System.out.println(mapper.readValue("{\"applicationId\": 100}", RequestRegistry.class));
            System.out.println(mapper.writeValueAsString(new RequestRegistry()));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }*/
        return new ResponseEntity<>(dbo,HttpStatus.OK);
    }

    @PostMapping("decline")
    public ResponseEntity decline() {
        //save decline for application
        boolean dbo = true;
        System.out.println("called");
        return new ResponseEntity<>(dbo,HttpStatus.OK);
    }
}
