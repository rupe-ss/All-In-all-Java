package eenum;
/*
What is happening behind the scene ?
class Mobile
{
    static final Mobile APPLE = new Mobile(100);
    static final Mobile SAMSUNG = new Mobile();
    static final Mobile HTC = new Mobile();
}
 */
enum Mobile{
    APPLE(100), SAMSUNG, NOKIA, ONEPLUS, HTC;

    int price;

    Mobile(){
        price = 150;
        System.out.println("Constructor");
    }

    Mobile(int p){
        price = p;
        System.out.println("Constructor with param.");
    }
}
public class EnumDemo {
    public static void main(String[] args) {
        //Everytime Mobile class is called all the Object is defined.
        Mobile mobile = Mobile.APPLE;
        System.out.println(mobile);
        System.out.println(mobile.price);

        Mobile mobile1 = Mobile.ONEPLUS;
        System.out.println(mobile1);
        System.out.println(mobile1.price);

        /*Mobile[] mobiles = Mobile.values();
        for (Mobile mob : mobiles){
            System.out.println(mob);
        }

        switch (mobile){
            case APPLE:
                System.out.println("Apple Enum");
        }*/
    }
}
