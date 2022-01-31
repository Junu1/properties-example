package com.example.properties;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@PropertySource(value = "user.properties")
public class UserDetails {
    @Value("${user.id}")
    private int id;
    @Value("${user.name}")
    private String userName;
    @Value("${user.password}")
    private String password;

    public void userinfo() {
        log.info("User id:{}", id);
        log.info("User name:{}", userName);
        log.info("User Password:{}", password);
    }


}
