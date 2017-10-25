package ru.easyjava.spring.boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Greeter {
    @Autowired
    private Target target;
    public String get() {
        return String.format("Hello, %s!", target.get());
    }
}
