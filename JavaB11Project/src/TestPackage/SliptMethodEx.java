package TestPackage;
import java.util.*;  
public class SliptMethodEx {

	public static void main(String[] args) {
		  String text= new String("Hello,My name is Sachin");  
	        /* Splits the sentence by the delimeter passed as an argument */  
	        String[] sentences = text.split(" ");  
	        System.out.println(Arrays.toString(sentences));
		
		//Output is [Hello, My name is Sachin]
		//String s="hello";    
		//System.out.println(s.substring(0,2)); 

	}

}