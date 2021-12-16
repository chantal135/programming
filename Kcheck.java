public class Kcheck {
	public static void main(String[]args){
		
		int sum=0;
		for(int c=4;c<=26;c++){
			if(c%2!=0){
				continue;
			}
			sum=sum+(c*c);
			System.out.println(c*c);
		}
		System.out.println("Thesum is :"+sum);
		
		
		}}
