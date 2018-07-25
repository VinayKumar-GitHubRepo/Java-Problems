import java.util.*;
class JosephusProblem
{
	public static void main(String... args)
	{
		ArrayList<Integer> numberOfPersons=new ArrayList<Integer>();
		for(int index=0; index<args.length; index++)
		{
			numberOfPersons.add(Integer.parseInt(args[index]));
		}
		int knife=1; //The index value which is to be removed from the "numberOfPersons" ArrayList.
		int changedarraylength = numberOfPersons.size();
		System.out.println("The people who are standing in a circle : "+numberOfPersons);
	    for(int loop=0; changedarraylength!=1; loop++)
		{
			int dead=knife;
			for(dead=knife; dead<changedarraylength; dead++)
			{
				numberOfPersons.remove(dead);
				changedarraylength--;
			}
			int rounddecleration=loop+1;
			String suffixes="th";
			if(rounddecleration<=3)
			{
				if(rounddecleration==1)
				{
					suffixes="st";
				}
				else if(rounddecleration==2)
				{
					suffixes="nd";
				}
				else if(rounddecleration==3)
				{
					suffixes="rd";
				}
			}
			System.out.println("The Survived people after "+rounddecleration+suffixes+" round:  "+numberOfPersons);
			if(dead==changedarraylength)
			{
				knife = 0;
			}
			else
		    {
				knife = 1;
			}
		}
	}
}