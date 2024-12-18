package PracticeTest;

public class Lab18Dec24_Data_type_Creditcard {
    public static void main(String[] args) {
        long credit_card = 4334_3339_3434_9856L;
        float x=3.5f; // incorrect
        float y=3.5f; // correct
        double z =3.5f; // correct
        double a = 3.5; // correct

        // Use underscore to read the readability in
        float pi = 3.14_28_57f;
        /* A real number is stored in a float / double it is stored in binary form.
                During conversion of decimal number into binary, some precision
        may be lost. So two real numbers that otherwise appear equal,
        when represented in binary numbers of different precisions, might
        turn out to be unequal. For example, 5.375 and 5.375f are not equal.
                When 5.375 is treated as double, it is represented as a 64-bit binary
        number, whereas when it is treated as a float, it is represented as a
        32-bit binary number, resulting in some loss of precision / */

        char ch = 'X' ; // character literal
        char dh = '\u0058' ; // Unicode
        System.out.println(credit_card);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
        System.out.println(pi);
        System.out.println(ch);
        System.out.println(dh);


    }
}
