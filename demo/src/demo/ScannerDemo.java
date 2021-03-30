package demo;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("input something:");
		String line = sc.nextLine();
		System.out.println("you have inputed:"+line);
	}
}
