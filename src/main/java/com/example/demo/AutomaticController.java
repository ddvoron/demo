package com.example.demo;

import com.example.demo.dto.RequestCommon;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("automatic")
public class AutomaticController {

    @PostMapping("reg")
    public ResponseEntity registry(@RequestBody RequestCommon request) {
        //generate and save application number for specific application
        System.out.println("called generation for app with applicationId = " + request.getApplicationId());
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("dbo")
    public ResponseEntity checkDbo(@RequestBody RequestCommon request) {
        //get dbo value from application
        boolean dbo = true;
        System.out.println("called check for dbo = " + dbo);
        return new ResponseEntity<>(dbo,HttpStatus.OK);
    }

    @PostMapping("decline")
    public ResponseEntity decline(@RequestBody RequestCommon request) {
        //save decline for application
        System.out.println("called decline");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("inform")
    public ResponseEntity inform(@RequestBody RequestCommon request) {
        //inform client with sms about decision
        System.out.println("called client informing");
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
