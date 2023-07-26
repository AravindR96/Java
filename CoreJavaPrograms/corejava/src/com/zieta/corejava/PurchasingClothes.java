

package com.zieta.corejava;

import java.util.Scanner;

public class PurchasingClothes {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the rate");
	int rate=sc.nextInt();
	System.out.println("Enter the quantity");
		int quantity=sc.nextInt();
		int amount = rate * quantity;
		if(amount<=1000) {
			System.out.println("there is no discount applicable here  your payable amount is "+ amount);
		}
		else if(amount<=2000) {
			int Discount=amount*5/100;
			int Finalamount =amount -Discount;
			
			System.out.println("your discount amount is = " + Discount +" "+" Final amount to pay  "+Finalamount );
		}
		else if(amount<=3000) {
			int Discount=amount*10/100;
			int Finalamount =amount -Discount;
			
			System.out.println("your discount amount is = "+ Discount +" "+"Final amount to pay  "+ Finalamount );
		}
		else if(amount<=4000) {
			int Discount=amount*15/100;
			int Finalamount =amount -Discount;
			
			System.out.println("your discount amount is = "+ Discount + " "+"Final amount to pay  " + Finalamount );
		}
		else if(amount>4000) {
			int Discount=amount*25/100;
			int Finalamount =amount -Discount;
			
			System.out.println("your discount amount is = "+ Discount +" " +"Final amount to pay  "+ Finalamount );
		}
		
	}

}
