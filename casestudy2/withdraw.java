package casestudy_2;

public class withdraw {
    int newbalance;
    int count=0;
	void withdraw(int money,int balance)
	{
		//int count=0;
		this.newbalance=balance;
		if(money>balance)
		{
			System.out.println("your account balance is less ");
			System.out.println("reduce your withdrawl amount");
			this.count++;
		}
		if(balance==0&&money>balance)
		{
			System.out.println("your account balace is 0 u cannot withdraw money");
			this.count++;
		}
		if(money<=balance)
		{
			this.newbalance=balance-money;
			System.out.println("your withdrawl is successful ");
			System.out.println("account balance:"+this.newbalance);
			this.count=0;
		}
	}
	  int  newbalance()
	  {
		  return this.newbalance;
	  }
	  int count_number()
	  {
		  return this.count;
	  }
}
