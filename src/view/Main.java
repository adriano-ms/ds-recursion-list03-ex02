package view;

import java.util.Scanner;

import controller.OccurrencesController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		OccurrencesController oc = new OccurrencesController();
		
		
		int n = 0;
		int x = 0;
		do {
			System.out.print("First Number: ");
			n = sc.nextInt();
		}while(n < 10 || n > 999999);
		do {
			System.out.print("Second Number: ");
			x = sc.nextInt();
		}while(x < 0 || x > 9);
		
		System.out.println(oc.occurrences(n, x));
		
		sc.close();

	}

}
