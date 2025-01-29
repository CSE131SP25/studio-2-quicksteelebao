package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Start Amount:");
		double startAmount = in.nextDouble();
		System.out.print("Win Chance (%):");
		int winChance = in.nextInt();
		System.out.print("Win Limit:");
		double winLimit = in.nextDouble();
		System.out.print("How many days?");
		int totalSimulations = in.nextInt();
		
		int totalPlays = 0;
		int totallost = 0;
		for (int simulations = 1; simulations <= totalSimulations; simulations ++) {
			double money = startAmount;
			while (money < winLimit && money > 0) {
				int	numberpolled = (int)(Math.random()*100)+1;
				if (numberpolled <= winChance) {
					money ++;//win
					totalPlays ++;
				}
				else {
					money --;//lose
					totalPlays ++;
				}
			}	
		
		if (money == winLimit) {
			System.out.println("Simulation: " + simulations + " " + totalPlays + " Congratulations");
			totalPlays = 0;
		}
		else {
			System.out.println("Simulation: " + simulations + " " + totalPlays + " Ruin");
			totalPlays = 0;
			totallost ++;
			
		}
		}
		System.out.println("Total Ruins" + totallost);
		System.out.println("Simulations" + totalSimulations);
	}
	
}

