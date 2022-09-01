package java_repetition;

import java_repetition.LeapYear;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeapYearTest {

//    @ParameterizedTest
//    @Disabled
//    @CsvSource(value = {"2000:true", "1957:false"}, delimiter = ':')
//    void determineIfYearIsLeapYear_testingMethod_expectCorrectValue(int year, boolean expectedOutput) {
//
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintStream ps = new PrintStream(baos);
//        System.setOut(ps);
//
//        LeapYear ly = new LeapYear();
//        ly.determineIfYearIsLeapYear();
//        // Problem since it waits on user input
//
//        String message = String.format("Is year a leapyear? %b ", expectedOutput);
//
//        assertEquals(message, baos.toString());
//
//
//    }

}
