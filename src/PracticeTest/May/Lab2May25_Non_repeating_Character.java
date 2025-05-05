//-------------------------------------------------------------------------------------------
// Find the First Non-Repeating Character                                                   //
// Scenario:                                                                                //
// You need to find the first character in a given test log string that does not repeat.    //
// Example:                                                                                 //
// Input: "automation"                                                                      //
// Output: 'u'                                                                              //
//------------------------------------------------------------------------------------------//

package PracticeTest.May;

public class Lab2May25_Non_repeating_Character {
    public static void main(String[] args) {
    String input= "Automation";
    char result= firstnonrepeat(input);
        System.out.println(result);
    }
    public static char firstnonrepeat(String input){
        char currentchat=input.charAt(0);
        int count=0;
        char[] chararray=input.toCharArray();
        for(int i=0;i<input.length()-1;i++)
        {
            if(currentchat==input.charAt(i+1))
            {
                count++;
                currentchat=input.charAt(i+1);

            }
        }

        return currentchat;
    }


}
