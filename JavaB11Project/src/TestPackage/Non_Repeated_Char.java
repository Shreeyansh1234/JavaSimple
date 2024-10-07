package TestPackage;

public class Non_Repeated_Char {

    public static void main(String[] args) {
        // Find the first non-repeated character in a string.
        String s = "asfsdfaet";
        char[] c = s.toCharArray();
        
        boolean found = false;  // To check if a non-repeated character is found
        
        for (int i = 0; i < c.length; i++) {
            boolean isRepeated = false;
            
            for (int j = 0; j < c.length; j++) {
                if (i != j && c[i] == c[j]) {
                    isRepeated = true;
                    break;  // No need to check further if the character is repeated
                }
            }
            
            if (!isRepeated) {
                System.out.println("The first non-repeated character is: " + c[i]);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println("There is no non-repeated character in the string.");
        }
    }
}
