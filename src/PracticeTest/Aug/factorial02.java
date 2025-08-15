package PracticeTest.Aug;

public class factorial02 {
    public static void main(String[] args) {
        int num=5;
        int result = factorilCal(num);
        System.out.println(result);
    }
    public static int factorilCal(int num){

        int result =1;
        for(int i=1;i<=num;i++){
            result = result * i;
        }
    return result;
    }


}
