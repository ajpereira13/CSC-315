package edu.exeter.cs;

public class MakeChangeMain {

	public static void main(String[] args) {
		
		MakeChange(177.68);
	}
	
	public static void MakeChange(double amount) {
		int numOneHundred = (int) (amount / 100);
		amount = amount - 100 * numOneHundred;
		int numTen = (int) (amount / 10);
		amount = amount - 10 * numTen;
		int numFive = (int) (amount / 5);
		amount = amount - 5 * numFive;
		int numOne = (int) (amount / 1);
		amount = amount - 1 * numOne;
		int numQuarter = (int) (amount / 0.25);
		amount = amount - 0.25 * numQuarter;
		int numDime  = (int) (amount / 0.1);
		amount = amount - 0.1 * numDime;
		int numNickel = (int) (amount / 0.05);
		amount = amount - 0.05 * numNickel;
		int numPenny = (int) (amount / 0.01);
		if (numOneHundred == 1) {
			System.out.println(numOneHundred + " One Hundred Dollar Bill");
		} else {
			System.out.println(numOneHundred + " One Hundred Dollar Bills");
		}
		if (numTen == 1) {
			System.out.println(numTen + " Ten Dollar Bill");
		} else {
			System.out.println(numTen + " Ten Dollar Bills");
		}
		if (numFive == 1) {
			System.out.println(numFive + " Five Dollar Bill");
		} else {
			System.out.println(numFive + " Five Dollar Bills");
		}
		if (numOne == 1) {
			System.out.println(numOne + " One Daollar Bill");
		} else {
			System.out.println(numOne + " One Dollar Bills");
		}
		if (numQuarter == 1) {
			System.out.println(numQuarter + " Quarter");
		} else {
			System.out.println(numQuarter + " Quarters");
		}
		if (numDime == 1) {
			System.out.println(numDime + " Dime");
		} else {
			System.out.println(numDime + " Dimes");
		}
		if (numNickel == 1) {
			System.out.println(numNickel + " Nickel");
		} else {
			System.out.println(numNickel + " Nickels");
		}
		if (numPenny == 1) {
			System.out.println(numPenny + " Penny");
		} else {
			System.out.println(numPenny + " Pennies");
		}
	}
	
}
