public class PPAP {
    /*
     * Given the first line of this iconic song:
     * "I have a pen, I have a apple"
     * This produces the next line, following this pattern
     * "Uh! Apple pen"
     * 
     */    

    public static void main (String[] args) {
        ppap("I have a pen, I have a apple.");
        ppap("I have a craft, I have a star.");
        ppap("I have a scholar, I have a AP.");
    }

    public static void ppap(String str) {
        int comma     = str.indexOf(",");
        int lastSpace = str.lastIndexOf(" ");
        String first  = str.substring(9,comma);
        String second = str.substring(lastSpace+1,str.length()-1);
        second = second.substring(0,1).toUpperCase() + second.substring(1);
        System.out.println("Uh, " + second + " " + first);
    }
}
