package com.puzzles.draw;

import java.util.Scanner;

public class ProperTriangle {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Rows Required for a triangle");
	int rows = sc.nextInt();
	int starsInLargeSide = (2*rows)-1;
	/*Forming Inverse triange with stars */
	System.out.println("Proper Triangle \n");
	for(int i=0; i<rows; i++){
		for(int j=0; j<starsInLargeSide;j++){
			if(j>=rows-(i+1) && j<=starsInLargeSide-(rows-i)){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
	System.out.println();
	
	/*Forming Inverse triange with stars in edge alone */
	System.out.println("Edges alone in Proper Triangle \n");
	for(int i=0; i<rows; i++){
		for(int j=0; j<starsInLargeSide;j++){
			if(j==rows-(i+1) || j==starsInLargeSide-(rows-i) || i==rows-1){
				System.out.print("*");
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	
}
}
