package org.example;

import org.example.one.FooController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App {

    public static void main(String[] args) {
        FooController lkdsaf = new FooController();
        SpringApplication.run(App.class, args);
    }
}
