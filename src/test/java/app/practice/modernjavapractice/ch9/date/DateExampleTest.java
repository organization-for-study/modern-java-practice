package app.practice.modernjavapractice.ch9.date;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

class DateExampleTest {
    @Test
    void 날짜는_어떤식으로_표현될까() {
        System.out.println("new Date().getTime() : " + new Date().getTime());
        System.out.println("Calendar.getInstance().getTime() : " + Calendar.getInstance().getTime());
        System.out.println("LocalDateTime.now() : " + LocalDateTime.now());
        System.out.println("LocalDate.now() : " + LocalDate.now());
    }
}
