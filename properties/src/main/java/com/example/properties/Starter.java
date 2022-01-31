package com.example.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Starter implements CommandLineRunner {
    @Value("${app.name}")
    private String appName;
    @Value("${app.version}")
    private String appVersion;

    @Autowired
    private UserDetails userDetails;
    @Autowired
    private EmployeeDetails employeeDetails;
    @Autowired
    private Department department;

    @Override
    public void run(String... args) throws Exception {
        this.loadApplication();
        userDetails.userinfo();
        this.empInfo();
        department.delivery();


    }

    private void loadApplication() {
        log.info("Application Properties");
        log.info("App Name:{},App Version:{}", appName, appVersion);
    }

    private void empInfo() {
        log.info("Employee id: {}", employeeDetails.getId());
        log.info("Employee name:{}", employeeDetails.getEmpName());
        log.info("Employee salary:{}", employeeDetails.getSalary());
    }

}
