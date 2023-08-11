package eenum;


import java.util.Arrays;

public class EnumDemo1 {

    enum Car{
        HONDA, TOYOTA;

        int price;
        Car(){
            price = 80;
            System.out.println("Inside constructor");
        }
    }

    public static void main(String[] args) {
        //Every time enum object is made it will make object for 3 Objects so it will run constructor for 3 times.
        System.out.println(Car.HONDA);

        switch (Car.HONDA){
            case HONDA:
                System.out.println("Honda runs forever");
                break;

            case TOYOTA:
                System.out.println("Toyota have best engine.");
                break;

        }

        System.out.println(Car.HONDA.ordinal());

        //In enum values() method is given by Java compiler
        Car[] c = Car.values();
        for(Car car: c){
            System.out.println(car);
        }

        System.out.println(Arrays.toString(c));
    }
}
