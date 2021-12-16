class Shape{
	static int l, w;
	Shape(int a){
		l=a;
		w=6;
	}
	Shape(int a, int t){
		l=a;
		w=t;}
		static void area(){
			int A= l*w;
			System.out.println("The area of a rectangle is "+A);
			}}

      public class New{
	public static void main(String[]args){
		Shape x = new Shape(5,7);
		
		x.area();
		}}
