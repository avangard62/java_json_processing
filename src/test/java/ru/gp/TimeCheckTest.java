package ru.gp;

import lombok.SneakyThrows;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static ru.gp.TimeChecker.printCurTime;
import static ru.gp.TimeChecker.printTestBeginningTime;

public class TimeCheckTest {
    @SneakyThrows
    @Test
    void testFirst() {
        sleep(2000);
        assert true;
        printTestBeginningTime();
        printCurTime();
        System.out.println();
    }

    @SneakyThrows
    @Test
    void testSecond() {
        sleep(3000);
        assert !false;
        printTestBeginningTime();
        printCurTime();
        System.out.println();
    }
}
