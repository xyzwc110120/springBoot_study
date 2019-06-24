package com.cyx.spring.springboot._02_configuration_properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springboot")
public class ConfigurationPropertiesController {

    private DataSourceDemo dataSourceDemo;

    @Autowired
    public ConfigurationPropertiesController(DataSourceDemo dataSourceDemo) {
        this.dataSourceDemo = dataSourceDemo;
    }

    @RequestMapping("/configurationProperties")
    public DataSourceDemo configurationProperties() {
        return dataSourceDemo;
    }
}
