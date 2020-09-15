public class FizzBuzz {

  public FizzBuzz(int size) {
   for(int i = 1; i <= size; i++) {

    boolean isMultiThree = i % 3 == 0;
    boolean isMultiFive = i % 5 == 0;

    if (isMultiThree && isMultiFive) {
     System.out.println("Fizz Buzz");
    }
    else if (isMultiThree) {
     System.out.println("Fizz");
    }
    else if (isMultiFive) {
     System.out.println("Buzz");
    } else {
     System.out.println(i);
    }
   }
  }

  public static void main(String[] args) {
   new FizzBuzz(100);
  }
 }
