/**
 * DANA Indonesia
 * Copyright (c) 2018‐2026 All Rights Reserved.
 */
package com.ayo.tests;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;


public class DoubleBookingTest {
    @Test
    public void verifyNoDoubleBookingExists() {

        String booking1 = "15-2022-12-10-09:00-11:00";
        String booking2 = "15-2022-12-10-09:00-11:00";

        Set<String> uniqueBookings = new HashSet<>();
        uniqueBookings.add(booking1);
        uniqueBookings.add(booking2);

        Assertions.assertEquals(
                2,
                uniqueBookings.size(),
                "Double booking detected."
        );
    }
}