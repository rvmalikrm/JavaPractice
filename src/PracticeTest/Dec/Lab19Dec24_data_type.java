package PracticeTest.Dec;

public class Lab19Dec24_data_type {
    public static void main(String[] args) {
        //float b=a+3.5f, a=1.2f; //This would not work
        // int b=3; a=4; This will work
        float a=1.2f, b=a+3.5f;
        System.out.println(b);
        int c, d, e,f=21;
        c=d=e=10;
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

        /*However, the following statement would not work:
        int g = h = i = j = 10 ;
        This is because we are trying to use b (to assign to a) before defining
        it.
        -------------------------
        In addition to the division operator Java also provides a modular
division operator (%). This operator returns the remainder on
dividing one operand with another. Thus the expression 10 / 2 yields
5, whereas, 10 % 2 yields 0. Note that on using %, the sign of the
remainder is always same as the sign of the numerator. Thus -5 % 2
yields -1, whereas, 5 % -2 yields 1
        */
    }
}
