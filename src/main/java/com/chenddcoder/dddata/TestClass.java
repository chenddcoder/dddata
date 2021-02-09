package com.chenddcoder.dddata;

import com.alibaba.fastjson.JSON;
import org.springframework.cglib.beans.BeanGenerator;
import org.springframework.cglib.beans.BeanMap;

import java.io.Serializable;
import java.lang.reflect.Method;
public class TestClass {
    public void test(){
        System.out.println("hello world");
    }
    public static void main(String[] args) throws ClassNotFoundException {
        BeanGenerator beanGenerator=new BeanGenerator();
        beanGenerator.addProperty("id",Class.forName("java.lang.Long"));
        Object o = beanGenerator.create();
        String name = o.getClass().getName();
        System.out.println("Show all methods");
        Method[] methods = o.getClass().getDeclaredMethods();
        for(Method method : methods) {
            System.out.println(">> " + method.getName());
        }
        String data="{'id':123}";
        Object parse = JSON.parseObject(data, Class.forName(name));
        Long id = (Long)getValue(parse, "id");
        System.out.println(id);

    }
    private static Object getValue(Object obj, String property) {
        BeanMap beanMap = BeanMap.create(obj);
        return beanMap.get(property);
    }

}

