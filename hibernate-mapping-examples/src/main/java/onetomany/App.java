package onetomany;

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
          	
            Courses course1=new Courses("Web development");
            Courses course2=new Courses("Web design");
            Courses course3=new Courses("Data Science");
            
            Student student=new Student("Raman", "Mumbai", "raman@test.com", Arrays.asList(course1,course2,course3));
            
            session.save(course1);
            session.save(course2);
            session.save(course3);
            session.save(student);
            
        
          	transaction.commit();
          }
          catch(Exception e)
          {
          	System.out.println(e.getMessage());
          }
          
        
      	
      	
    }
    
    
 
}
