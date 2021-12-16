import java.util.*;  
public class ChantalT{  
public static void main(String[] args) {  
    List<Double> scores = new ArrayList<>();  
     
    scores.add(45.0);  
    scores.add(67.56);
    scores.add(83.0);
    scores.add(70.45);
    scores.add(784.0);
    System.out.println(scores);
    scores.remove(83.0);
    scores.add(67.675);
    System.out.println(scores);
    scores.add(1,78.1);
    scores.set(0,56.0);
    System.out.println(scores);
    scores.add(60.0);
    scores.add(67.3);
    scores.add(2,29.0);
    System.out.println(scores);
      
    for(Double i:scores){
		System.out.println(i);  
    }}} 


