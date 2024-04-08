package manytomany;

import java.lang.reflect.Array;
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
          	
          	
          	Project project1=new Project("A");
          	Project project2=new Project("B");
          	Project project3=new Project("C");
          	
          	Employee employee=new Employee("Krishna", "Developer", 70000, Arrays.asList(project1,project2,project3));
        
          	session.save(project1);
          	session.save(project2);
          	session.save(project3);
          	session.save(employee);
          	transaction.commit();
          }
          catch(Exception e)
          {
          	System.out.println(e.getMessage());
          }
          
        
      	
      	
    }
    
    
 
}
