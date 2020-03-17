package com.meritamerica.assignment3;

import java.io.*;
import java.text.ParseException;
import java.util.Arrays;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		MeritBank.readFromFile("src/test/testMeritBank_good.txt");
/*		
		//try
		AccountHolder ah1 = new AccountHolder();
		AccountHolder ah2 = new AccountHolder();
		
		CheckingAccount chk1 = new CheckingAccount(100);
		CheckingAccount chk2 = new CheckingAccount(200);
		CheckingAccount chk3 = new CheckingAccount(200);
		CheckingAccount chk4 = new CheckingAccount(200);
		
		
		
		ah1.addCheckingAccount(chk1);
		ah1.addCheckingAccount(chk2);
		
		CheckingAccount array1[] = ah1.getCheckingAccounts();
		
		for(int i=0; i<array1.length-1; i++) {
			System.out.println(array1[i].getBalance());
		}
		
		ah2.addCheckingAccount(chk3);
		ah2.addCheckingAccount(chk4);
		CheckingAccount array2[] = ah1.getCheckingAccounts();
		
		for(int i=0; i<array2.length-1; i++) {
			System.out.println(array2[i].getBalance());
		}
		
		*/
		//to see the output in console other than writing a file
		System.out.println(MeritBank.writeToFile());
	}
}