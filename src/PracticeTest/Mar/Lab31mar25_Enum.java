package PracticeTest.Mar;
enum CarTypes
{
    Suv, hatchback, Sedan, Convertible
}

public class Lab31mar25_Enum {
    public static void main(String[] args) {
        CarTypes car1= CarTypes.Sedan;
        System.out.println("Value of car1 is "+car1);
        System.out.println("Value of car1 is "+car1.ordinal());

        System.out.println("Cars names and their value:");
        for(CarTypes c :CarTypes.values())
            System.out.println(c+ "="+ c.ordinal());

    }
}
