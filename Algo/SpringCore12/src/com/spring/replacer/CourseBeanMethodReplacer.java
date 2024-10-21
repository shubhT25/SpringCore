package com.spring.replacer;

import com.spring.beans.Course;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.lang.reflect.Method;

public class CourseBeanMethodReplacer implements MethodReplacer, ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
        // Fetch a new instance of PrototypeBean from the application context
        return applicationContext.getBean(Course.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }
}
