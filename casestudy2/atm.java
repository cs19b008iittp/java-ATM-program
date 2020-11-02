package casestudy_2;

import java.util.*;
import java.lang.*;
//use the account details created in the program to check the proper execution of the program


public class atm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		String yn="no";
		String str="no";
		int j=0;
		int []a=new int[100];
	    //int p=0,q=0;
		int r=0;
		int var1=0,var2=0,var3=0;
		do {
				 Scanner scan=new Scanner(System.in);
				 int i=0,k=0,z=0;
				 int flag=0,count=0,count1=0;
				String  accountant_name;
				int account_number;
				int account_password;
				int account_balance;
		          accounts [] obj= new accounts[12];
		          obj[1]=new accounts( "roopa",12567,45672,150000);
		          obj[2]=new accounts("anitha",35671,28934,20000);
		          obj[3]=new accounts("saritha",28837,20937,10000);
		          obj[4]=new accounts("meghana",38912,59034,20000);
		          obj[5]=new accounts("chandhan",29034,92378,2000);
		          obj[6]=new accounts("mohan",29345,20384,50000);
		          obj[7]=new accounts("gowtami",10922,39023,4900);
		          obj[8]=new accounts("sahithi",39203,19024,30000);
		          obj[9]=new accounts("samhitha",29991,38645,1000);
		          obj[10]=new accounts("karthik",19237,20387,40000);
		          System.out.println("  ");
		          System.out.println("welcome to our local bank atm");
		          System.out.println("enter  account number:");
		          account_number=scan.nextInt();
		        
		         for(i=1;i<=8;i++)
		          {
		        	  if(obj[i].number()==account_number)
		        	  {
		        		  count++;
		        		  k=i;
		        	  }
		          }

		         if(count>0)
		            {
		        	   //System.out.println("account is valid");
		               System.out.println("enter password:");
		               account_password=scan.nextInt();
		               int var=obj[k].balance();
		               for(i=1;i<=8;i++)
				          {
				        	  if(obj[i].pincode()==account_password)
				        	  {
				        		  count1++;
				        		  k=i;
				        	  }
				          }
		                  if(count1>0)
		                  {
		                	  /*System.out.println("USER DETAILS");
		                	  System.out.println("user name:       "+obj[k].name());
					     	   System.out.println("account number : "+obj[k].number());
					     	   System.out.println("account password:"+"  *****");
					     	     System.out.println("account balance: "+obj[k].balance());*/
		                	  do {
					     	    deposit b=new deposit();
					     	   withdraw c=new withdraw();
					     	   System.out.println("");
							      System.out.println("enter 1 : if u want to deposit money in your account");
							      System.out.println("enter 2: if u want to withdraw money from your account");
							      System.out.println("enter 3:if u want to see your account details ");
							      System.out.println("enter 4:if u want to exit ");
							      //int var=obj[k].balance();
							    //  int p=0,q=0;
							      int ch=scan.nextInt();
							      switch(ch)
							      {
							      case 1:
							    	//  int balance=obj[k].balance();
							    	  System.out.println("");
							    	  System.out.println("enter amount of money u want to deposit:");
							    	  int money=scan.nextInt();
							     	    b.deposit(money, var);
							     	    var1=b.balance();//stores the updated balance 
							     //var is a variable that stores initial balance 
							     	   a[j]=var;
								    	  var=var1;
								    	  var1=a[j];
								    	  j++;
							    	   break;
							      case 2:
							    	  do {
							    		  System.out.println("");
							    	  System.out.println("enter amount of money u want to withdraw:");
							    	  int money1=scan.nextInt();
							    	  c.withdraw(money1,var);
							    	  var2=c.newbalance();
							    	  a[j]=var;
							    	  var=var2;
							    	  var2=a[j];
							    	  j++;
							    	  r=c.count_number();
							    	//  System.out.println(r);
							    	  }while(r>0);
							    	  break;
							      case 3:
							      System.out.println("");
							      System.out.println("USER ACCOUNT DETAILS:");
							      System.out.println("user name         :"+obj[k].name());
						     	   System.out.println("account number     :   "+obj[k].number());
						     	   System.out.println("account password  :"+"*****");
						     		 System.out.println("account balance   :"+ var);
						     	   break;
							      case 4:
							    	  System.exit(0);
							    	  break;
							      }
							     
					               System.out.println(" ");
					              // System.out.println("updated balance"+var);
					               System.out.println("enter yes if u want to perform any other transactions");
					               str=scan.next();

		                  } while(str.equals("yes"));
		                  }
		                  else {
		                	  System.out.println(" ");
		                	System.out.println("incorrect password try again");
		                    z++;
		                  }
		          }
               if(count==0)
               {
            	   System.out.println(" ");
            	   System.out.println("account number is not valid");
            	   System.out.println("restart authentication process");
               }
               if(  count==0||z>0)
               {
                 yn="yes";
               }
               if(count!=0&&z==0)
               {
            	   yn="no";
               }
            /*   System.out.println(" ");
               System.out.println("enter yes if u want to perform any other transactions");
               str=scan.next();*/
		}while(yn.equals("yes"));
		        
              
		      }
}