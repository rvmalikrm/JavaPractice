package PracticeTest.Feb;

public class Lab03feb25_CountChar_in_String_UsingNestedLoops {
    public static void main(String[] args) {
        String str="Programing";
        CountChar(str);
    }
    public static void CountChar(String str)
    {
        char[] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++)
        {
            if(chars[i]== ' ')
                continue;;
                int count=1;
                for(int j=i+1;j<chars.length;j++)
                {
                    if(chars[i]==chars[j])
                    {
                        count++;
                        chars[j]=' ';
                    }
                }
            if(count>1)
                System.out.println(chars[i] +" is repeated "+count+ " times");

        }

    }
}
