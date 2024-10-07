package TestPackage;

public class firstnonrepeatedcharacter {

		    // Function to find the index of the first non-repeating
	    // character
	    public static int firstUniqChar(String s)
	    {
	        int n = s.length();

	        // Step 1: Iterate over each character in the string
	        for (int i = 0; i < n; ++i) {
	            boolean found = true;

	            // Step 2: Check if the character repeats in the
	            // rest of the string
	            for (int j = 0; j < n; ++j) {
	                if (i != j && s.charAt(i) == s.charAt(j)) {
	                    found = false;
	                    break;
	                }
	            }

	            // Step 3: If character does not repeat, return
	            // its index
	            if (found) {
	                return i;
	            }
	        }

	        // Step 4: If no such character is found, return -1
	        return -1;
	    }

	    // Driver code
	    public static void main(String[] args)
	    {
	        String s = "geeksforgeeks";
	        System.out.println(firstUniqChar(s));
	    }
	}