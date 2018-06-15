package com.eric.serviceRibbon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by xiaog on 2018/6/15.
 */
@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        //return restTemplate.getForObject("http://SERVICE-HI/hi?name=" + name, String.class).toString();http://localhost:8763/hi?name=forezp
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class).toString();

    }
}
