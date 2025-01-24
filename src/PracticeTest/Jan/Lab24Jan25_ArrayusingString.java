package PracticeTest.Jan;

public class Lab24Jan25_ArrayusingString {
    public static void main(String[] args) {
        String[] s ={"Ravi ", "Malik" , "Pooja", "katariya"};
        for (int i=0; i<s.length;i++)
         {
            System.out.println("Value of First String is at index "+ i+ " is "+s[i]);
         }
        String[] strarr= new String[5];
        strarr[0]="Intelegencia";
        strarr[1]="Unicode";
        strarr[2]="Infosys";
        strarr[3]="Kiet";
        strarr[4]="GIC";
        for(String d:strarr){
            System.out.println("Value of second String is  "+d);
        }

        }
    }

