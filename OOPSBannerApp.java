public class OOPSBannerApp {
    public static void main(String[] args) {
        // 1. Declare and Initialize a String array for 7 lines
        String[] bannerLines = new String[7];

        // 2. Define each line in the array using String.join
        bannerLines[0] = String.join("", " **** ", " ", " **** ", " ", " ***** ", " ", " **** ");
        bannerLines[1] = String.join("", " ** **", " ", " ** **", " ", " ** **", " ", " ** ");
        bannerLines[2] = String.join("", " ** **", " ", " ** **", " ", " ** **", " ", " ** ");
        bannerLines[3] = String.join("", " ** **", " ", " ** **", " ", " ***** ", " ", " **** ");
        bannerLines[4] = String.join("", " ** **", " ", " ** **", " ", " ** ", " ", "    **");
        bannerLines[5] = String.join("", " ** **", " ", " ** **", " ", " ** ", " ", "    **");
        bannerLines[6] = String.join("", " **** ", " ", " **** ", " ", " ** ", " ", " **** ");

        // 3. Use an enhanced for-loop to iterate and print
        // "For every String 'line' inside the 'bannerLines' array..."
        for (String line : bannerLines) {
            System.out.println(line);
    }
}