public class OOPSBannerApp {

    // 1. Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
            "  *** ", 
            " ** ** ", 
            " ** ** ", 
            " ** ** ", 
            " ** ** ", 
            " ** ** ", 
            "  *** "
        };
    }

    // 2. Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
            " ***** ", 
            " ** **", 
            " ** **", 
            " ***** ", 
            " ** ", 
            " ** ", 
            " ** "
        };
    }

    // 3. Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
            "  **** ", 
            " ** ", 
            " ** ", 
            "  *** ", 
            "    ** ", 
            "    ** ", 
            " **** "
        };
    }

    public static void main(String[] args) {
        // Calling our functions to get the data
        String[] oPattern = getOPattern();
        String[] pPattern = getPPattern();
        String[] sPattern = getSPattern();

        // Assemble each line in a loop
        // We use i < 7 because each character is 7 lines tall
        for (int i = 0; i < 7; i++) {
            // Combine O + O + P + S for the current line (i)
            System.out.println(oPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i]);
        }
    }
}