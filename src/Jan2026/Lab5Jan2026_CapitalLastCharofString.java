package Jan2026;

public class Lab5Jan2026_CapitalLastCharofString {
    public static void main(String[] args) {
        String str = "hello world";
        if (str != null && str.length() > 0) {
            char lastChar = str.charAt(str.length() - 1);
            char capitalLastChar = Character.toUpperCase(lastChar);
            System.out.println("Original String: " + str);
            System.out.println("Capitalized Last Character: " + capitalLastChar);
        } else {
            System.out.println("The string is empty.");
        }
    }
}
