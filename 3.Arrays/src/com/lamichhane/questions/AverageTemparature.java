package com.lamichhane.questions;

import java.util.Scanner;

public class AverageTemparature {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of days");
		int days = sc.nextInt();
		double sum = 0;
		for(int i=1; i<=days; i++) {
			System.out.println("Enter the "+i+" day temperature");
			int temp = sc.nextInt();
			sum+=temp;
		}
		
		double averageTemp = sum/days;
		System.out.println("Average Temperature="+averageTemp);

	}

}
