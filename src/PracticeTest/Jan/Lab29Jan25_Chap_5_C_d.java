package PracticeTest.Jan;

public class Lab29Jan25_Chap_5_C_d {
    public static void main(String[] args) {
        for(int i=1;i<=300;i++){
            int d=2;
            while(d<=i-1)
                if(i%d==0){
                    System.out.println("Not a prime number");
                    continue;
                }
                d++;
            if(d==i){
                System.out.println("Prime number");
                break;
            }
            }


        }
        }


