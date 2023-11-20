package model.application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double iBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double wLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, iBalance, wLimit);
	
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(null);
			
			System.out.println(account);
		}
		catch(RuntimeException e) {
			System.out.println("Withdraw error: " + e.getMessage());
		}
		
		sc.close();
	}

}
