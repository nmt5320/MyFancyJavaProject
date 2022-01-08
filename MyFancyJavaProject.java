class MyFancyJavaProject {
  Private static MyFancyJavaProject MFJP;
  private MyFancyJavaProject(int fisrt, int second)
  {
    this.first = fisrt;
    this.second = second;
  }
   System.out.println("Enter two numbers");
  first = 10;
  second = 20;

    System.out.println(first + " " + second);

  // add two numbers
  int sum = first + second;
    System.out.println("The sum is: " + sum);
}

  public static getMFJP(int fisrt, int second) {

    if(MFJP == null)
      MFJP = new MyFancyJavaProject(fisrt,second)
    return MFJP;


  }