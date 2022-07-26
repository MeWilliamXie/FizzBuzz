package tdd.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_say_order_number_when_countOff_given_1() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(1);

        assertEquals("1", answer);
    }

    @Test
    public void should_say_Fizz_when_countOff_given_3() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(3);

        assertEquals("Fizz", answer);
    }

    @Test
    public void should_say_Buzz_when_countOff_given_5() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(5);

        assertEquals("Buzz", answer);
    }

    @Test
    public void should_say_Whizz_when_countOff_given_7() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(7);

        assertEquals("Whizz", answer);
    }

    @Test
    public void should_say_Fizz_when_countOff_given_13() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(13);

        assertEquals("Fizz", answer);
    }

    @Test
    public void should_say_FizzBuzz_when_countOff_given_15() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(15);

        assertEquals("FizzBuzz", answer);
    }

    @Test
    public void should_say_Whizz_when_countOff_given_17() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(17);

        assertEquals("Whizz", answer);
    }

    @Test
    public void should_say_FizzWhizz_when_countOff_given_21() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(21);

        assertEquals("FizzWhizz", answer);
    }

    @Test
    public void should_say_FizzBuzzWhizz_when_countOff_given_35() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(35);

        assertEquals("FizzBuzzWhizz", answer);
    }

    @Test
    public void should_say_FizzWhizz_when_countOff_given_37() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(37);

        assertEquals("FizzWhizz", answer);
    }

    @Test
    public void should_say_Buzz_when_countOff_given_52() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(52);

        assertEquals("Buzz", answer);
    }

    @Test
    public void should_say_BuzzWhizz_when_countOff_given_57() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(51);

        assertEquals("BuzzWhizz", answer);
    }

    @Test
    public void should_say_FizzBuzzWhizz_when_countOff_given_105() {
        FizzBuzz fizzBuzz = new FizzBuzz();

        String answer = fizzBuzz.countOff(105);

        assertEquals("FizzBuzzWhizz", answer);
    }



}
