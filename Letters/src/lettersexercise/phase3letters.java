package lettersexercise;
import java.io.*; 
import java.util.*; 

public class phase3letters {

	    public static void characterCount(String inputString) 
	    {
	        HashMap<Character, Integer> Map = new HashMap<Character, Integer>(); 
	  
	        char[] strArray = inputString.toCharArray(); 
	        for (char c : strArray) { 
	            if (Map.containsKey(c)) { 
	  
	                // If char is present in Map, 
	                // incrementing it's count by 1 
	                Map.put(c, Map.get(c) + 1); 
	            } 
	            else { 
	  
	                // If char is not present in Map, 
	                // putting this char to Map with 1 as it's value 
	                Map.put(c, 1); 
	            } 
	        } 
	  
	        // Printing the Map 
	        for (Map.Entry entry : Map.entrySet()) { 
	            System.out.println(entry.getKey() + " " + entry.getValue()); 
	        } 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	        String str = "Joyce"; 
	        characterCount(str); 
	    } 
	} 

