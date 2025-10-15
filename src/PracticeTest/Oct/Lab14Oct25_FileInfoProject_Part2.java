package PracticeTest.Oct;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Lab14Oct25_FileInfoProject_Part2
{
    public static void main(String[] args) throws Exception
    {
        String str;
        try
        {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Enter file name: ");
                    str =br.readLine();

                    File f = new File(str);
            if(f.exists())

                    {
                        String dname = f.getParent();
                        System.out.println("Directory Name: " + dname);
                        String fname = f.getName();
                        System.out.println("File Name: " + fname);
                        String abspath = f.getAbsolutePath();
                        System.out.println("Absolute Path: " + abspath);
                        long length = f.length();
                        System.out.println("File Length: " + length + " bytes");
                        String ext;
                        int dot = str.lastIndexOf('.');
                        ext = str.substring(dot);
                        System.out.println("File Extension: " + ext);
                        System.out.println("File Modified: " + new Date(f.lastModified()));

                    }
                }

         catch(IOException e)

                    {
                        System.out.println("Error in input");
                    }



    }
}
