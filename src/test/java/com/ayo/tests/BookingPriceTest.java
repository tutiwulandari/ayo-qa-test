/**
 * DANA Indonesia
 * Copyright (c) 2018‐2026 All Rights Reserved.
 */
package com.ayo.tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BookingPriceTest {
    @Test
    public void verifyBookingPriceMatchesSchedulePrice() {

        // Data booking
        int bookingPrice = 1200000;

        // Data schedule
        int expectedPrice = 1000000;

        Assertions.assertEquals(
                expectedPrice,
                bookingPrice,
                "Booking price does not match schedule price."
        );
    }
}