package application;

import java.util.Scanner;

import entitie.printService;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		printService<Integer> ps = new printService<>();
		
		System.out.print("How many values do you wish?");
		int quantity = sc.nextInt();
		
		for(int i=0;i<quantity;i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		ps.print();
		System.out.println();
		System.out.println("First: " + ps.first());
		
		sc.close();
	}

}
