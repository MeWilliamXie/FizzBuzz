package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_say_order_number_when_given_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(1);

        assertEquals("1",answer);
    }

    @Test
    public void should_say_Fizz_when_given_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(3);

        assertEquals("Fizz",answer);
    }

    @Test
    public void should_say_Buzz_when_given_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(5);

        assertEquals("Buzz",answer);
    }



}
