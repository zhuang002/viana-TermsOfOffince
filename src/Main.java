import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Method 1: using LCM. Every 60 years, all positions would changed.
		 * Step 1. read in X, Y
		 * Step 2. Loop to print out X+60*i until larger than Y
		 * 
		 * Method 2: if you do not know mathematics, you try every year to see if all the positions change in this year.
		 * Step 1. read in X, Y
		 * Step 2. Using for loop, starting from 0 until Y-X.
		 * 	Step 2.1 If i is divisable by 4,2,3,and 5, then print out this year.
		 */
		
		// step 1
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		// step 2. method 1
		for (int year=x; year<=y; year+=60) {
			System.out.println(year);
		}
		
		
		// step 2. method 2
		
		for (int i=0;i<=y-x;i++) {
			if (i % 4==0 && i %2 ==0 && i%3==0 && i%5==0) {
				System.out.println(x+i);
			}
		}
	}

}
