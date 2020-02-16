package edu.baylor.ecs.endpoint.model;

import java.time.LocalDateTime;

public class TestPersonObject extends Person {
    public TestPersonObject(Integer id) {
        this.id = id;
    }

    TestPersonObject(Integer id,
                     String name,
                     Integer age,
                     String email,
                     Integer version) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.version = version;
    }
}
