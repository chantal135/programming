class Shape{
	static void area(double r){
		double pi=3.14;
		double A= pi*r*r;
		System.out.println("The area of circle");
		}
		static void area(int r,int b){
			int A=r*b;
			System.out.println("The area of rectangle");
		}
		}
		public class Example2{
			public static void main(String[]args){
				Shape a = new Shape();
				a.area();
			}}
