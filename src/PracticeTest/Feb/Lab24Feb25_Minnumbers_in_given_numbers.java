package PracticeTest.Feb;

public class Lab24Feb25_Minnumbers_in_given_numbers {
    static int min(int... numbers){
        if(numbers.length==0){
            throw new IllegalArgumentException("At least one number must be provided.");
        }
    int minValue=numbers[0];
     for(int num : numbers){
         if(num<minValue){
             minValue=num;
         }

     }
        return minValue;
    }

    public static void main(String[] args) {
        System.out.println("Min among 10,14,13,23,is "+min(10,14,13,23));
        System.out.println("Min among 3,1,4,1,3,2,3 are,"+min(3,1,4,1,3,2,3));
        System.out.println("Min among 1,-7,-9,6 are,"+min(1,-7,-9,6));
    }
}
