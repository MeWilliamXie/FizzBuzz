package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i) {
        String answer = "";
        if(i%3==0){
            answer += "Fizz";
        }
        if(i%5 == 0){
            answer += "Buzz";
        }
        return answer.length() == 0?"" + i:answer;
    }


}
