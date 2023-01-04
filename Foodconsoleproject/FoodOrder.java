package Foodconsoleproject;

import java.util.Scanner;

public class FoodOrder {

	int FrenchFries = 100;
	int Jumbo_Burger = 120;
	int Vadapaav_with_special_Tea = 200;
	int Pizza = 200; 
	int Bhau_special_coldCoffee = 150;
	int coldDrink = 70;
	int jumbo_ice_cr = 300;
	int ch;
	int quantity;
	String again;
	
	static int total;
	
	Scanner s = new Scanner(System.in);
	
	public void displayMenu() {
		
		System.out.println("#*#*#*#*#*#*#*#* Welcome To  Our ITvedant Cafe #*#*#*#*#*#*#*#*");
		System.out.println();
		System.out.println("==================================================================");
		System.out.println("             1.FrenchFries                            100/-");
		System.out.println("             2.Jumbo_Burger                           120/-");
		System.out.println("             3.Vadapaav_with_special_Tea                200/-");
		System.out.println("             4.Pizza                                  200/-");
		System.out.println("             5.Bhau_special_coldCoffee                150/-");
		System.out.println("             6.coldDrink                               70/-");
		System.out.println("             7.jumbo_ice_cr                           150/-");
		System.out.println("             8.Exit                                        ");
		System.out.println("==================================================================");
		System.out.println("                  What Do You Want to Order Today??????           ");
	}
	
	
	public void GenrateBill()
	{
	 
		System.out.println();
		System.out.println("***************** ThankYou   for  ordering ********************** ");
		System.out.println("*****************Your bill is  "+total+  "***********************");	
	}	
	
	
	
	public void order() {
		
		while(true) {
		
		System.out.println("Enter your choice");
		ch = s.nextInt();
		
		switch (ch) {
		case 1 :
		System.out.print("You have Selected French Fries");
		System.out.println("");			
		System.out.println("Enter the desiered Quantiy");
		quantity = s.nextInt();
		total = total + quantity*FrenchFries;
		break;
		
		case 2 :
			System.out.print("You have Selected Jumbo_Burger");
			System.out.println("");			
			System.out.println("Enter the desiered Quantiy");
			quantity = s.nextInt();
			total = total + quantity*Jumbo_Burger;
			
			break;
			
		case 3 :
			System.out.print("You have Selected Vadapaav_with_special_Tea");
			System.out.println("");			
			System.out.println("Enter the desiered Quantiy");
			quantity = s.nextInt();
			total = total + quantity*Vadapaav_with_special_Tea;
			break;
		
		case 4 :
			System.out.print("You have Selected Pizza");
			System.out.println("");			
			System.out.println("Enter the desiered Quantiy");
			quantity = s.nextInt();
			total = total + quantity*Pizza;
			break;
		
			
		case 5 :
			System.out.print("You have Selected Bhau_special_coldCoffee");
			System.out.println("");			
			System.out.println("Enter the desiered Quantiy");
			quantity = s.nextInt();
			total = total + quantity*Bhau_special_coldCoffee;
			break;
		
		case 6 :
			System.out.print("You have Selected coldDrink");
			System.out.println("");			
			System.out.println("Enter the desiered Quantiy");
			quantity = s.nextInt();
			total = total + quantity*coldDrink;
			break;
		
		case 7 :
			System.out.print("You have Selected jumbo_ice_cr");
			System.out.println("");			
			System.out.println("Enter the desiered Quantiy");
			quantity = s.nextInt();
			total = total + quantity*jumbo_ice_cr;
			break;
		
			
		case 8:
//			System.exit(1);
			System.out.println("Thank_your");
			break;
		
		default:
			System.out.println("Invaidal choice");
			break;
		}
		
		System.out.println("");

		System.out.print("Do you wish  to order anything else (Y/N):   ");
		again = s.next();
		
		if(again.equalsIgnoreCase("Y")) 
		{
			
			order();
		}
		
		
		
		
		else if (again.equalsIgnoreCase("N"))
		{
			GenrateBill();
			System.out.println("***************** Thankyour for visiting our Itvedant cafe ***********************");	

			System.out.println();
		
		}
		
		else {
			System.out.println("Invalid Choice");
		}
		
     	}
			
  	}
}
