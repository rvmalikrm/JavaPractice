package PracticeTest.Apr;
public class Lab04Apr25_function4 {
    public static void main(String[] args) {
        // user defined function
        // 1. Without Parameters and Without Return Type
        // 2. Without Parameters but with Return Type
        // 3. With Paremeters and without Return Type
        // 4. With Parameters and with Return Type
            greet();
            String str = greet_withP_Hello();
            System.out.println(str);
            int v=vote_age();
            System.out.println(v);
            if(v>=18) {
                System.out.println(" You can vote");
                    }
                else {
                System.out.println("You can not vote");
            }
                greet_with_name("Ravi");
                greet_with_name("Promod");
                greet_with_name("Kapi");
                greet_with_name("Vashu");
                greetwith_first_secodn_name("Ravi ", "Malik");
                int resutl =sum(23,45);
        System.out.println(resutl);
    }
    static void greet(){
        System.out.println("Hi, How are your");
    }
    // 2. Without Parameter but with the Return Type
    static String greet_withP_Hello() {
        System.out.println("Hi , I amd Type 2");
        return "Hi, You are awesome ";
    }
        static int vote_age(){
            System.out.println(" Voting age is 18");
            return 17;
        }

    // 3. With Parameters and without Return Type
    static void greet_with_name(String name){
        System.out.println("Hi, Your name is "+ name);
    }
    static void greetwith_first_secodn_name(String first,String second){
        System.out.println("your first name is " +first+"and second name "+second);
    }

    // 4. With Parameter and Return Type
    static int sum(int a, int b){
        return a+b;
    }

}
