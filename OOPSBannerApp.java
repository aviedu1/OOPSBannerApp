public class OOPSBannerApp {

    // UC7: Inner Static Class to encapsulate data
    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() { return character; }
        public String[] getPattern() { return pattern; }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {
        return new CharacterPatternMap[] {
            new CharacterPatternMap('O', new String[]{"  *** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", " ** ** ", "  *** "}),
            new CharacterPatternMap('P', new String[]{" ***** ", " ** **", " ** **", " ***** ", " ** ", " ** ", " ** "}),
            new CharacterPatternMap('S', new String[]{"  **** ", " ** ", " ** ", "  *** ", "     **", "     **", " **** "})
        };
    }

    public static String getCharacterPattern(char ch, CharacterPatternMap[] charMaps) {
        // Linear search to find the matching character object
        for (CharacterPatternMap map : charMaps) {
            if (map.getCharacter() == ch) {
                // Returns the array of 7 strings for that character
                return String.join(",", map.getPattern()); 
            }
        }
        return "";
    }

    public static void main(String[] args) {
        CharacterPatternMap[] charMaps = createCharacterPatternMaps();
        String message = "OOPS";
        
        // Print logic for UC7 (7 lines high)
        for (int i = 0; i < 7; i++) {
            for (char ch : message.toCharArray()) {
                for (CharacterPatternMap map : charMaps) {
                    if (map.getCharacter() == ch) {
                        System.out.print(map.getPattern()[i] + " ");
                    }
                }
            }
            System.out.println();
        }
    }
}