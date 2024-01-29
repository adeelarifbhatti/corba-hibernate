package com.CorbaHibernate.Server;

import java.util.HashMap;
// for hibernate
import org.hibernate.Session;    
import org.hibernate.SessionFactory;    
import org.hibernate.Transaction;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.CorbaHibernate.CountryCapital.CountryCapitalTestPOA;
import com.CorbaHibernate.Model.DataSetModel;

public class Servant extends CountryCapitalTestPOA {
	private HashMap<String, DataSetModel> cC = new HashMap<>();
	
	@Override
	public String putValues(int id,String country, String capital) {
		String done="Done";
		DataSetModel dataSetModel =new DataSetModel(id,country,capital);
		cC.put(country, dataSetModel);
		
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        SessionFactory factory = meta.getSessionFactoryBuilder().build();  
        Session session = factory.openSession();  
        Transaction t = session.beginTransaction(); 
        session.save(dataSetModel); 
        t.commit();
        System.out.println("Stored in MySQL");    
        factory.close();  
        session.close();  
        
		//System.out.println("Entered the hashMap"+country+ " And " +capital);
		return done;
	}

	@Override
	public String getCapital(String country) {
		String answer;
		int id;
		if(cC.containsKey(country)) {
		return "ID is "+cC.get(country).getId()+ " Capital is "+cC.get(country).getCapital();
		}
		String result="not found";
		return result;
	}
}
