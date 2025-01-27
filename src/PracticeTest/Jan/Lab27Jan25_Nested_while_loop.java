package PracticeTest.Jan;

public class Lab27Jan25_Nested_while_loop {
    public static void main(String[] args) {
        int i=1;
        int j=2;
        first:while(i++<=100){
            while(j++<200){
                if(i==150) {
                    System.out.println("if"+i);
                    i++;
                    break first;
                }
                else{
                        System.out.println("else"+i+""+j);
                    }
                }
            }
        }
    }

