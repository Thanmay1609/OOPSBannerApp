/**
 * @author Thanmay
 * @version 4.0
 */
public class OOPSBannerApp {
    public static void main(String[] args) {
        
        // An array that stores all 7 lines
        String[] bannerLines = new String[7];
        
        // Fill the array with each line
        bannerLines[0] = String.join("  ", " OOO ", " OOO ", "PPPP ", "SSS  ");
        bannerLines[1] = String.join("  ", "O   O", "O   O", "P   P", "S    ");
        bannerLines[2] = String.join("  ", "O   O", "O   O", "P   P", "S    ");
        bannerLines[3] = String.join("  ", "O   O", "O   O", "PPPP ", " SS  ");
        bannerLines[4] = String.join("  ", "O   O", "O   O", "P    ", "   S ");
        bannerLines[5] = String.join("  ", "O   O", "O   O", "P    ", "   S ");
        bannerLines[6] = String.join("  ", " OOO ", " OOO ", "P    ", "SSS  ");
        
        // A loop to print all lines
        for (int i = 0; i < bannerLines.length; i++) {
            System.out.println(bannerLines[i]);
        }
        
    }
}