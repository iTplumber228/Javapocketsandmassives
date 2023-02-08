package ru.netology.javaqa.javaqamvn.services;

public class SQRService {
    public int calculate(int lowerRange, int upperRange) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (lowerRange <= sqr && sqr <= upperRange) {
                counter = counter + 1;
            }
        }
        return counter;
    }
}

