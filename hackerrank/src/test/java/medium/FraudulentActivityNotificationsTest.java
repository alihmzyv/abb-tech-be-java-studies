package medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FraudulentActivityNotificationsTest {

    @Test
    void activityNotificationsTest1() {
        assertEquals(2, FraudulentActivityNotifications.activityNotifications(List.of(2, 3, 4, 2, 3, 6, 8, 4, 5 ), 5));
    }

    @Test
    void activityNotificationsTest2() {
        assertEquals(0, FraudulentActivityNotifications.activityNotifications(List.of(1, 2, 3, 4, 4), 4));
    }
}