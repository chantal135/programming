import java.util.Scanner;
public class Student{
	public static void main(String[]args){
	int sum = 0;
	for(int a =4;a<=26;a++){
	if(a%2!=0){
		continue;
		}
	sum = sum+(a*a);
	System.out.println(a*a);
	}
System.out.println("The sum:+sum");
}}
