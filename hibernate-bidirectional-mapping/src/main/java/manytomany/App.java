package manytomany;

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
         	
         	Employee employee1=new Employee();
        	Employee employee2=new Employee();

        	
        	Project project1=new Project();
        	Project project2=new Project();
        	
        	
        	employee1.setName("Aman");
        	employee1.setDesignation("Developer");
        	
        	employee2.setName("Ankita");
        	employee2.setDesignation("Designer");
        	
        	project1.setName("PRJ1");
        	project2.setName("PRJ2");
        	
        
        	project1.setEmployees(Arrays.asList(employee1, employee2));
        	project2.setEmployees(Arrays.asList(employee2));
        	
        	employee1.setProjects(Arrays.asList(project1, project2));     	
        	employee2.setProjects(Arrays.asList( project2));
        	
        	session.save(project1);
        	session.save(project2);
        	
         	transaction.commit();
         	
         	
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
         
       
    	
    	
    }
}
