package PracticeTest.May;

public class Lab7May25_PassingArrayElementsProject
{
    public static void main(String[] args) {
        int[] marks = {1, 2, 3,5};
        int i;
        for (i = 0; i <=marks.length - 1; i++)
            modify(marks);
        for (i = 0; i <=marks.length - 1; i++)
            System.out.println(marks[i]+ " ");
    }

    static void modify(int[] m){
        for(int i=0;i<=m.length-1;i++)
            m[i]=2*m[i];
    }
}

