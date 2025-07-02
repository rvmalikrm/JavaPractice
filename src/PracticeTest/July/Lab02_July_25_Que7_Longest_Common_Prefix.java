package PracticeTest.July;

public class Lab02_July_25_Que7_Longest_Common_Prefix {
    public static void main(String[] args) {
        String[] testCases = {"automationTest", "autoDeploy", "autoRun"};
        String output = findLongestPrefix(testCases);
        System.out.println("Longest common prefix   -->  "+ output);
    }
    public  static String  findLongestPrefix(String[] str)
    {
    if(str==null || str.length==0)
        return  "";
    String prefix = str[0];
    for(int i=1; i< str.length;i++)
    {
        // Shorten the prefix untill it maches the start of str[i]
        while(str[i].indexOf(prefix) !=0) {
            prefix = prefix.substring(0, prefix.length()-1);
            if(prefix.isEmpty()) return  "";
        }
    }
    return  prefix;
    }
}
