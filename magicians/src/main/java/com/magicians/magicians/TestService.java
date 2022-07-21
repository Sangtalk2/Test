package com.magicians.magicians;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {
    private final TestRepository testRepository;
    public void setTest(Test test){
        TestEntity testEntity = new TestEntity(test.getName(),test.getAge());
        testRepository.save(testEntity);
    }
    public List<TestEntity> getTest(){
        List<TestEntity> testEntityList = testRepository.findAll();
        return testEntityList;
    }
}
