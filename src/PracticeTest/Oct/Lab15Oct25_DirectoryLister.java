//package PracticeTest.Oct;
//import java.io.*;
//
//public class Lab15Oct25_DirectoryLister {
//    public static void main(String[] args) {
//        File d= new File(".");
//        ListFiles(d,"");
//    }
//    static void ListFiles(File d, String indent)
//    {
//        String str;
//        System.out.println(indent+d.getName()+"/");
//        for(File fi : d.listFiles(""))
//        {
//            str= indent+"   "+fi.getName();
//            System.out.println(str);
//
//        }
//        // implement accept function of FileFilter Interface
//        FileFilter dirFilter = new FileFilter();
//        {
//            public boolean accept(File file)
//            {
//                return file.isDirectory();
//            }
//        }
//        for(File subDir : d.listFiles(dirFilter))
//        {
//            ListFiles(subDir, indent+"   ");
//        }
//    }
//}
