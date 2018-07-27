class ProductChecking
{
	double totalcost;
	double totaltax;
	double productcostwithtax;
	void checking(int productplace,double priceofproduct,int exceptionval)
	{
		if(productplace==1)
		{
			ImportedTax importtax = new ImportedTax(priceofproduct,exceptionval);
			this.productcostwithtax=importtax.receiveTotalValueOfProductImported();
			this.totalcost=totalcost+importtax.receiveTotalValueOfProductImported();
			this.totaltax=totaltax+importtax.receiveTaxImported();

		}
		else if(productplace==0)
		{
			SalesTax saletax =new SalesTax(priceofproduct,exceptionval);
			this.productcostwithtax=saletax.receiveTotalValueOfProduct();
			this.totalcost=totalcost+saletax.receiveTotalValueOfProduct();
			this.totaltax=totaltax+saletax.receiveSalesTax();
			
		}
	}
	double TotalCost()
	{
		return totalcost;
	}
	double TotalTax()
	{
		return totaltax;
	}
}