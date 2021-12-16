
	public class Participation3{
	public static void main(String[]args){
		
		Fashion FS=new Fashion();
		FS.modering("International");
		FS.modering("female",75.45);
		FS.modering("Nadia Simbi",23,2500000.0);
		}}
	class Fashion{
		static void modering(String competition){
			
			System.out.println("The modering competition is:"+competition );}
			
			static void modering(String sex,double height){
				
				System.out.println("The modering required sex is:"+sex+ "the modering required height is:"+height);}
				static void modering(String winner,int age,double salary){
				
				System.out.println("The modering winner is:"+winner+ "has age:"+age+ "earned salary:"+salary);
				}
			}
								
	

