package com.example.emp.Dependency;

import java.util.Date;
import lombok.Data;

@Data
public class GradleModules {
    String id;
    String name;
    String description;
    String groupName;
    String script;
    Date   createDT;
    Date   updateDT;
}
