package com.example.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Configuration
@PropertySource(value = "department.yml", factory = YamlPropertyLoaderFactory.class)
public class Department {
    @Value("${department.name}")
    private String departmentName;
    @Value("${department.branch}")
    private String branch;
    @Value("${department.contactNum}")
    private String contactNum;

    public void delivery() {
        log.info("Department Name:{}", departmentName);
        log.info("Department Branch:{}", branch);
        log.info("Department Contact number:{}", contactNum);
    }
}
