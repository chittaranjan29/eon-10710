package org.sample;

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
        	
        	Book book=new Book(123, "Programming in Java", "james Gosling", 2000);
        	
        	session.save(book);
        	transaction.commit();
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
    	
    	
    }
}
