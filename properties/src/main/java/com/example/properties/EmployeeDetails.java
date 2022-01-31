package com.example.properties;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Data
@Slf4j
@PropertySource(value = "employee.properties")
@ConfigurationProperties(prefix = "emp")
@Configuration
public class EmployeeDetails {
    private int id;
    private String empName;
    private int salary;
}
