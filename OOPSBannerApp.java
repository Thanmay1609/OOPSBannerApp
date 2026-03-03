/**
 * OOPS Banner App - UC6 - Static Functions
 * @author Thanmay
 * @version 6.0
 */
public class OOPSBannerApp {
    
    public static String buildLine1() {
        return String.join("  ", " OOO ", " OOO ", "PPPP ", "SSS  ");
    }
    
    
    public static String buildLine2() {
        return String.join("  ", "O   O", "O   O", "P   P", "S    ");
    }
    
    
    public static String buildLine3() {
        return String.join("  ", "O   O", "O   O", "P   P", "S    ");
    }
    
    public static String buildLine4() {
        return String.join("  ", "O   O", "O   O", "PPPP ", " SS  ");
    }
    
    public static String buildLine5() {
        return String.join("  ", "O   O", "O   O", "P    ", "   S ");
    }
    
    public static String buildLine6() {
        return String.join("  ", "O   O", "O   O", "P    ", "   S ");
    }
    
    public static String buildLine7() {
        return String.join("  ", " OOO ", " OOO ", "P    ", "SSS  ");
    }
    
    public static void main(String[] args) {
        
        String[] bannerLines = {
            buildLine1(),
            buildLine2(),
            buildLine3(),
            buildLine4(),
            buildLine5(),
            buildLine6(),
            buildLine7()
        };
        
        for (String line : bannerLines) {
            System.out.println(line);
        }
        
    }
}