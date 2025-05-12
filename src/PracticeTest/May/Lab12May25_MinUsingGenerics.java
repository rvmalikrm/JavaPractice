package PracticeTest.May;

public class Lab12May25_MinUsingGenerics
{
    public static <T extends Comparable <T>> T minimum(T a, T b){
        if(a.compareTo(b)<0)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        Float a =4.5f, b=9.7f, c;
        c= minimum(a,b);
        System.out.println(c);

        Character ch='A', dh= 'Z',eh;
        eh=minimum(ch,dh);
        System.out.println(eh);

        Double d1=343435d, d2=989897689d, d3;
        d3= minimum(d1, d2);
        System.out.println(d3);
    }
}
