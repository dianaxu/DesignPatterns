package com.example.admin.designpatterns.flyweight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Vector;

/**
 * @author Diana
 * @date 2017/6/23
 */

public class ConnectionPool {

    private Vector<Connection> pool;

    //共有属性
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "root";
    private String driverClassName = "com.mysql.jdbc.Driver";

    private int poolSize = 100;
    private static ConnectionPool intance = null;
    Connection conn = null;

    //构造方法，做一些初始化工作


    public ConnectionPool() {
        pool = new Vector<>();

        for (int i = 0; i < poolSize; i++) {
            try {
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    //返回连接到连接池
    public synchronized void release() {
        pool.add(conn);
    }

    //返回连接池中的一个数据库连接
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            return conn;
        } else {
            return null;
        }
    }
}
