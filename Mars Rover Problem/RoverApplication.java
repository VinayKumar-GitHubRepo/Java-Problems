import java.util.*;

class RoverApplication {
	public static void main ( String args[] ) {
		
		Scanner scan = new Scanner(System.in);
		int xUpperRightco = scan.nextInt();
		int yUpperRightco = scan.nextInt();
		Plateau plateau = new Plateau(xUpperRightco, yUpperRightco);
		
		int stop = 1;
		while (stop != 3) {
			int xCoordinate = scan.nextInt();
			int yCoordinate = scan.nextInt();
			char roverFacing = scan.next().charAt(0);
			
			Rover rover = new Rover(xCoordinate, yCoordinate, roverFacing);
			
			String commands = scan.next();;
			rover.receiveCommands(commands);
			
			rover.printPosition();
			
			stop++;
		}
	}
}