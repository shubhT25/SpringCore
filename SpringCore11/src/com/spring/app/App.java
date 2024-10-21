package com.spring.app;

import com.spring.beans.CurrentAccount;
import com.spring.beans.Employee;
import com.spring.beans.SavingsAccount;
import com.spring.factory.FactoryAccount;
import com.spring.validator.SavingsValidator;
//import org.springframework.beans.BeanInfoFactory;
//import org.springframework.beans.BeanWrapper;
//import org.springframework.beans.BeanWrapperImpl;
//import org.springframework.beans.ExtendedBeanInfoFactory;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//import org.springframework.validation.MapBindingResult;
//import org.springframework.validation.ObjectError;
//BeanInfo
import java.beans.*;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws ClassNotFoundException, IntrospectionException {
//        BeanWrapper bw = new BeanWrapperImpl(Employee.class);
//        BeanWrapper bw2 = new BeanWrapperImpl(Employee.class);
//        bw.setPropertyValue("eno", 111);
//        bw.setPropertyValue("ename", "AAA");
//        bw.setPropertyValue("esal", 5000.0f);
//        bw.setPropertyValue("eaddr", "Hyd");
//
//        Employee emp = (Employee) bw.getWrappedInstance();
//        System.out.println(emp);
//        emp.displayEmpDetails();
//        System.out.println();
//
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("eno", "222");
//        map.put("ename", "BBB");
//        map.put("esal", "6000");
//        map.put("eaddr", "Hyd");
//        bw.setPropertyValues(map);
//        System.out.println(bw);
//        System.out.println(bw2);
//        System.out.println("Employee Details");
//        System.out.println("--------------------------");
//        System.out.println("Employee No      :"+bw.getPropertyValue("eno"));
//        System.out.println("Employee Name    :"+bw.getPropertyValue("ename"));
//        System.out.println("Employee Salary  :"+bw.getPropertyValue("esal"));
//        System.out.println("Employee Address :"+bw.getPropertyValue("eaddr"));
//        BeanInfo beanInfo = Introspector.getBeanInfo(Employee.class);
//        BeanInfoFactory factory = new ExtendedBeanInfoFactory();
//        BeanInfo beanInfo = factory.getBeanInfo(Employee.class);
//        PropertyDescriptor[] property_desc = beanInfo.getPropertyDescriptors();
//        System.out.println("Properties: ");
//        for(PropertyDescriptor p: property_desc){
//            System.out.println(p);
//        }
//        MethodDescriptor[] meths = beanInfo.getMethodDescriptors();
//        System.out.println("Methods: ");
//        for(MethodDescriptor m: meths){
//            System.out.println(m);
//        }
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/resources/applicationContext.xml");
//        FactoryAccount sfc = (FactoryAccount) context.getBean("savingsFactory");
//        SavingsAccount savingsAccount = (SavingsAccount) sfc.getAccount();
//        FactoryAccount cfc = (FactoryAccount) context.getBean("currentFactory");
//        CurrentAccount currentAccount = (CurrentAccount) cfc.getAccount();
//        SavingsValidator sv = (SavingsValidator) context.getBean("savingsValidator");
//
//        Map<String, String> map = new HashMap<>();
//        MapBindingResult result = new MapBindingResult(map, "com.spring.beans.SavingsAccount");
//        System.out.println("1: " + result);
//        sv.validate(savingsAccount, result);
//        System.out.println("2: " + result);
//        List<ObjectError> Errors = result.getAllErrors();
//        for(ObjectError Error: Errors) {
//            System.out.println(Error.getDefaultMessage());
//       }
//        System.out.println(savingsAccount.getName());
//        System.out.println(currentAccount);
    }
}
