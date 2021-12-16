import java.util.Scanner;
public class  Marie Chantal check1 {
	public static void main(String[]args){
		
	Scanner ab= new Scanner (System.in);
	
	System.out.println(" Enter your Name  ");
	
	String userName = ab.nextLine();
	
	
	System.out.println("please enter your age");
	int age = ab.nextInt();
	
	if(age>=18)
	{
		System.out.println("you are able to vote");
		
		}
	 if(age<18)
	{
		System.out.println("you can not vote now");
		System.out.println("try next year");
		}
	else if(age<75)
	{
		System.out.println("you can nolonger be a minister");
		

	}
	else if(age>=35)
	{
		System.out.println("you can be a minister");
	}
	
	else if(age<=34)
	{
		System.out.println("you can only vote");
		}
		
		else
		{
			System.out.println("Thank you for showing interest in voting,Bye!!");
		}
	}}
