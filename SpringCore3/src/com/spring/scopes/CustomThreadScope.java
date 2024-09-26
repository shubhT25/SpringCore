package com.spring.scopes;

import java.util.HashMap;

public class CustomThreadScope extends ThreadLocal{
    @Override
    protected Object initialValue() {
        return new HashMap<String, Object>();
    }
}
