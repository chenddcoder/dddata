package com.chenddcoder.dddata;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.BeanProperty;
import org.springframework.cglib.beans.BeanGenerator;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * 管理所有bean，所有的bean需要有唯一名称
 */
public class DDBeanManager {
    private static Map <String,Object> beanMap;
    /**
     * 添加bean
     */
    public static Object addBean(String name, List<DDBeanProperty> beanPropertyList) throws ClassNotFoundException {
        Object bean = createBean(beanPropertyList);
        beanMap.put(name,bean);
        return bean;
    }
    /**
     * 创建bean
     */
    public static Object createBean(List<DDBeanProperty> beanPropertyList) throws ClassNotFoundException {
        BeanGenerator beanGenerator=new BeanGenerator();
        for (DDBeanProperty property:beanPropertyList){
            beanGenerator.addProperty(property.getName(),Class.forName(property.getType()));
        }
        return beanGenerator.create();
    }
}
