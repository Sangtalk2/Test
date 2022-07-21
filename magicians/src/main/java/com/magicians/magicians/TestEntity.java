package com.magicians.magicians;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "testtable")
@Getter
@NoArgsConstructor
public class TestEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private Long age;

    public TestEntity( String name, Long age) {
        this.name = name;
        this.age = age;
    }
}
