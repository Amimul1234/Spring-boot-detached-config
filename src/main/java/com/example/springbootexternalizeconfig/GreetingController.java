package com.example.springbootexternalizeconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @Author Amimul Ehsan
 * @Created at 10/19/21
 * @Project Spring boot externalize config
 */

@RestController
public class GreetingController {

    //Default value given as a fallback mechanism
    @Value("${my.greeting : default value}")
    private String greetingMessage;

    @Value("some static message")
    private String staticMessage;

    //List of values
    @Value("${my.list.values}")
    private List<String> listValues;

    //Key value pairs
    @Value("#{${dbValues}}")
    private Map<String, String> dbValues;

    @Autowired
    private DbSettings dbSettings;

    @GetMapping("greeting")
    public String greeting() {
        return dbSettings.getHost();
    }
}
