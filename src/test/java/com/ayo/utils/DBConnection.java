/**
 * DANA Indonesia
 * Copyright (c) 2018‐2026 All Rights Reserved.
 */
package com.ayo.utils;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @author hibatullaha
 * @version $Id: DBConnection.java, v 0.1 2026‐06‐04 23.59 hibatullaha Exp $$
 */
public class DBConnection {
    private static final String URL =
            "jdbc:mysql://localhost:3306/ayo_db";

    private static final String USER = "root";

    private static final String PASSWORD = "password";

    public static Connection getConnection() {

        try {
            return DriverManager.getConnection(
                    URL,
                    USER,
                    PASSWORD
            );
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}