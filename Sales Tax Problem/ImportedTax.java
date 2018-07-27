import java.math.BigDecimal; 
class ImportedTax
{
	double priceofimported;
	double taxofimported;
	double totalvalueofproductimported;
	double taximported;
	
	ImportedTax(double recievepriceofproductimported,int exceptionproducts)
	{
		this.priceofimported=recievepriceofproductimported;
		if(exceptionproducts>=1)
		{ 
		importedTaxCalculationfive(recievepriceofproductimported);
		}
		else if(exceptionproducts==0)
		{
		importedTaxCalculationfifteen(recievepriceofproductimported);
		}
	}
	void importedTaxCalculationfifteen(double recievedvalueforimportedtax)
	{
		taximported=new BigDecimal((recievedvalueforimportedtax*15)/100).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		this.taxofimported=Math.round(taximported*20.0)/20.0;
	}
    void importedTaxCalculationfive(double recievedvalueforimportedtax)
	{
		taxofimported=new BigDecimal((recievedvalueforimportedtax*5)/100).setScale(1, BigDecimal.ROUND_HALF_UP).doubleValue();
	}
	double receiveTotalValueOfProductImported()
	{
		totalvalueofproductimported=priceofimported+taxofimported;
		return totalvalueofproductimported;
	}
	double receiveTaxImported()
	{
		return taxofimported;
	}
}