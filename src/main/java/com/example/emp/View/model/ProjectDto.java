package com.example.emp.View.model;

import com.example.emp.Dependency.GradleModules;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
public class ProjectDto {

    String              buildType;
    String              language;
    String              springVersion;
    MetaData            metaData;
    String              group;
    List<GradleModules> gradleModules;
}
