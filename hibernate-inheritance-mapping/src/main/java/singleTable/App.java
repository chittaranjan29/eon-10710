package singleTable;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;



public class App 
{
    public static void main( String[] args )
    {
    	 Transaction transaction=null;
         try(Session session=Config.getSessionFactory().openSession())
         {
         	transaction=session.beginTransaction();
   
         	CreditAccount creditAccount=new CreditAccount();
         	creditAccount.setOwner("Mr. Raman");
         	creditAccount.setBalance(500000L);
         	creditAccount.setCreditLimit(1000000L);
         	creditAccount.setInterestRate(10.5);
         	
         	
         	DebitAccount debitAccount=new DebitAccount();
         	debitAccount.setOwner("Miss. Ankita");
         	debitAccount.setBalance(700000L);
         	debitAccount.setInterestRate(7.5);
         	debitAccount.setOverdraftFee(10000);
         	
         	
         	
         	
         	
         	
         	session.save(creditAccount);
         	session.save(debitAccount);
         	transaction.commit();
         	
         	
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
         
    	
    	
    }
}
