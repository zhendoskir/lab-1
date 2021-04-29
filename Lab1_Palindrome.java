public class Palindrome {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(i + ". source word: '" + s + "'");
            System.out.println(i + ". reverse word: '" + reverseString(s) + "'");
            System.out.println(i + ". word is palindrome: '" +isPalindrome(s) + "'\n");
        }
    }

    //revers string method
    public static String reverseString(String str){
        String newString = "";
        for (int i = str.length()-1; i >= 0; i--) {
            newString += str.charAt(i);
        }
        return newString;
    }

    //method check word is a palindrome
    public static boolean isPalindrome(String s){
        String reverseStr = reverseString(s);
        if (s.equals(reverseStr)){
            return true;
        }
        return false;
    }
}


