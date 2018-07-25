class Rover {
		int xCoordinate;
		int yCoordinate;
		char roverFacing;
		
		Rover (int x, int y, char facing) {
			this.xCoordinate = x;
			this.yCoordinate = y;
			this.roverFacing = facing;
		}
		
		void receiveCommands (String commands) {
			for ( int command = 0; command < commands.length(); command++ ) {
				if ( commands.charAt(command) == 'L' ) {
					turnLeft();
				} else if ( commands.charAt(command) == 'R' ) {
					turnRight();
				} else {
					moveForward();
				}
			}
		}
		
		void turnLeft() {
			switch(roverFacing) {
				case 'N' :
				{
					roverFacing = 'W';
					break;
				}
				case 'W' :
				{
					roverFacing = 'S';
					break;

				}
				case 'S' :
				{
					roverFacing = 'E';
					break;
				}
				case 'E' :
				{
					roverFacing = 'N';
					break;
				}
				
			}
		}
		
		void turnRight() {
			switch(roverFacing) {
				case 'N' :
				{
					roverFacing = 'E';
					break;
				}
				case 'E' :
				{
					roverFacing = 'S';
					break;
				}
				case 'S' :
				{
					roverFacing = 'W';
					break;
				}
				case 'W' :
				{
					roverFacing = 'N';
					break;
				}
				
			}
		}
		
		void moveForward() {
			switch(roverFacing) {
				case 'N' :
				{
					yCoordinate++;
					break;
				}
				case 'E' :
				{
					xCoordinate++;
					break;
				}
				case 'S' :
				{
					yCoordinate--;
					break;
				}
				case 'W' :
				{
					xCoordinate--;
					break;
				}
				
			}
		}
		
		void printPosition () {
			System.out.println(xCoordinate+" "+yCoordinate+" "+roverFacing);
		}
}