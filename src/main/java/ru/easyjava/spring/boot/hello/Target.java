package ru.easyjava.spring.boot.hello;

import org.springframework.stereotype.Component;

@Component
public class Target {
    public String get() { return "Boot"; }
}
