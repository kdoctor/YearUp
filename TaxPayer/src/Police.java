
public class Police implements ITaxPayer {
	
	private double m_income;
	private boolean m_donePayingTaxes = false;

	public  Police(double income)
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
			System.out.println("Police has filled taxes");}
		else
		{System.out.println("Police needs to pay taxes before filing");}
		
	}}