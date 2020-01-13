package com.example.demo;

import com.example.demo.dto.RequestRegistry;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("automatic")
public class AutomaticController {

    @PostMapping("reg")
    public ResponseEntity registry(@RequestBody RequestRegistry requestRegistry) {
        //generate and save application number for specific application
        System.out.println("called generation for app with applicationId = " + requestRegistry.getApplicationId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("dbo")
    public ResponseEntity checkDbo() {
        //get dbo value from application
        boolean dbo = true;
        System.out.println("called");
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
