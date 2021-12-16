class School{
	static String name;
	static String data(){
		 
	
		
		return name;
		
		}
		static double area(int a, int b){
			double r = a*b;
			return r;
			}
			static int total(){
				int sum=0;
				for(int x=1;x<=10;x++)
				{sum+= x;}
				return sum;
				}
	}


public class Ret{
	public static void main(String[]args){
		School sc = new School();
		
		sc.name = "chantal";
		String t = sc.data();
		System.out.println("My name is"+t);
		
		System.out.println("Area is"+sc.area(15,78));
		System.out.println("The sum of numbers from 1 to 10 is"+sc.total());
		}
	}
