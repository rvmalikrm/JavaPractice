package PracticeTest.Feb;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab06Feb25_QuizMe_reversestring
{
    public static void main(String[] args)
    {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the String");
//        String input=sc.next();
        String input="Hello World!";
        int start=0;
        String reverse="";
        for(int i=0;i<=input.length();i++)
        {
            if(i==input.length() || input.charAt(i)==' ')
            {
                for(int j=i-1;j>=start;j--)
                {
                    reverse = reverse + input.charAt(j);
                }
                    if(i!=input.length())
                    {
                        reverse=reverse+" ";
                    }
                start=i+1;

                }

            }
        System.out.println(reverse);
        }

        }


