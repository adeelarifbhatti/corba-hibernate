package com.CorbaHibernate.Client;

import java.util.Scanner;
import org.omg.CORBA.ORB;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;

import com.CorbaHibernate.CountryCapital.CountryCapitalTest;
import com.CorbaHibernate.CountryCapital.CountryCapitalTestHelper;


public class Client {
	private static Scanner scan;
	public static void main (String[] args) {
		try {
			ORB orb = ORB.init(args,null);			
			org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
			NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
			CountryCapitalTest CountryCapitalTest = CountryCapitalTestHelper.narrow(ncRef.resolve_str("CountryCapital"));
			
			
			scan = new Scanner(System.in);
			String line = scan.nextLine();
			
			String str= line;
			String[] parts = str.split("[[ ]*|[//.]]");
			/*for(int i=0;i<parts.length-1;i++) {
			//System.out.print(parts[i]+" string testing "+parts.length);
			}*/
						
			if(parts[0].equals("set")) {
				int id = Integer.valueOf(parts[1]);
				String capital = parts[3];			
				String data=CountryCapitalTest.putValues(id,parts[2],capital);
				if(!data.equals("Done")) {
					System.out.println("Something When Wrong");
					}
			}
			else if(parts[0].equals("get")) {
				String country = parts[1];
				String data2=CountryCapitalTest.getCapital(country);
				if(data2.equals("not found")) {
					System.out.println("error: not found");
				}
				else System.out.println(data2);
			}
			
			
		}
		catch(Exception e) {
			System.out.println("Client error "+e.getMessage());
			e.printStackTrace(System.out);			
		}
		
	}

}
