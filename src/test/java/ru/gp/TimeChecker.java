package ru.gp;

import org.testng.Reporter;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeChecker {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss.SSS");

    public static void printTestBeginningTime() {
        final Date t = new Date(Reporter.getCurrentTestResult().getStartMillis());
        final String testBeginTime = sdf.format(t);
        System.out.println("Test beginning time:\n\t\t" + testBeginTime);
    }

    public static void printCurTime() {
        final Date now = new Date();
        final String testBeginTime = sdf.format(now);
        System.out.println("Now time:\n\t\t" + testBeginTime);
    }
}
