import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter one option either 1, 2 or 3:");//user is prompted to enter one option//
		Scanner console=new Scanner(System.in);
		int option=console.nextInt();//input one option//
		switch(option)//use the switch statement to determine the output of the different variablews//
		{
		    case 1:
		    if (option==1)//if statement is used to test for the validity of the argument//
		        System.out.println("Enter your name:");//prompt to enter your name//
		        String name=console.next();//Enter your name//
		    if (option==1)//testing the validity of the argument//
		        System.out.println("Enter your Age:");//user is prompted to enter his or her age//
		        int age=console.nextInt();//Enter your age//
		    if (age>=18)//Testing for the validity of the argument//
		        System.out.println("Eligible for voting");//the final valid statement is displayed//
		    else//if.... else condition is used//
		        System.out.println("Not Eligible for voting");//final truth of the argument is displayed//
		    break;//emd of the 1st switch statement//
		    
		    case 2://beginning of the 2nd switch statement//
		    if(option==2)//condition//
		        System.out.println("Enter two integers:");//the user is prompted to enter two integers//
		        int x=console.nextInt();//input the 1st integer read as x//
		        int y=console.nextInt();//2nd integer read as y//
		        System.out.println("X = "+x);//the system displays the value of x//
		        System.out.println("Y = "+y);//the ksystem displays the value for y//
		        String max=(x>y)?"x" : "y";//ternary operator used to determine the maximum integer//
		        System.out.println("The maximum number of the two= "+max);//displays the maximum integer//
		    break;//end of 2nd switch statement//
		    
		    case 3://beginning of 3rd switch statement//
		       System.out.println("Enter your marks");//the user is prompted to enter the marks//
		       int marks=console.nextInt();//the user inputs the marks//
		       if(marks>=81 && marks<=100)//testing the validity of the argument//
		        System.out.println("Your grade= A");//if the argument is true, the system displays A//
		       else if(marks>=61 && marks<=80)//testing the validity of the argument//
		        {System.out.println("Your grade= B");}//what is displayed if the argument is true//
		       else if(marks>=41 && marks<=60)//testing the validity of the argument//
		        {System.out.println("Your grade= C");}//what is displayed if the argument is true//
		       else if(marks>=0 && marks<=40)//testing the validity of the argument//
		        {System.out.println("Your grade= F");}//if the argument is true, the system displays F//
		       else
		        {System.out.println("Enter marks between 0 and 100");}//if marks not within the range 0-100 is entered//
		    break;//end of the switch statement//
		    
		    default:
		        System.out.println("Invalid option");//when another option rather than 1,2 or 3 is entered//
		    break;//end of the switch statement//
		}
	
	}
}


		
		  
