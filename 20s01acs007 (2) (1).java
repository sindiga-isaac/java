import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   System.out.print("Enter 1st integer: ");
	   int num1=input.nextInt();
	   System.out.print("Enter 2nd integer: ");
	   int num2=input.nextInt();
	   int sum=num1+num2;
	   System.out.println("The sum is " +getTotal(num1, num2));
	   
	   int num;
        System.out.print("Enter an integer: ");
        num = input.nextInt();
                
        if(isEven(num))
        {
        System.out.println("Even number");
        }
        else
        {
        System.out.println("Odd number");
        }   
	   
	   double number;
	   System.out.print("Enter a double number: ");
	   number=input.nextDouble();
	   double squareroot=Math.sqrt(number);
	   System.out.print("Squareroot= " +getSquareroot(number));
	}
	public static int getTotal(int num1, int num2)
	{
	    return num1+num2;
	}
	public static boolean isEven(int number)
	{
	    if(number %2==0)
	    {
	    return true;
	    }
	    else
	    {
	    return false;
	    }
	}
	public static double getSquareroot(double number)
	{
	    return Math.sqrt(number);
	}
}
