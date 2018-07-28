import java.util.*;
class TicTacToe
{
	public static void main(String [] args)
	{
		Scanner scan = new Scanner(System.in);
		String[][] xarray = {{"X","X","X"},{"X","X","X"},{"X","X","X"}};
		String[][] oarray = {{"O","O","O"},{"O","O","O"},{"O","O","O"}};
		String[][] spacearray = {{" "," "," "," "},{" "," "," "," "},{" "," "," "," "}};
		int totalx = 0;
		int totalo = 0;
		String turn = "X";
		int calculationbasedonassigningnumberx = 0;
		int calculationbasedonassigningnumbery = 0;
		int winnercalculation=0;
		int stop = 0;
		while(stop!=6)
		{
			if(turn.equals("X"))
			{
				System.out.println("Player \"X\" enter your move between (0-2) and (0-2) : ");
			}
			else if(turn.equals("O"))
			{
				System.out.println("Player \"O\" enter your move between (0-2) and (0-2) : ");
			}
			int valueofrow = scan.nextInt();
			int valueofcoloumn = scan.nextInt();
			if(turn.equals("X"))
			{
				if(!(xarray[valueofrow][valueofcoloumn].equals("NILL")))
				{
					xarray[valueofrow][valueofcoloumn]="NILL";
					oarray[valueofrow][valueofcoloumn]="NILL";
					spacearray[valueofrow][valueofcoloumn]="X";
					System.out.println(spacearray[0][0]+" | "+spacearray[0][1]+" | "+spacearray[0][2]);
					System.out.println("----------");
					System.out.println(spacearray[1][0]+" | "+spacearray[1][1]+" | "+spacearray[1][2]);
					System.out.println("----------");
					System.out.println(spacearray[2][0]+" | "+spacearray[2][1]+" | "+spacearray[2][2]);
					calculationbasedonassigningnumberx=calculationbasedonassigningnumberx+(valueofrow*10)+valueofcoloumn;
					turn="O";
				}
				else if(xarray[valueofrow][valueofcoloumn].equals("NILL"))
				{
					System.out.println("Sorry wrong move.Try Again");
					stop--;
					turn="X";
				}
				
			}
			else if(turn.equals("O"))
			{
			 	if(!(oarray[valueofrow][valueofcoloumn].equals("NILL")))
				{
					oarray[valueofrow][valueofcoloumn]="NILL";
					xarray[valueofrow][valueofcoloumn]="NILL";
					spacearray[valueofrow][valueofcoloumn]="O";
					System.out.println(spacearray[0][0]+" | "+spacearray[0][1]+" | "+spacearray[0][2]);
					System.out.println("----------");
					System.out.println(spacearray[1][0]+" | "+spacearray[1][1]+" | "+spacearray[1][2]);
					System.out.println("----------");
					System.out.println(spacearray[2][0]+" | "+spacearray[2][1]+" | "+spacearray[2][2]);
					calculationbasedonassigningnumbery=calculationbasedonassigningnumbery+(valueofrow*10)+valueofcoloumn;
					turn="X";
				}
				else if(xarray[valueofrow][valueofcoloumn].equals("NILL"))
				{
					System.out.println("Sorry wrong move.Try Again");
					stop--;
					turn="O";
				}	
			}
			stop++;
		}
		if(calculationbasedonassigningnumberx==30||calculationbasedonassigningnumberx==33||calculationbasedonassigningnumberx==36)
		{
			winnercalculation=winnercalculation+1;
			System.out.println("The winner is \"X\" ");
		}
		if(calculationbasedonassigningnumbery==30||calculationbasedonassigningnumbery==33||calculationbasedonassigningnumbery==36)
		{
			winnercalculation=winnercalculation+1;
			System.out.println("The winner is \"O\" ");
		}
		if(winnercalculation==0)
		{
			System.out.println("Draw - Better Luck Next Time");
		}
		else if(winnercalculation==2)
		{
			System.out.println("Both players are Winners");
		}
	}
}