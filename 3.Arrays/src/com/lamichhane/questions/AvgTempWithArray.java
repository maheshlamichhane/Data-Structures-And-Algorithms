package com.lamichhane.questions;

import java.util.Scanner;

public class AvgTempWithArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of days");
		int days = sc.nextInt();
		int[] array = new int[days];
		double sum = 0;
		for(int i=0; i<array.length;i++) {
			System.out.println("Enter the "+i+1+" days temperature");
			int temp = sc.nextInt();
			array[i] = temp;
			sum+=array[i];
		}
		
		double average = sum/days;
		int above=0;
		for(int i=0; i<array.length;i++) {
			if(array[i] > average) {
				above++;
			}
		}
		
		System.out.println("Average Temperature="+average);
		System.out.println(above+" days above average");

	}

}
