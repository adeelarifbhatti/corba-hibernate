package Client;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import GraphCore.GraphCoreTest;
import GraphCore.GraphCoreTestHelper;


public class Client {
	private static Scanner scan;
	public static void main (String[] args) {
		try {
			ORB orb = ORB.init(args,null);			
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			GraphCoreTest graphCoreTest = GraphCoreTestHelper.narrow(ncRef.resolve_str("GraphCore"));
			System.out.println("From Client > Country ?");
			
			
			scan = new Scanner(System.in);
			String line = scan.nextLine();
			String[] parts = line.split(" ");
			String country = parts[0];
			
			/*String capital = parts[1];			
			String data=graphCoreTest.putValues(country,capital);
			System.out.println(data);*/
			
			String data2=graphCoreTest.getCapital(country);
			if(data2==null) {
				System.out.println("error: not found");
			}
			else System.out.println("gotten the capital "+data2);
			
			
		}
		catch(Exception e) {
			System.out.println("Client error "+e.getMessage());
			e.printStackTrace(System.out);			
		}
		
	}

}
