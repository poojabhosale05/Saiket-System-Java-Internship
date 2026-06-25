import java.util.Scanner;
public class Calculator
{
  public static double add(double a,double b)
  {
    return a+b;
  }
  public static double subtract(double a, double b)
  {
    return a-b;
  }
  public static double multiply(double a,double b)
  {
    return a*b;
  }
  public static double divide(double a,double b)
  {
    if(b == 0)
    {
     throw new ArithmeticException("Cannot divide by zero");
    }
    return a/b;
  }
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int choice;
    do
    {
      System.out.println("\n CALCULATOR");
      System.out.println("1.Addition");
      System.out.println("2.Subtrction");
      System.out.println("3.Multiplication");
      System.out.println("4.Division");
      System.out.println("5.Exit");
      System.out.println("Enter your choice:");
      choice = sc.nextInt();
      if(choice >= 1 && choice <= 4)
      {
        System.out.println("Enter first number:");
        double num1=sc.nextDouble();
        System.out.println("Enter second number:");
        double num2=sc.nextDouble();
        try{
           switch(choice){
                          case 1:
                                 System.out.println("Result =" + add(num1,num2));
                                 break;
                          case 2:
                                 System.out.println("Result =" + subtract(num1,num2));
                                 break;
                          case 3:
                                 System.out.println("Result =" + multiply(num1,num2));
                                 break;
                          case 4:
                                 System.out.println("Result =" + divide(num1,num2));
                                 break;
                         }
           }
           catch (ArithmeticException e)
           {
             System.out.println("Error:" +e.getMessage());
           }
      }
      else if(choice == 5)
      {
       System.out.println("THANK YOU");      
      }
      else
      {
       System.out.println("Invalid choice");
      }
   }while(choice !=5);
    sc.close();
  }
}   