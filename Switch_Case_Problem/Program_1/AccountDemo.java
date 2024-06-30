package Program_1;
import java.util.*;

class Account
{
  int ano;
  String cname;
  String city;
  int abal;
  static int cnt;
  
  public Account() 
  {
	super();  
	ano=++cnt;
	cname=null;
	city=null;
	abal=0;
  }
  public Account(int ano, String cname, String city, int abal) 
  {
	super();
	this.ano = ano;
	this.cname = cname;
	this.city = city;
	this.abal = abal;
  }

  public void accept()
  {
	try (Scanner sc = new Scanner(System.in)) {
		System.out.println("Account Id:"+ano);
		System.out.println("Customer Name:");
		cname=sc.next();
		System.out.println("Customer City:");
		city=sc.next();
	}
	System.out.println("Account Balance:"+abal);
  }
  public void display()
  {
	System.out.println("Account Id:"+ano);
	System.out.println("Customer Name:"+cname);
	System.out.println("Customer City:"+city);
	System.out.println("Account Balance:"+abal);
  }
}//end class

public class AccountDemo 
{
 public static void main(String[] args) 
 {
  Scanner sc= new Scanner(System.in);
  int ch=0;
  Account acc[]= new Account[100];
  do
  {
   System.out.println("1)Create Account");
   System.out.println("2)Display Account By Id");
   System.out.println("3)Deposit");
   System.out.println("4)withdraw");
   System.out.println("5)Transfer");
   System.out.println("6)Display All Account");
   System.out.println("7)Display Account By City");
   System.out.print("Enter your choice:");
   ch=sc.nextInt();
   switch (ch)
   {
    case 1:
    	   acc[Account.cnt]=new Account();
    	   acc[Account.cnt-1].accept();
	       break;
    case 2:
    	   System.out.println("Enter Account Id:");
    	   int acno=sc.nextInt();
    	   int flag=0;
    	   for(int i=0;i<Account.cnt;i++)
    	   {
    		   if(acc[i].ano==acno)
    		   {
    			   acc[i].display();
    			   flag=1;
    			   break;
    		   }
    	   }
    	   if(flag==0)
    	   {
    		 System.out.println("Invalid Account number....!"); 
    	   }
    	   break;
  case 3:    	

  default:
	break;
}
	  
  }while(ch!=10);
  

 }//end main
}//end class