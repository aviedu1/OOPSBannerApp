import java.util.HashMap;

/**
 * OOPSBannerApp UC8
 * Using HashMap and StringBuilder for efficient banner rendering.
 */
public class OOPSBannerApp {
    
    // Method to initialize the Map with character patterns
    public static HashMap<Character, String[]> createCharacterMap() {
        HashMap<Character, String[]> charMap = new HashMap<>();
        
        charMap.put('O', new String[]{"  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "});
        charMap.put('P', new String[]{" ***** ", " ** **", " ** **", " ***** ", " ** ", " ** ", " ** "});
        charMap.put('S', new String[]{"  **** ", " ** ", " ** ", "  *** ", "     **", "     **", " **** "});
        
        return charMap;
    }

    // Static method to display the banner using StringBuilder
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {
        // Outer loop for the 7 rows of the banner
        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            
            // Inner loop for each character in the message
            for (char ch : message.toUpperCase().toCharArray()) {
                if (charMap.containsKey(ch)) {
                    // Append the current row of the current character
                    sb.append(charMap.get(ch)[row]).append("  ");
                }
            }
            // Print the assembled row
            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {
        // 1. Initialize the character map collection
        HashMap<Character, String[]> charMap = createCharacterMap();
        
        // 2. Define the message to display
        String message = "OOPS";
        
        // 3. Render the banner
        displayBanner(message, charMap);
    }
}