package com.core.test;

import com.core.employee.Employee;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {
    public static void main(String[] args) {
        //Resource resource = new ClassPathResource("/com/core/Resources/applicationContext.xml");
        //BeanFactory beanFactory = new XmlBeanFactory(resource); It is deprecated now
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\Workspace\\Backend\\Spring core\\SpringCore2\\src\\com\\core\\Resources\\applicationContext.xml");
        Employee emp1 = (Employee) context.getBean("first");
        Employee emp1_2 = (Employee) context.getBean("first");
        System.out.println(emp1);
        System.out.println(emp1_2);

        emp1.empDetails();
        emp1_2.empDetails();

        Employee emp2 = (Employee) context.getBean("employee2");
        emp2.empDetails();
    }
}
