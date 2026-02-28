/**
 * @author Thanmay
 * @version 5.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        
        
        String[] bannerLines = {
            String.join("  ", " OOO ", " OOO ", "PPPP ", "SSS  "),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "P   P", "S    "),
            String.join("  ", "O   O", "O   O", "PPPP ", " SS  "),
            String.join("  ", "O   O", "O   O", "P    ", "   S "),
            String.join("  ", "O   O", "O   O", "P    ", "   S "),
            String.join("  ", " OOO ", " OOO ", "P    ", "SSS  ")
        };
        
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
        
    }
}