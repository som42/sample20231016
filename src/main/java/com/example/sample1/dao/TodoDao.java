package com.example.sample1.dao;

import com.example.sample1.domain.Todo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.locks.Condition;

@Component
public class TodoDao {

    @Autowired
    private DataSource dateSource;
    
    public List<Todo> list() throws Exception {
        String sql = "SELECT * FROM todo ORDER BY id DESC";
        Connection connection = dateSource.getConnection();
        Statement statement = connection.createStatement();
        statement.executeQuery(sql)
    }

    public void insert(Todo todo) {
    }
}
