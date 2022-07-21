package com.magicians.magicians;

import lombok.Getter;

@Getter
public class Test {
    private String name;
    private Long age;

    public Test(String name, Long age) {
        this.name = name;
        this.age = age;
    }



}
