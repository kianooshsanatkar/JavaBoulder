package com.enterpriseframework.gallery.domain;

import com.enterpriseframework.core.domain.BaseEntity;
import com.enterpriseframework.core.domain.conventionalobjects.Picture;

public class Post extends BaseEntity {
    public Category category;
    public Iterable<Picture> Pics;
    public String Title;
    public String Info;
    public Iterable<DynamicProperty> Property;
}
