package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_say_order_number_when_given_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(3);

        assertEquals("1",answer);
    }

}
