public class Palindrome {

    public static void main (String[] args) {
        String a = "racecar";
        String b = "A man, a plan, a canal: Panama.";
        String c = "Amy, must I jujitsu my ma?";
        String d = "Pelletier";
        System.out.println(a + ": " + palindrome(a));
        System.out.println(b + ": " + palindrome(b));
        System.out.println(c + ": " + palindrome(c));
        System.out.println(d + ": " + palindrome(d));
    }
    
    public static boolean palindrome(String str) {
        //clean up data by removing non-letter characters
        str = str.toLowerCase();
        String str2 = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch))
                str2 += ch;
        }
        
        //evaluate palindrome status
        for (int i = 0; i < str2.length(); i++) {
            char front = str2.charAt(i);
            char back  = str2.charAt(str2.length() - 1 - i);
            if (front != back) return false;
        }
        
        return true;
    }

}
