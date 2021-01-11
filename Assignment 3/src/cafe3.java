import java.util.Scanner;

public class cafe3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("\t WELCOME TO THE CAFE!");
		
		
			//for loop
			System.out.println("Please Take Your Number & Wait For Your Turn" );
			for (int i=1; i<3; i++) {
				System.out.println("your number is " + i );
			}
        
			//method call
			title();
			personalDetail();
			printOrder();
        
	}
		public static void personalDetail() {
			
			Scanner in = new Scanner (System.in);
			
			System.out.print("Enter Your Age: ");
			int age = in.nextInt();
			System.out.print("Are you a 'student' or 'worker' : ");
			String personal;
			personal = in.next();
        
	}
		public static void title() {
			Scanner in = new Scanner (System.in);
			String[] title = {"Mr", "Mrs", "Miss"};
		
			System.out.print("Enter Your Name : ");
			String name = in.nextLine();
			System.out.print("Are you 'Mr', 'Mrs', or 'Miss' ? ");
			System.out.print("Enter '0' for 'Mr' , '1' for 'Mrs' and '2' for 'Miss' : ");
			int title1 = in.nextInt();
		
				if (title1 == 0) {
					System.out.println("Hi " + title[0] + " " + name);
				}else if (title1 == 1) {
					System.out.println("Hi " + title[1] + " " + name);
				}else if (title1 == 2) {
					System.out.println("Hi " + title[2] + " " + name );
				}else
					System.out.println("Please Enter your code again");
		}
	
			public static void printOrder() {
			Scanner in = new Scanner (System.in);
			
				int x=1;
				System.out.print("How many order do u want to take? ");
				int order = in.nextInt();
		
				while (x <= order) {								    
					System.out.println();
					System.out.println("---------------------------------------------");
					System.out.println(">>>>Drink only RM2 and Eat only for RM4<<<<");
					System.out.println("---------------------------------------------");
					System.out.println();
        
      
					System.out.print("Do you want to order? (Y/N): ");
					char order1 = in.next().charAt(0);
					
					//do while loop
					do { 
						System.out.print("What do you want from our service 'drink only(D)' or 'eat only (E)' or both(B) ?: ");
						char service = in.next().charAt(0);
						if (service == 'd' || service == 'D'){
							System.out.print("What is the quantity of your drink : ");
							double quantityDrink = in.nextDouble();
							double totalPrice1 = quantityDrink*2;
							System.out.println("Your total price is RM " +totalPrice1);
						} else if (service == 'e' || service == 'E')  {
							System.out.print("Please enter your quantity of meal : ");
							int quantityMeal = (int) in.nextDouble();
							double totalPrice2 = quantityMeal*4;
							System.out.println("Your total price is RM " +totalPrice2);
						} else if (service == 'b' || service == 'B'){
							System.out.print("What is the quantity of your drink : ");
							int quantityDrink = in.nextInt();
							System.out.print("What is the quantity of your meal : ");
							int quantityMeal = in.nextInt();
							double totalDrink = quantityDrink*2;
							double totalMeal = quantityMeal*4;
							double totalPrice3 = totalDrink+totalMeal;
							System.out.println();
							System.out.println("Your total price is RM " +totalPrice3);
						}
						System.out.print("Do you still want to order? (Y/N): ");
							order1 = in.next().charAt(0);
					} while (order1 == 'Y'|| order1 == 'y');        		        	            
      	
					System.out.println("Are you sure?");
					System.out.println("Enter '0' for 'YES' and '1' for 'NO' ");
					order = in.nextInt();
			}
			
			System.out.println("THANK YOU, PLEASE COME AGAIN");
			System.out.println("AND DON'T FORGET TO ENJOY YOUR FOODS AND DRINKS!");

	}

}
