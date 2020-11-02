package casestudy_2;

public class accounts {
		int i=0;
		String accountant_name;
		int account_number;
		int account_password;
		int account_balance;
		
			public  accounts(String accountant_name,int account_number,int account_password,int account_balance)
		  {
	           this.accountant_name=accountant_name;
	           this.account_number=account_number;
	           this.account_password=account_password;
	           this.account_balance=account_balance;
		  }
			
			

			String name()
			 {
				 return this.accountant_name;
			 }
			 int number()
			 {
				 return this.account_number;
			 }
			 int pincode()
			 {
				 return this.account_password;
			 }
			 int balance()
			 {
				 return this.account_balance;
			 }
			
	}

