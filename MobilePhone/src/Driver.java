import java.util.Scanner;

public class Driver {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String answer = "";
		
		do {
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your phone manufacturer.");
			String manufacturer = scan.nextLine();
			
			System.out.println("Enter your model.");
			String model = scan.nextLine();
			
			System.out.println("Enter your price.");
			String price = scan.nextLine();
			
			System.out.println("Enter your carrier.");
			String carrier = scan.nextLine();
			
			MobilePhone MP = new MobilePhone(manufacturer,model,price,carrier);
			
			System.out.println(MP.call("4445556666"));
			System.out.println(MP.text("Hi"));
			System.out.println(MP.toString());
			
			
			System.out.println("Enter mroe phone information? (Y/N)");
			answer = scan.nextLine();
		}while(answer.equalsIgnoreCase("Y"));
		
		
	}

}
