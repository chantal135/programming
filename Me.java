class Student{
static	String name , course ;
static void numbers(){
	for(int i=1; i<=5;i++){
		System.out.println(i);
		
		}
		
	}
	static void info(){
		
		
		System.out.println("Hello Rwanda");
		System.out.println("Your welcome");
		System.out.println("your name is:"+name+" your course is:"+course);
		
		
		
		}}

public class Me {
	public static void main(String[]args){
		
		
		Student x = new Student();
		x.name = "chantal";
		x.course = " INS";
		x.info();
		x.numbers(); 
 
		
		
		
		
		
}}
