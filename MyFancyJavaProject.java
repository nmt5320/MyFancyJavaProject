public class MyFancyJavaProject {

  public static void main(String[] args) {
    
    System.out.println("Enter two numbers");
    int first = 10;
    int second = 20;
    
    System.out.println(first + " " + second);

    // add two numbers
    int sum = adder(first,second);
    System.out.println("The sum is: " + sum);
  }

  public static int adder(int n1, int n2) {
      int sum;
      sum = n1 + n2;

      return sum; 
   }
}