package onetoone;

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
         	InstructorDetail instructorDetail=new InstructorDetail();
         	
         	instructor.setName("Kumar");
         	instructor.setCity("Hyderabad");
         	instructor.setEmail("kumar@test.com");
         	
         	instructorDetail.setLinkedIn("https://www.linkedin.com/kumar");
         	instructorDetail.setYoutube("https://www.youtube.in/kumar");
         	
         	
         	instructor.setInstructorDetail(instructorDetail);
         	instructorDetail.setInstructor(instructor);
         	
         	session.save(instructor);
         	session.save(instructorDetail);
         	
         	transaction.commit();
         	
         	
         }
         catch(Exception e)
         {
         	System.out.println(e.getMessage());
         }
         
       
    	
    	
    }
}
