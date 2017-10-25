package ru.easyjava.spring.boot.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Greet implements ApplicationRunner{
    @Autowired
    private Greeter greeter;
    @Override public void run(ApplicationArguments applicationArguments) throws Exception {
        System.out.println(greeter.get());
    }
}
