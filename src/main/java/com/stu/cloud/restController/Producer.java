package com.stu.cloud.restController;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * create by dely on 2019-09-09
 */

@RestController
public class Producer {

    @GetMapping("/test")
    public ResponseEntity test() {
        return ResponseEntity.ok("this test is success !");
    }
}
