package com.eric.serviceFeign;

import org.springframework.stereotype.Component;

/**
 * Created by xiaog on 2018/6/20.
 */

@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
