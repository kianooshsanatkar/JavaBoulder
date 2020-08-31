package com.enterpriseframework.core.domain;

import java.lang.reflect.Type;

public abstract class DynamicEntity implements IDynamicEntity {
    public String PropertyName;
    public Type type;

    public DynamicEntity(String propertyName, Type type) {
        PropertyName = propertyName;
        this.type = type;
    }

    @Override
    public abstract boolean equals(Object obj);
}
