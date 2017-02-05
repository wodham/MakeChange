package makeChange;

import java.util.Scanner;

public class makeChange {
	public static void main(String[] args) {

		makeChange obj = new makeChange();

		obj.mainMethod();

	}

	public void mainMethod() {
		java.util.Scanner kb = new java.util.Scanner(System.in);

		boolean keepGoing = true;

		while (keepGoing) {

			System.out.print("Please enter your item value: ");
			double price = kb.nextDouble();

			System.out.print("Please enter your item tender: ");
			double tender = kb.nextDouble();

			error(price, tender);
			keepGoing = newTransaction(kb);
		}
		kb.close();
	}

	public void error(double price, double tender) {
		

		if (price > tender) {
			System.out.println("Sorry, not enough money for purchase.");
			
		} else if (price == tender) {
			System.out.println("Thank you for your payment.");
			
		} else {
			System.out.println("");
			twenty(price, tender);

		}
	}

	public void twenty(double price, double tender) {
		int cp = (int) (price * 100);
		int ct = (int) (tender * 100);
		int change = 0;
		int twenty = 20 * 100;
		int remainder20 = 0;
		change = ct - cp;

		if (change >= twenty) {
			int print20 = change / twenty;
			remainder20 = change % twenty;
			if (print20 > 1) {
				System.out.println("Twenties" + print20);
			} else if (print20 == 1) {
				System.out.println("Twenty" + print20);
			}

			ten(remainder20);
		} else {
			ten(change);
		}
	}

	public void ten(int remainder20) {

		int ten = 1000;
		int remainder10 = 0;

		if (remainder20 >= ten) {
			int print10 = remainder20 / ten;
			remainder10 = remainder20 % ten;

			if (print10 > 1) {
				System.out.println("Tens: " + print10);
			} else if (print10 == 1) {
				System.out.println("Ten: " + print10);
			}

			five(remainder10);
		}
		else{
			five(remainder20);
		}
	}

	public void five(int remainder10) {

		int five = 500;
		int remainder5 = 0;

		if (remainder10 >= five) {
			int print5 = remainder10 / five;
			remainder5 = remainder10 % five;

			if (print5 > 1) {
				System.out.println("Fives: " + print5);
			} else if (print5 == 1) {
				System.out.println("Five: " + print5);

			}
			one(remainder5);
		}
		else{
			one(remainder10);

		}

	}

	public void one(int remainder5) {
		int one = 100;
		int remainder1 = 0;

		if (remainder5 >= one) {
			int print1 = remainder5 / one;
			remainder1 = remainder5 % one;

			if (print1 > 1) {
				System.out.println("Ones: " + print1);
			} else if (print1 == 1) {
				System.out.println("One: " + print1);

			}
			quarter(remainder1);
		}
		else{
			quarter(remainder5);

		}
	}

	public void quarter(int remainder1) {
		int q = 25;
		int remainderQ = 0;

		if (remainder1 >= q) {
			int printq = remainder1 / q;
			remainderQ = remainder1 % q;

			if (printq > 1) {
				System.out.println("Quarters: " + printq);
			} else if (printq == 1) {
				System.out.println("Quarter: " + printq);

			}
			dime(remainderQ);
		}
		else{
			dime(remainder1);

		}
	}

	public void dime(int remainderQ) {
		int d = 10;
		int remainderD = 0;

		if (remainderQ >= d) {
			int printd = remainderQ / d;
			remainderD = remainderQ % d;

			if (printd > 1) {
				System.out.println("Dimes: " + printd);
			} else if (printd == 1) {
				System.out.println("Dime: " + printd);

			}
			nickle(remainderD);
		}
		else{
			nickle(remainderQ);
		}
	}

	public void nickle(int remainderD) {
		int n = 5;
		int remainderN = 0;

		if (remainderD >= n) {
			int print1 = remainderD / n;
			remainderN = remainderD % n;

			if (print1 > 1) {
				System.out.println("Nickles: " + print1);
			} else if (print1 == 1) {
				System.out.println("Nickle: " + print1);

			}
			penny(remainderN);
		} 
		else{
			penny(remainderD);
		}
	}

	public void penny(int remainderN) {
		int penny = 1;
		int remainderP = 0;

		if (remainderN >= penny) {
			int print1 = remainderN / penny;
			remainderP = remainderN % penny;

			if (print1 > 1) {
				System.out.println("Pennies: " + print1);
			} else if (print1 == 1) {
				System.out.println("Penny: " + print1);

			}
		}
	}

	public boolean newTransaction(Scanner kb) {

		System.out.println("Would you like to make a new transaction? y/n: ");
		String user = kb.next();

		if (user.equalsIgnoreCase("y")) {
			return true;
		} 
		else {
			return false;
		}
	}
}
