package string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class Map_queue {

	public static void main(String[] args) {
		
		 Queue<String> queue = new LinkedList<>();
	        queue.add("apple");
	        queue.add("banana");
	        queue.add("apple");
	        queue.add("orange");
	        queue.add("banana");
	        queue.add("apple");
            queue.add("apple");
            queue.add("banana");


	        Map<String, Integer> elementCountMap = new HashMap<>();

	        // Process each element in the queue
	        for (String element : queue) {
	        	
	            // If the element is already in the map, increment its count
	           
	        	if (elementCountMap.containsKey(element)) {
	                elementCountMap.put(element, elementCountMap.get(element) + 1);
	            } else {
	                // Otherwise, add the element to the map with a count of 1
	                elementCountMap.put(element, 1);
	            }
	        }

	        
	        for (Map.Entry<String, Integer> entry : elementCountMap.entrySet()) {
	            System.out.println(entry.getKey() + ": " + entry.getValue());
	        }

	}

}
