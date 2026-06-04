/**
 * DANA Indonesia
 * Copyright (c) 2018‐2026 All Rights Reserved.
 */
package com.ayo.tests;

import com.ayo.utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author hibatullaha
 * @version $Id: BookingValidator.java, v 0.1 2026‐06‐05 00.00 hibatullaha Exp $$
 */
public class BookingValidator {
    public static int getSchedulePrice(
            int venueId,
            String date,
            String startTime,
            String endTime) {

        String query =
                "SELECT price " +
                        "FROM schedule " +
                        "WHERE venue_id = ? " +
                        "AND date = ? " +
                        "AND start_time = ? " +
                        "AND end_time = ?";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {

            ps.setInt(1, venueId);
            ps.setString(2, date);
            ps.setString(3, startTime);
            ps.setString(4, endTime);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("price");
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return 0;
    }

    public static boolean isDoubleBooking(
            int venueId,
            String date,
            String startTime,
            String endTime) {

        String query =
                "SELECT COUNT(*) total " +
                        "FROM booking " +
                        "WHERE venue_id = ? " +
                        "AND date = ? " +
                        "AND start_time = ? " +
                        "AND end_time = ?";

        try (
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(query)
        ) {

            ps.setInt(1, venueId);
            ps.setString(2, date);
            ps.setString(3, startTime);
            ps.setString(4, endTime);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getInt("total") > 1;
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return false;
    }
}