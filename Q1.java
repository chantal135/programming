import java.util.Scanner;
public class Q1{
public static void main(String[]args){
	Scanner ab = new Scanner(System.in);
	System.out.println("Enter your name");
	String Name = ab.nextLine();
	System.out.println("Enter your age");
	int age = ab.nextInt();
	 if(age>=18){
	System.out.println("you are able to vote");
	if(age<18){
	System.out.println("you are not able to vote");
	}
	 if(age>75){
		System.out.println("you are no longer be a minister");
		}
		 if(age>=35){
			System.out.println("you can a minister");
		}
		 if(age<=34){
			System.out.println(" you can only vote");
			}
			else
			System.out.println("you can vote try next year");
			System.out.println("Thank you for showing interest in voting, Bye");
	}
	}	
	}
