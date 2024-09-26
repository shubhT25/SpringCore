package com.spring.scopes;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.Map;

public class GetThreadScope implements Scope {
    Map<String, Object> scope = null;
    CustomThreadScope customThreadScope = new CustomThreadScope();
    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        scope = (Map<String, Object>) customThreadScope.get();
        Object obj = scope.get(name);
        if(obj == null) {
            obj = objectFactory.getObject();
            scope.put(name, obj);
        }
        return obj;
    }

    @Override
    public Object remove(String name) {
        Object obj = scope.remove(name);
        return obj;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return "";
    }
}
