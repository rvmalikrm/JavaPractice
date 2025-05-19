package PracticeTest.May;

public class Lab19May25_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] testCases = {"automationTest", "autoDeploy", "autoRun"};
        String prefix = findLongestCommonPrefix(testCases);
        System.out.println("Longest common prefix: \""+prefix+"\"");
    }
    public static String findLongestCommonPrefix(String[] str){
        if(str==null || str.length==0)
            return  "";
        String prefix= str[0];
        for(int i=1;i<str.length;i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                    if (prefix.isEmpty()) {
                        return "";
                    }
                }
            }

            return prefix;

    }
}
