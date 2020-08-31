package com.enterpriseframework.gallery.domain;

import com.enterpriseframework.core.domain.DynamicEntity;

import java.lang.reflect.Type;

public class DynamicProperty extends DynamicEntity {

    public DynamicProperty(String propertyName, Type type) {
        super(propertyName, type);
    }

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
