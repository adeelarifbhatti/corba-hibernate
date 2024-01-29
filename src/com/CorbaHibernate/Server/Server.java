package com.CorbaHibernate.Server;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;

import com.CorbaHibernate.CountryCapital.CountryCapitalTest;
import com.CorbaHibernate.CountryCapital.CountryCapitalTestHelper;

public class Server {
	public static void main(String[] args) {
		try {
			ORB orb = ORB.init(args, null);
			POA rootpoa = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
			rootpoa.the_POAManager().activate();
		    Servant servant = new Servant();
			 org.omg.CORBA.Object ref = rootpoa.servant_to_reference(servant); 
			 CountryCapitalTest href=CountryCapitalTestHelper.narrow(ref);
			 org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			 
			 NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);			 
			 String name ="CountryCapital";
			 NameComponent path[] = ncRef.to_name(name);
			 ncRef.rebind(path, href);
		     orb.run();
			}
	    catch (Exception e) {
		System.err.println("Error:" + e.getMessage());
		e.printStackTrace(System.out);
	    }
	}

}
