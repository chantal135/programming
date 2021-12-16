import java.util.ArrayList;
public class Arraylist{
	 public static void main(String[]args){
		 
		ArrayList<Integer>grades = new ArrayList<>();
		grades.add(60);
		grades.add(75);
		grades.add(90);
		grades.set(1,50);
		grades.remove(90);
		System.out.println(grades);
		 
		 }}
