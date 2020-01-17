import java.util.Scanner;

public class CalculateTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the subtotal: ");
		double subtotal = input.nextDouble();

		System.out.println("Enter the gratuity rate: ");
		double gratRate = input.nextDouble();

		double gratuity = gratRate / subtotal;
		double total = subtotal + gratuity;

		System.out.println("The gratuity is $"+ gratuity +
		" and total is $" +total);
		}

		}


