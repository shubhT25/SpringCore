package com.spring.validator;

import com.spring.beans.SavingsAccount;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.io.IOException;
import java.util.Properties;

public class SavingsValidator implements Validator {
    private Resource resource;

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return SavingsAccount.class.equals(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        try {
            Properties errorMessages = PropertiesLoaderUtils.loadProperties(resource);
            SavingsAccount sv = (SavingsAccount) target;
            if(sv.getName() == null || sv.getName().isEmpty()){
                errors.rejectValue("Name", "401", errorMessages.getProperty("error.name.not.found"));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
