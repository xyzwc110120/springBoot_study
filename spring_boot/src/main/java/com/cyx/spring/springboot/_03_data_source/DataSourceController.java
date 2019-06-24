package com.cyx.spring.springboot._03_data_source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.SQLException;

@RestController
@RequestMapping("/springboot")
public class DataSourceController {

    private DataSource dataSource;

    @Autowired
    public DataSourceController(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @RequestMapping("/dataSource")
    public void dataSource() throws SQLException {
        System.out.println(dataSource.getConnection());
        System.out.println(dataSource);
    }
}
