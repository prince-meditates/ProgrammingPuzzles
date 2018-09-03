package com.puzzles.draw;

import java.util.Scanner;

public class InverseTriangle {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter number of Rows Required for Triangle: ");
	int rows = sc.nextInt();
	int starsInTopRow = (2*rows)-1;
	System.out.println("Inverted Triangle \n ");
	/*Forming Inverse triange with stars */
	for(int i=0; i<rows; i++){
		for(int j=0; j<starsInTopRow; j++){
			if((j<i) || (j>=starsInTopRow-i)){
			System.out.print(" ");
			}else{
				System.out.print("*");
			}
		}
		System.out.println();
	}
	
	System.out.println();
	/* Forming Inverse triangle with stars in edge alone*/
	System.out.println("Edges alone in Inverted Triangles \n");
	for(int i=0; i<rows; i++){
		for(int j=0; j<starsInTopRow; j++){
			if((i==0)|| (j==i) ||(j==starsInTopRow-i-1)){
				System.out.print("*");
				
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
