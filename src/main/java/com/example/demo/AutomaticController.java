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
        return new ResponseEntity<>(dbo, HttpStatus.OK);
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

    @PostMapping("generateSms")
    public ResponseEntity generateSms(@RequestBody RequestCommon request) {
        //send client sms with generated code
        System.out.println("called client sms with code");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("compareCodes")
    public ResponseEntity compareCodes(@RequestBody RequestCommon request) {
        //get dbo value from application
        boolean areCodesTheSame = false;
        System.out.println("called comparing codes = " + areCodesTheSame);
        return new ResponseEntity<>(areCodesTheSame, HttpStatus.OK);
    }


    @PostMapping("serviceAsanId")
    public ResponseEntity callAsanServiceId(@RequestBody RequestCommon request) {
        // send request to ESB for ASAN personal document info
        System.out.println("called asan doc info");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("serviceAsanEmployment")
    public ResponseEntity serviceAsanEmployment(@RequestBody RequestCommon request) {
        // send request to ESB for ASAN person employment info
        System.out.println("called asan employment info");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("serviceAcbCreditHistory")
    public ResponseEntity serviceAcbCreditHistory(@RequestBody RequestCommon request) {
        // send request to ESB for ACB person credit history info
        System.out.println("called acb credit history info");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("brmsPrepareData")
    public ResponseEntity brmsPrepareData(@RequestBody RequestCommon request) {
        // send call prepare brms request
        System.out.println("called prepare brms request");
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping("brmsSaveDecision")
    public ResponseEntity brmsSaveDecision(@RequestBody RequestCommon request) {
        //get decision from application
        boolean decline = true;
        // send call save brms response
        System.out.println("called save brms response");
        return new ResponseEntity<>(decline, HttpStatus.OK);
    }


}