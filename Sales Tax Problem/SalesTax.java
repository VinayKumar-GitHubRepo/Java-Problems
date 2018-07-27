import java.math.BigDecimal; 
class SalesTax
{
	double price;
	double salestax;
	double totalvalueofproduct;
	double taxsales;
	SalesTax(double recievepriceofproduct,int exceptionproducts)
	{
		this.price=recievepriceofproduct;
		if(exceptionproducts>=1)
		{
			this.salestax=0.0;
		}
		else if(exceptionproducts==0)
		{
		salesTaxCalculation(recievepriceofproduct);
		}
	}
	void salesTaxCalculation(double recievedvalueforsalestax)
	{
	    taxsales=new BigDecimal((recievedvalueforsalestax*10)/100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		this.salestax=Math.round(taxsales*20.0)/20.0;
	}
	double receiveTotalValueOfProduct()
	{
		totalvalueofproduct=price+salestax;
		return totalvalueofproduct;
	}
	double receiveSalesTax()
	{
		return salestax;
	}
}