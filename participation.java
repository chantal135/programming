import java.util.Scanner;
public class participation{
	public static void main(String[]args){
		double scare;
		Scanner dc = new Scanner(System.in); 
		System.out.println(" please Enter your scares");
		double grade=dc.nextDouble();
		
		if(grade<=78.5){
		
			System.out.println("you have good scores");
		
		 if(grade<=89){
		System.out.println("A+");
	}
	if(grade<=85){
		System.out.println("A");
	}
	else
	{
		
		
			System.out.println("you haveA+");
			System.out.print("Your score are still low");
			}
		
	}
}
}


