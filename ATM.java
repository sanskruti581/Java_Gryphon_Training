package RCOE;
import java.util.*;//use for DSA and Scanner
import java.text.*; //for format purpose ie here we need it for DecimalFormat to print money

class Account
{
	Scanner sc=new Scanner(System.in);
	DecimalFormat df1=new DecimalFormat("###,##0.00' Rupee '");
	DecimalFormat df2=new DecimalFormat("###,##0.00' Dollar '");
	private int CN;  //customer no
	private int PN; //pin no
	double CB=2000;  //current balance
	double SB=1000; //saving bal
	
	//Setters
	void setCustomerNumber(int CN)
	{
		this.CN=CN;
	}
	void setPINNumber(int PN)
	{
		this.PN=PN;
	}
	
	//Getters:it contains return keyword
	int getCustomerNumber()
	{
		return CN;
		
	}
	
	int getPINNumber()
	{
		return PN;
	}

	void getCurrentBalance() {
		System.out.println("current Account Balance " + df1.format(CB));
	}
	
	void getSavingBalance() {
		System.out.println("current Account Balance " + df1.format(SB));
	}
	
	
////**************************WITHDRAW*****************************************//////
	void getCurrentWithdrawInput() {
		System.out.println("\n Current Account Balance:  " +df1.format(CB));
		System.out.println("Enter Withdraw Amount:  ");
		double amount=sc.nextDouble();
		
		if(CB-amount>=0) { //CB>=0 IS NOT USEFUL FOR NET BANKING
			System.err.println("TRANSACTION SUCCESSFUL!!!!!");
			calcCurrentWithdraw(amount);   //output calc
			System.out.println("New current Account Balance " + df1.format(CB));
			
		
		}else {
			System.err.println("Insufficient Balance");
			
			
		}
	}
	
	void getSavingWithdrawInput() {
		System.out.println("\n Saving Account Balance" +df1.format(SB));
		System.out.println("Enter Withdraw Amount: ");
		double amount=sc.nextDouble();
		
		if(CB+amount>=0) { //CB>=0 IS NOT USEFUL FOR NET BANKING
			System.err.println("TRANSACTION SUCCESSFUL");
			calcSavingWithdraw(amount);   //output calc
			System.out.println("New current Account Balance " + df1.format(SB));
			
		
		}else {
			System.err.println("INVALID AMOUTN !");
			
			
		}
	}
	
	double calcSavingWithdraw(double amt) {
		SB=SB-amt;
		return SB;
		
		
		
	}
	double calcCurrentWithdraw(double amt){
		CB=CB-amt;
		return CB;
		
	}
	
////**************************DEPOSIT*****************************************//////
 	void getCurrentDepositInput() {
		System.out.println("\n Current Account Balance" +df1.format(CB));
		System.out.println("Enter Deposit Amount: ");
		double amount=sc.nextDouble();
		
		if(CB-amount>=0) { //CB>=0 IS NOT USEFUL FOR NET BANKING
			System.out.println("Transaction Successful");
			calcCurrentdep(amount);   //output calc
			System.out.println("new current Account Balance " + df1.format(CB));
			
		
		}else {
			System.out.println("Insufficient Balance");
			
			
		}
	}
 	
 	double calcCurrentdep(double amt) {
 		CB=CB+amt;
		return CB;
 		
 	}
 	
 	void getSavingDepositInput() {
		System.out.println("\n Current Account Balance" +df1.format(CB));
		System.out.println("Enter Deposit Amount: ");
		double amount=sc.nextDouble();
		
		if(CB-amount>=0) { //CB>=0 IS NOT USEFUL FOR NET BANKING
			System.out.println("Transaction Successful");
			calcSavingdep(amount);   //output calc
			System.out.println("new current Account Balance " + df1.format(CB));
			
		
		}else {
			System.out.println("Insufficient Balance");
			
			
		}
	}
 	
 	double calcSavingdep(double amt) {
 		CB=CB+amt;
		return CB;
 		
 	}


	
	
}
class optionMenu extends Account
{
	Scanner sc=new Scanner(System.in);
	HashMap<Integer, Integer> data=new HashMap();//store data in the key-value pair
	
	
	
	void getLogin()
	{
		do{
			try{
				
				
				//Bank- customer data
				data.put(11111,111);//use to put data into database
				data.put(11112,222);
				data.put(11113,333);
				data.put(11114,444);
				data.put(11115,111);
				
				System.out.println("Welcome to the SCOE!!");
				
				System.out.print("Enter customer number: ");
				setCustomerNumber(sc.nextInt());//abstraction
				
				System.out.print("Enter customer PIN: ");
				setPINNumber(sc.nextInt());
				
				
				int P=getCustomerNumber();
				int Q=getPINNumber();
				
				
				if(data.containsKey(P)&&data.get(P)==Q)
				{
					//System.out.print("Login Sucessful!");
					getAccountType();
					
				}
				else
				{
					System.err.print("Invalid customer number or pin number ");
					System.err.println("Enter VALID customer number or PIN number ");
					
				}	
			}
			catch(InputMismatchException e)
			{
				System.err.println("\nEnter only numbers.");
				System.err.println("\nCharacters and symbols are not allowed.\n");
				sc.next();//buffer zone is created here
				getLogin();
			}
			
			
		}while(true);
		
	}
	
	void getAccountType()
	{
		System.err.println("\nAccount type: ");
		System.out.println("\n1.Current Account\n2.Saving Account\n3.Exit\n Choice: ");
		int ch=sc.nextInt();
		
		switch(ch)
		{
		case 1:
			getCurrent();
			getAccountType();
			break;
			
		case 2:
			getSaving();
			getAccountType();

			break;
			
		case 3:
			System.out.println("\nThankyou for VISITING.");
			System.err.println("\nVISIT again");
			
			break;
			
		default:
			System.err.println("Invalid case!");
			System.out.println("Enter VALID CHOICE\n");
			getAccountType();//recursion
			break;
		}
		
	}
	
	void getCurrent() {
		System.err.println("\n Current Account");
		System.out.println("Choice 1:Balance Enquiry");
		System.out.println("Choice 2:Withdraw Money");
		System.out.println("Choice 3:Deposit Money");
		System.out.println("Choice 4:Exit");
		System.out.println("Enter Your Choice::");

		
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			getCurrentBalance();	
			
			break;
		case 2:
			getCurrentWithdrawInput();
			getCurrent();

			break;
		case 3:
			getCurrentDepositInput();
			getCurrent();
			break;
		case 4:
			System.out.println("\nThankyou for VISITING.");
			System.err.println("\nVISIT again");
			break;
			
		default:
			System.err.println("Invalid case!");
			System.out.println("Enter VALID CHOICE\n");	
			break;
			
		}
		
		
		
	}
	
	void getSaving() {
		System.err.println("\n Saving Account");
		System.out.println("Choice 1:Balance Enquiry");
		System.out.println("Choice 2:Withdraw Money");
		System.out.println("Choice 3:Deposit Money");
		System.out.println("Choice 4:Exit");
		System.out.println("Enter Your Choice::");

		
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			getSavingBalance();
			
			break;
		case 2:
			getSavingWithdrawInput();
			getSaving();

			break;
		case 3:
			getSavingDepositInput();
			getSaving();
			break;
		case 4:
			System.out.println("\nThankyou for VISITING.");
			System.err.println("\nVISIT again");
			break;
			
		default:
			System.err.println("Invalid case!");
			System.out.println("Enter VALID CHOICE\n");	
			break;
			
		}

		
		
	}
	
}

public class RCOE {
	public static void main(String[] args)
	{
		optionMenu rr=new optionMenu();
		rr.getLogin();
		
	}
	
}
