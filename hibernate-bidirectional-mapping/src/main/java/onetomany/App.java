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
         	
         	Instructor instructor=new Instructor();
            Course course1=new Course();
            Course course2=new Course();
            Course course3=new Course();
            
            
         	instructor.setName("Kumar");
         	instructor.setCity("Hyderabad");
         	instructor.setEmail("kumar@test.com");
         	
         	course1.setTitle("Java");
         	course2.setTitle("Python");
         	course3.setTitle("C#");
         	
         	
         	course1.setInstructor(instructor);
         	course2.setInstructor(instructor);
         	course3.setInstructor(instructor);
         	
         	instructor.setCourses(Arrays.asList(course1,course2,course3));
         	
         	session.save(instructor);
         	
         	
         	transaction.commit();
         	
         	
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
         
       
    	
    	
    }
}
