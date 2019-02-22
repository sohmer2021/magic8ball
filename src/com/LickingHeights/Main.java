package com.LickingHeights;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/*Without a doubt x
		 * Absolutely x
		 * The answer is yes x
		 * The outlook is good x
		 * signs point to yes x
		 * the answer is no x
		 * doubtful x
		 * uncertain x
		 * don't count on it x
		 * outlook not so good x*/

		/*int firstValue = 1-10;
		int secondValue = 11-20;
		int thirdValue = 21-30;
		int fourthValue = 31-40;
		int fifthValue = 41-50;
		int sixthValue = 51- 60;
		int seventhValue = 61-70;
		int eighthValue = 71-80;
		int ninthValue= 81-90;
		int tenthValue = 91-100;*/
		Scanner keyboard;

		int input;

		keyboard = new Scanner(System.in);
		System.out.println("Pick a number between 1 and 100");
		input = keyboard.nextInt();

		if (input >= 1 && input <= 10) {
		System.out.println("The answer is no");
		} else if (input >= 11 && input <= 20) {
		System.out.println("Without a doubt");
		} else if (input >= 21 && input <= 30) {
		System.out.println("Outlook not so good");
		} else if (input >= 31 && input <= 40) {
		System.out.println("Absolutely");
		} else if (input >= 41 && input <= 50) {
		System.out.println("The answer is yes");
		} else if (input >= 51 && input <= 60) {
		System.out.println("Don't count on it");
		} else if (input >= 61 && input <= 70) {
		System.out.println("Signs point to yes");
		} else if (input >= 71 && input <= 80) {
		System.out.println("Doubtful");
		} else if (input >= 81 && input <= 90) {
		System.out.println("Uncertain");
		} else if (input >= 91 && input <= 100) {
		System.out.println("The outlook is good");
		}
	}
}
