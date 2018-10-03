package com.jpa.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@SpringBootApplication
public class Demo1Application {

    public static void main(String[] args) throws SQLException {
        SpringApplication.run(Demo1Application.class, args);
    }
}
