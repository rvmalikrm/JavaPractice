package PracticeTest.May.String;

public class Lab26May25_String_P1 {
    public static void main(String[] args) {


        String str1 = "Ravi";
        String str2 = new String("Malik");
        System.out.println(str1.length());
        String result = str1+" "+str2;
        System.out.println(result);

        // or Using contac
        System.out.println(str1.concat("-"+str2));

        // charAt
        System.out.println(str1.charAt(3));
    //substring(beginIndex, endIndex)
        System.out.println(str1.substring(1,3));
        //toLowerCase() / toUpperCase()
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        //equals() / equalsIgnoreCase()

        System.out.println("hello".equals("Hello"));
        System.out.println("hello".equalsIgnoreCase("Hello"));

        //compareTo() / compareToIgnoreCase()
        System.out.println("abc".compareTo("abd"));
        System.out.println("abc".compareToIgnoreCase("ABC"));

        // startsWith() / endsWith()
        System.out.println(str1.startsWith("Ra"));
        System.out.println(str1.endsWith("vi"));

        // contains()
        System.out.println(str1.contains("i"));

        // replace() / replaceAll()
        String str3= "Banana";
        System.out.println(str1.replace("v","n"));
        System.out.println(str3.replaceAll("a","O"));

        // Splits
        String str4= "apple,banana,mango";
        String[] fruits= str4.split(",");
        for (String f: fruits) {
            System.out.println(f);
        }

        // trim()
        String str5= " Intel  ";
        System.out.println(str5.trim());

        //isEmpty() / isBlank() (Java 11+)
        // join() (Java 8+)
        // repeat(n) (Java 11+)
        // format()

    }
}
