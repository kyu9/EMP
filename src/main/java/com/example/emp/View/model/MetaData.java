package com.example.emp.View.model;

import lombok.Builder;
import lombok.Data;

@Data
public class MetaData {
    String group;
    String artifact;
    String name;
    String fullPackage;
    String description;
    String packaging;
    String javaVersion;
}
