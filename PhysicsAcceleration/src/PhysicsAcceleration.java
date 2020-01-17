import java.util.Scanner;
public class PhysicsAcceleration {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner input = new Scanner(System.in);

		// TODO Auto-generated method stub

		System.out.println("Enter v0: ");
		double v0 = input.nextDouble();

		System.out.println("Enter v1: ");
		double v1 = input.nextDouble();

		System.out.println("Enter time: ");
		double time = input.nextDouble();

		double averageAcc = (v1 - v0)/time;

		System.out.println("The average acceleration is "
		                   + averageAcc);
		
	}

}
