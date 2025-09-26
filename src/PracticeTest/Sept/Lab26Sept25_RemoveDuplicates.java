package PracticeTest.Sept;

public class Lab26Sept25_RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aaabbbcccddddeeefffggghhhiiijjjkkklllmmmnnnooopppqqqrrrssstttuuuvvvwwwxxxyyyzzz";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
