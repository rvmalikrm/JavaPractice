package PracticeTest.Oct;

public class Lab27Oct25_ZerosAtFirst {
    public static void main(String[] args) {
        String str = "2300405006070";
        StringBuilder zeros = new StringBuilder();
        StringBuilder nonZeros = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == '0') {
                zeros.append(ch);
            } else {
                nonZeros.append(ch);
            }
        }
        String result = zeros.toString() + nonZeros.toString();
        System.out.println(result);

    }
}
