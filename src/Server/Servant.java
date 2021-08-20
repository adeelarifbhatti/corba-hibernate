package Server;

import java.util.HashMap;

import GraphCore.GraphCoreTestPOA;

public class Servant extends GraphCoreTestPOA {
	private HashMap<String, String> cC = new HashMap<>();

	@Override
	public String putValues(String country, String capital) {
		String done="Done";
		cC.put(country, capital);
		//System.out.println("Entered the hashMap"+country+ " And " +capital);
		return done;
	}

	@Override
	public String getCapital(String country) {
		String outPut;
		if(cC.containsKey(country)) {
		outPut=cC.get(country);
		//System.out.println("returning the Capital" +outPut);
		return outPut;
		}
		else return null;
	}
}
