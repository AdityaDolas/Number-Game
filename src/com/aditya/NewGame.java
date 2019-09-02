package com.aditya;

import java.util.Random;
import java.util.Scanner;

public class NewGame {
	public static void main(String[] args) {
		
		int level = 0, attempts = 0;
		
		
	
			/**
			 * Levels
			 */
			for(int j = 0; j < 3; j++)
			{
				if(j == 0)
					attempts = 10;
				else if(j == 1)
					attempts = 5;
				else 
					attempts = 1;
				
				/**
				 * Generate Random Number for this level
				 */
				Random r = new Random();
				int rand_int1 = r.nextInt(100);
				System.out.println("Random number = " + rand_int1 + " | Level = "  + (j + 1));
				
				
				/**
				 * Attempts logic
				 */
				for (int i = attempts; i > 0; i--) {
					
					System.out.println("Guess the number: ");
					Scanner obj = new Scanner(System.in);
					int a = obj.nextInt();
					if (a < rand_int1) {
						System.out.println("Sorry Your Guess was lower ! You have " + (i - 1) + " left");
					} else if (a > rand_int1) {
						System.out.println("Sorry your guess was higher ! You have " + (i - 1) + " left ");
					} else if (a == rand_int1) {
						System.out.println("wallah , you guessed it right.");
						System.out.println("You reached level 2");
						break;
					} else {
						System.out.println("You Lost Bitch");
						break;
						
					}
				}
				
				/**
				 * End of attempts logic
				 */
				
			}
			
			/**
			 * End of Levels
			 */
			}
		
	}


