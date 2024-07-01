package javaCollection;

import java.util.HashMap;

public class MyMap {

	public static void main(String[] args) {
		
		
		HashMap< String, Integer> H = new HashMap<String,Integer>();
		// TODO Auto-generated method stub
		H.put("Komal",10);
		H.put("Bhagyashri",20);
		H.put("Vijeta", 30);
		H.put("Simran", 40);
		H.put("Kiran", 50);
		H.put("Shree", 5);
		
		//System.out.println(H);
		
		for (Integer key : H.values()) {
           // if (key.equals("Vijeta")) {
                System.out.println(key);
               // break; // Optional: If you only expect one "Simran" key, you can break out of the loop
           // }
        }
	}
}
		

	

