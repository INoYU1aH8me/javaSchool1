package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 12
     * -2,147,483,648 -> exception, error message
     */

    public int reverse(int inputNumber) {
        //Task implementation
        int result = 0;
        boolean isNegative = false;

        if (inputNumber < 0) {
            isNegative = true;
            inputNumber *= -1;
        }
        while (inputNumber > 0) {
            result*=10;
            result += inputNumber % 10;
            inputNumber /= 10;
        }

        if (isNegative) {
            result *= -1;
        }
        return result;
    }
}
