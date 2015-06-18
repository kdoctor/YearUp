
public class Banker implements ITaxPayer {

	private double m_income;
	private boolean m_donePayingTaxes = false;

	public  Banker(double income)
	{
		setIncome(income);
	}
	public double getIncome() {
		return m_income;
	}


	private void setIncome(double income) {
		m_income = income;
	}
	
	public void PayTaxes(double taxRate)
	{ 
		if (m_donePayingTaxes == false)
	{
		double taxes = taxRate * getIncome();
		double newIncome = getIncome() -taxes;
		setIncome(newIncome);
		m_donePayingTaxes = true;
	}
		else {
			System.out.println("I paid already.");
		}
}
	public void FileTaxReturn(){
		if (m_donePayingTaxes)
		{
			System.out.println("Banker has filled taxes");}
		else
		{System.out.println("Banker needs to pay taxes before filing");}
		
	}
	public static void main(String[] args)
	{
		Banker blankfein=new Banker(500000);
		blankfein.PayTaxes(.33);
		blankfein.FileTaxReturn();
		
		Doctor scope= new Doctor(100000);
		scope.PayTaxes(.45);
		scope.FileTaxReturn();
		
		Police bully= new Police(35000);
		bully.PayTaxes(.25);
		bully.FileTaxReturn();
		
		

	}
	}


