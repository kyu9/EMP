package com.example.emp.View.model;

import lombok.Data;

import java.util.List;

@Data
public class Project {
    String buildType;
    String language;
    String springVersion;
    MetaData metaData;
    String group;
    List<Dependency> dependencies;
}
