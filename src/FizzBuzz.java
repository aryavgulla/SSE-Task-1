//FizzBuzz Challenge
/*The goal is to loop from 1 to 50,
but replace numbers divisible by 3 with "Fizz",
numbers divisible by 5 with "Buzz",
and numbers divisible by both with "FizzBuzz" */

public class FizzBuzz {
    public static void main(String[] args){
        for (int i=1;i<=50;i++){
            if (i % 5==0 && i % 3==0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3==0) {
                System.out.println("Fizz");
            }
            else if (i % 5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }

}