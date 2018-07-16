package test;

import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine());
		
			String input =sc.nextLine();
			
			if(input.length() <= 100 && !(input.isEmpty())) {
				System.out.println(input);
				}
			sc.close();
	}
}
