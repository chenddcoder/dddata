package com.chenddcoder.dddata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cglib.core.ClassGenerator;
import org.springframework.cglib.core.DefaultGeneratorStrategy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.Serializable;
import java.lang.reflect.Method;

@RestController
@RequestMapping("data")
public class DataController {
    Logger logger= LoggerFactory.getLogger(DataController.class);
    @RequestMapping(value = "save",consumes = "application/json",produces = "application/json")
    @ResponseBody
    public Object save(@RequestBody String jsonStr){
        logger.info(jsonStr);
        return null;
    }

}
