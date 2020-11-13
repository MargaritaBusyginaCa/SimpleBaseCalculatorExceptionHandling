//Author:Margarita Busygina
//Completed as a part of practice exercise
import java.util.Scanner;
import javax.swing.JOptionPane;
public class MainDiscountCalculator {
	

	
		
		public static double computeDiscountInfo(double price, double discountRate) {
			double savings;
			savings=price*discountRate/100;
			return savings;
		}
		
	  
		public static void main(String[] args) {
			double price;
			double discount;
			double savings;
			String strPriceInput;
			String discountInput;
			String savingsInput;
			
		strPriceInput=JOptionPane.showInputDialog(null, "Enter cutoff price for discount");
		price=Double.parseDouble(strPriceInput);
		
		discountInput=JOptionPane.showInputDialog(null, "Enter discount rate as a whole number");
		discount=Double.parseDouble(discountInput);
		
		
		savings=computeDiscountInfo(price, discount);
		
		
		System.out.println("Special this week in any service over "+ price);
		System.out.println("Discount of "+discount+" percent");
		System.out.println("That's a savings of at least $ "+savings);
			

		}

	}


