package com.magicians.magicians.controller;


import com.magicians.magicians.Test;
import com.magicians.magicians.TestEntity;
import com.magicians.magicians.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {
    private final TestService testService;
    @PostMapping("/test")
    public void setTest(@RequestBody Test test) {
        testService.setTest(test);
    }
    @GetMapping("/test")
    public List<TestEntity> getTest() {
        return testService.getTest();
    }
}
