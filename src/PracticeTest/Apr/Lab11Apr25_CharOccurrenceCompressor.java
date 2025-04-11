package PracticeTest.Apr;
public class Lab11Apr25_CharOccurrenceCompressor
{
    public static void main(String[] args)
    {
    String input = "aaabbca";
    String output = compressorCharacter(input);
    System.out.println("Output : "+output);
    }
public static String compressorCharacter(String str)
    {
        if(str==null || str.isEmpty())
        {
            return "";
        }

       StringBuilder sb=new StringBuilder();
       char currentChar=str.charAt(0);
       int count=1;
       for(int i=1;i<str.length();i++)
        {
            if (str.charAt(i) == currentChar)
            {
                count++;
            }
            else
            {
                sb.append(currentChar).append(count);
                currentChar=str.charAt(i);
                count=1;
            }
        }
        sb.append(currentChar).append(count);
        return sb.toString();
    }
}
