
/*
 * Adolfo Segura
 */
import java.util.Arrays;

import java.util.Set;
import java.util.TreeSet;

public class SetupApp {

	public static void main(String[] args) {
			// First set of numbers
		    Set<String> set1 = new TreeSet<String>(Arrays.asList(new String[]{"a","b","c","d","e"}));
		    // Second set of numbers
		    Set<String> set2 = new TreeSet<String>(Arrays.asList(new String[]{"a","b","c","d","e","f","g","h"}));
		    
		    // Union
		    Set<String> union = new TreeSet<String>(set1);
		    union.addAll(set2);
		    System.out.println("Union: " + union);

		    // Intersection
		    Set<String> intersection = new TreeSet<String>(set1);
		    intersection.retainAll(set2);
		    System.out.println("Interssection: " + intersection);

		    // Difference A-B
		    Set<String> diff1 = new TreeSet<String>(set1);
		    diff1.removeAll(set2);
		    System.out.println("Difference: " + diff1);
		    
		    // Difference B-A
		    Set<String> diff2 = new TreeSet<String>(set2);
		    diff2.removeAll(set1);
		    System.out.println("Difference: " + diff2);
	  
    }
}
