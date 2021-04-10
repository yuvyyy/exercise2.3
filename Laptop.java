package laptop21;

import java.io.PrintStream;
import java.util.Scanner;

public class Laptop {
		
	     String name ;
	     String colour ;
	     String processor ;
	     int memoryGB ;
	     String Price ;
	     String Warranty ;
	     int ScreenSize ;
	     
	     void printLaptop(String n, String c, String p, int m) {
	    	
	    	System.out.println("Laptop name " + n);
	    	System.out.println("Laptop colour " + c);
	    	System.out.println("Laptop processor " + p);
	    	System.out.println("Laptop memoryGB " + m);
	       
	       }
	     
	    void printPrice(String a) {
	 		   System.out.println("The laptop price is RM " + a);
	 	   
	 	   }
	 	   
	 	void printWarranty(String g) {
	 		   System.out.println("Warranty Years : " + g + " years");
	 		      
	 	  }
	 	
	 	void printScreenSize(int z) {
	 		   System.out.println("ScreenSize is " + z + " inch");
	 		      
	 	}
	 	
	 	
}
	 	   