
import java.util.Scanner;
 class Student{
	
	String name, courses;
	int  age; 
	}
public class Main{
		public static void main(String[]args){
		 
		 
	Student std1 = new Student();
	Scanner a = new Scanner(System.in);
	 
	System.out.println("Enter your name");
	std1.name = a.nextLine();
	System.out.println("please enter your course");
	std1.courses = a.nextLine();
	System.out.println("Enter your age");
	std1.age = a.nextInt(); 
	System.out.println("your name is:"+std1.name+" your course is :"+std1.courses+"your age is:"+std1.age );
	}}
	
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		
		 
		
