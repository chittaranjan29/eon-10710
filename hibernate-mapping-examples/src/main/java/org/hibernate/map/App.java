package org.hibernate.map;

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
          	
            //Driver driver=new Driver("demo","54654645");
          	//Car car=new Car( "TN-40H-38833", "demo", "test", "black", driver);
          	//session.save(driver);
          	//session.save(car);
          	
          	new App().fetchCar();
          	new App().fetchDriver();
          	transaction.commit();
          }
          catch(Exception e)
          {
          	System.out.println(e.getMessage());
          }
          
        
      	
      	
    }
    
    
    public void fetchCar()
    {
    	Session session=Config.getSessionFactory().openSession();
    	Car car=session.get(Car.class, 1L);
    	Driver driver=car.getDriver();
    	
    	System.out.println(car);
    	System.out.println(driver);
    }
    
    public void fetchDriver()
    {
    	Session session=Config.getSessionFactory().openSession();
    	
    	Driver driver=session.get(Driver.class, 1L);
    	
    	System.out.println(driver);
    }
}
