package singleTable;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

public class Config {
	
	private static SessionFactory sessionFactory=null;
	
	
	public static SessionFactory getSessionFactory()
	{
			try 
			{
			      Configuration configuration=new Configuration();
					
					Properties properties=new Properties();
					properties.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
					properties.put(Environment.URL, "jdbc:mysql://localhost:3306/singleTable");
					properties.put(Environment.USER, "root");
					properties.put(Environment.PASS, "root");
					properties.put(Environment.SHOW_SQL, true);
					properties.put(Environment.HBM2DDL_AUTO, "update");
				
					configuration.setProperties(properties);
					configuration.addAnnotatedClass(Account.class);
					configuration.addAnnotatedClass(DebitAccount.class);
					configuration.addAnnotatedClass(CreditAccount.class);
					
					ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
							.applySettings(configuration.getProperties()).build();
					
					
					sessionFactory=configuration.buildSessionFactory(serviceRegistry);
					
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
				return sessionFactory;
			
		}
		
}

