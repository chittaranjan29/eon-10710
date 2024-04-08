package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class App 
{
    public void save()
    {

    	StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("configuration.xml").build();
    	Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
    	
    	
    	SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Student student=new Student(111, "Anil Sharma", "Mumbai", "X", "1");
    	
    	
    	session.save(student);
    	
    	
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    	
    }
    
    
    
    public void fetchRecord(Long id)
    {
    	StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("configuration.xml").build();
    	Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
    	
    	
    	SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	
    	Student student=session.get(Student.class, id);
    	//Student student1=session.load(Student.class, id);


    	System.out.println(student);
      //	System.out.println(student1);
    	transaction.commit();
    	session.evict(student);
    	session.close();
    	sessionFactory.close();
    	

    }
    
    
    public void updateRecord(Student student)
    {
    	StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("configuration.xml").build();
    	Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
    	
    	
    	SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    
    	
    	session.saveOrUpdate(student);
    	session.update(student);
    	transaction.commit();
    	
    	session.close();
    	sessionFactory.close();
    	

    }
    
    
    public void delete(Long id)
    {
    	StandardServiceRegistry standardServiceRegistry=new StandardServiceRegistryBuilder().configure("configuration.xml").build();
    	Metadata metadata=new MetadataSources(standardServiceRegistry).getMetadataBuilder().build();
    	
    	
    	SessionFactory sessionFactory=metadata.getSessionFactoryBuilder().build();
    	Session session=sessionFactory.openSession();
    	Transaction transaction=session.beginTransaction();
    	Student student=session.get(Student.class, id);
    	
    	if(student !=null)
    	{
    		session.remove(student);
    		transaction.commit();
    		System.out.println("Object is deleted!!");
    	}
    	else
    	{
    		System.out.println("Object not found!!");
    	}
    }
    
    public static void main( String[] args )
    {
      	new App().fetchRecord(new Long(123));
    	new App().fetchRecord(new Long(101));
    	Student student=new Student(111, "Anil Sharma", "Chennai", "XI", "5");
    	new App().updateRecord(student);
    	
    	new App().delete(111L);
    }
   }

