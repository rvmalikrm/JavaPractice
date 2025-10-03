package PracticeTest.Oct;

public class Lab03Oct25_CapsFirstLetterOfSentence {
    public static void main(String[] args) {
        String str = "hi. how are you? i am fine.";
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (capitalizeNext && Character.isLetter(c)) {
                result.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                result.append(c);
            }

            if (c == '.' || c == '!' || c == '?') {
                capitalizeNext = true;
            }
        }

        System.out.println(result.toString());
    }
}
