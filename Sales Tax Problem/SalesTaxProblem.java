import java.util.*;
import java.lang.*;
class SalesTaxProblem
{
	public static void main(String args[])
	{
		ArrayList<String> productlist =new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		ProductChecking productcheck=new ProductChecking();
		double price=0.0;
		int place=0;
		int exception=0;
		int stop=0;
		while(stop!=3)
		{
			String wordbeforeprice="not at";
			while(!(wordbeforeprice.equals("at")))
			{
				String readinput = scan.next();
				productlist.add(readinput);
				if(readinput.equals("imported"))
				{
					place=1;
				}
				if(readinput.equals("book")||readinput.equals("books"))
				{
					exception=1;
				}
				if(readinput.equals("chocolate")||readinput.equals("chocolates"))
				{
					exception=1;
				}
				if(readinput.equals("pills"))
				{
					exception=1;
				}
				if(readinput.equals("at"))
				{  
					wordbeforeprice="at";
					productlist.remove("at");
				}
			}
			price=scan.nextDouble();
			productcheck.checking(place,price,exception);
			Iterator<String> it = productlist.iterator();
			while(it.hasNext())
			{
				System.out.print(it.next()+" ");
			}
			productlist.clear();
			System.out.print(":"+" ");
			System.out.println(String.format("%.2f",(Math.round(productcheck.productcostwithtax*100.0)/100.0)));
			place=0;
			exception=0;
			stop++;
		}
		System.out.println("Sales Taxes: "+String.format("%.2f",(Math.round((productcheck.TotalTax())*100.0)/100.0)));
        System.out.println("Total: "+String.format("%.2f",(Math.round((productcheck.TotalCost())*100.0)/100.0))); 		
	}
}