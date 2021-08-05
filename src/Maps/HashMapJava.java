package Maps;

import java.util.HashMap;

//class HashMap{
//    
//	int num_entries;
//	int key;
//	int value;
//	
//	HashMap(){
//        this.num_entries = 0;
//        		
//	}
//    public void put(int key, int value) {
//    	 this.key = key;
//    	 this.value = value;
//    }
//    
//    public void  get(int key) {
//       this.key = key;
//    }
//    
//    public int size() {
//        return this.num_entries;
//    }
//
//}


public class HashMapJava {

	public static void main(String[] args) {

		 HashMap<String, String> capitalCities = new HashMap<String, String>();

		    // Add keys and values (Country, City)
		    capitalCities.put("England", "London");
		    capitalCities.put("Germany", "Berlin");
		    capitalCities.put("Norway", "Oslo");
		    capitalCities.put("USA", "Washington DC");
		    System.out.println(capitalCities);
		    
		  //  System.out.println();
		    capitalCities.get("England");   
		     
		// To access a value in the HashMap, use the get() method and refer to its key:
		    System.out.println("* get() -> "+capitalCities.get("Germany"));	    
		   
		 // To remove an item, use the remove() method and refer to the key:
		    capitalCities.remove("England");
		    System.out.println("* remove() -> "+capitalCities);
		    
		    //capitalCities.size();
		    System.out.println("* size() -> "+ capitalCities.size());
		    
		    
			// To remove all items, use the clear() method: 
		    // capitalCities.clear();
		    // System.out.println("* clear() -> "+ capitalCities);
		    
		    System.out.println();
		    // Loop Through a HashMap	    
		    // Print keys
		    for (String i : capitalCities.keySet()) {
		      System.out.println(i);
		    }
		    
		    System.out.println();
		   // Print values
		    for (String i : capitalCities.values()) {
		      System.out.println(i);
		    }
		   
		    System.out.println();
		 // Print keys and values
		    for (String i : capitalCities.keySet()) {
		      System.out.println("key: " + i + " value: " + capitalCities.get(i));
		    }
		    
		    System.out.println();
		    System.out.println();
		    // Create a HashMap object called people
		    
		    HashMap<String, Integer> people = new HashMap<String, Integer>();


		    // Add keys and values (Name, Age)
		    people.put("John", 32);
		    people.put("Steve", 30);
		    people.put("Angie", 33);

		    for (String i : people.keySet()) {
		      System.out.println("[" + i + "] value: " + people.get(i));
		    }

	}

}
