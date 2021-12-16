import java.util.ArrayList;
public class La{
	 public static void main(String[]args){
		 
		 
		ArrayList<String>courses = new ArrayList<>();
		courses.add("BME");
		courses.add("INS");
		courses.add("HTM");
		//System.out.println(courses);
		courses.add(2,"T");
		courses.set(0,"Leadership");
		//System.out.println(courses);
		courses.remove(1);
		//System.out.println(courses.get(2));
		for(String b:courses){
			System.out.println(b);
			}
		
		
		
		}}
		
