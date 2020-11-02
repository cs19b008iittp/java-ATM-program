package casestudy_2;

public class deposit {
	int balance;
	void deposit(int money,int l)
	{
		int balance=money+l;
		System.out.println("the money is successfully deposited in your account");
		System.out.println("account balance "+balance);
        this.balance=balance;
	}
     int balance()
     {
    	 return this.balance;
     }
}
