package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_say_order_number_when_countOff_given_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(1);

        assertEquals("1",answer);
    }

    @Test
    public void should_say_Fizz_when_countOff_given_3(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(3);

        assertEquals("Fizz",answer);
    }

    @Test
    public void should_say_Buzz_when_countOff_given_5(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(5);

        assertEquals("Buzz",answer);
    }

    @Test
    public void should_say_Whizz_when_countOff_given_7(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(7);

        assertEquals("Whizz",answer);
    }

    @Test
    public void should_say_FizzBuzz_when_countOff_given_15(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(15);

        assertEquals("FizzBuzz",answer);
    }


}
