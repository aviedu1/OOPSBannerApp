public class OOPSBannerApp {
    public static void main(String[] args) {
        // UC5: Combining declaration and population in one statement
        String[] lines = {
            String.join("", "  *** ", " ", "  *** ", " ", "***** ", " ", " **** "),
            String.join("", " ** **", " ", " ** **", " ", " ** **", " ", " ** "),
            String.join("", " ** **", " ", " ** **", " ", " ** **", " ", " ** "),
            String.join("", " ** **", " ", " ** **", " ", " ***** ", " ", "  *** "),
            String.join("", " ** **", " ", " ** **", " ", " ** ", " ", "    **"),
            String.join("", " ** **", " ", " ** **", " ", " ** ", " ", "    **"),
            String.join("", "  *** ", " ", "  *** ", " ", " ** ", " ", " **** ")
        };

        // Standard for-each loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}