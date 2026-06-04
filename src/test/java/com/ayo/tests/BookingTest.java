
package com.ayo.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingTest {
    @Test
    void shouldDetectDoubleBooking() {

        boolean result = BookingValidator.isDoubleBooking(
                15,
                "2022-12-10",
                "09:00:00",
                "11:00:00"
        );

        assertTrue(
                result,
                "Double booking should be detected"
        );
    }

    @Test
    void shouldReturnCorrectSchedulePrice() {

        int actualPrice = BookingValidator.getSchedulePrice(
                15,
                "2022-12-10",
                "09:00:00",
                "11:00:00"
        );

        assertEquals(
                1000000,
                actualPrice,
                "Schedule price should match the expected value"
        );
    }

    @Test
    void shouldDetectPriceMismatch() {

        int bookingPrice = 1200000;

        int schedulePrice = BookingValidator.getSchedulePrice(
                15,
                "2022-12-10",
                "09:00:00",
                "11:00:00"
        );

        assertNotEquals(
                bookingPrice,
                schedulePrice,
                "Booking price mismatch should be detected"
        );
    }
    @Test
    void shouldAllowUniqueBookingSlot() {

        boolean result = BookingValidator.isDoubleBooking(
                15,
                "2022-12-10",
                "11:00:00",
                "13:00:00"
        );

        assertFalse(
                result,
                "Unique booking slot should not be detected as double booking"
        );
    }
}
