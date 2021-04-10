package laptop21;

public class Main {

	public static void main(String[] args) {
		Laptop MyLaptop = new Laptop();//create first new object
			
			MyLaptop.printLaptop("Samsung","Blue","Windows",500);
			MyLaptop.printPrice("1600");
			MyLaptop.printWarranty("2");
			MyLaptop.printScreenSize(16);
		
			System.out.println();
			
		
		Laptop JackieChanLaptop = new Laptop();//create first new object
			
			MyLaptop.printLaptop("Apple","Grey","iOS",600);
			MyLaptop.printPrice("2500");
			MyLaptop.printWarranty("3");
			MyLaptop.printScreenSize(16);
	

	}

}