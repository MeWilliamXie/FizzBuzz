package tdd.fizzbuzz;

public class FizzBuzz {

    public String countOff(int i) {
        String answer = "";
        if(i%3==0){
            answer += "Fizz";
        }
        return answer.length() == 0?"" + i:answer;
    }


}
