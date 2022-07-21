package tdd.fizzbuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private static final String WHIZZ = "Whizz";

    public String countOff(int number) {
        String answer = "";
        if (number % 3 == 0) {
            answer += FIZZ;
        }
        if (number % 5 == 0) {
            answer += BUZZ;
        }
        if (number % 7 == 0) {
            answer += WHIZZ;
        }
        return answer.length() == 0 ? "" + number : answer;
    }

//    public boolean isDigitsInTheNumber(int theDigit, int number) {
//        List<Integer> digits = getDigits(number);
//        return digits.stream().anyMatch(digit -> theDigit == digit);
//    }

//    public List<Integer> getDigits(int number) {
//        return null;
//    }

}
