
public class Account {

	public static void main(String[] args) {
	}
		private int m_accountId = -1;
		private String m_accountName;
		private int m_customerId = -1;
		private double m_amount = 0.0;

		public Account(int accountId, String accountName, int customerId)
		{
			m_accountId = accountId;
			m_accountName = accountName;
			m_customerId = customerId;
		}
		public int getAccountId()
		{
			return m_accountId;
		}

		public void setAccountId(int accountId)
		{
			m_accountId = accountId;
		}

		public String getAccountName()
		{
			return m_accountName;
		}

		public void setAccountName(String accountName)
		{
			m_accountName = accountName;
		}
		public int getCustomerId()
		{
			return m_customerId;
		}
		public void setCustomerId(int customerId)
		{
	m_customerId = customerId;
		}

		private  void UpdateAmount(double newAmount)
		{
			m_amount = newAmount;
		}

		public void UpdateAmountSecurely(double newAmount, String password)
		{
			if (password != null) //always do a null check
			{
				if (password.equals("admin"))
				{
					UpdateAmount(newAmount);
	System.out.println("Updated amount in account id " + m_accountId + " to " + m_amount);
				}
				else
				{
					System.out.println("Call the police! Unsecure access!!");
				}
			}
		}
	


	

		public static void main1(String[] args)
		{
			Account savingsAccount = new Account(123, "Savings", 456);
			savingsAccount.UpdateAmountSecurely(500, "admin");
			//savingsAccount.UpdateAmountSecurely(0, "thief");
			//savingsAccount.m_amount = 0;
	//System.out.println("Updated amount in account id " + savingsAccount.m_accountId + " to " + savingsAccount.m_amount);

		}



	}


