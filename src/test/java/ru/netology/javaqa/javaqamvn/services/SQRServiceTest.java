package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

        @ParameterizedTest
        @CsvSource({"200,300,3", // как в примере
                "1,99,0", // ниже границы
                "8002,10000,10"}) // выше границы

        public void amountSqr( int lowerRange, int upperRange, int expected) {
            SQRService service = new SQRService();

            // вызываем метод
            int actual = service.calculate(lowerRange, upperRange);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }
    }