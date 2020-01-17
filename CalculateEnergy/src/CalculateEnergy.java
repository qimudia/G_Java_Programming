import java.util.Scanner;

public class CalculateEnergy {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
			//Create a Scanner
				Scanner input = new Scanner(System.in);
				
				System.out.println("Enter the amount of water in kilograms: ");
				double M = input.nextDouble();
				
				System.out.println("Enter the initial temperature: ");
				double initialTemp = input.nextDouble();
				
				System.out.println("Enter the final temperature: ");
				double finalTemp = input.nextDouble();
				
				double Q = M * (finalTemp - initialTemp) * 4184;
						
				System.out.println("The energy needed is " + Q);
			}

		}

