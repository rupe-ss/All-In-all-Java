package Java11EssentialsCourse;

import java.util.UUID;

public class ConstructorAndThisKeyword {

    private String size;
    private int quantity;
    private double price;

    public ConstructorAndThisKeyword(String size, int quantity) {
        this.quantity = quantity;

        if(size.equals("Regular"))
            this.price = 100;
        else if(size.equals("Large"))
            this.price = 150;
        else
            this.price = 50;
    }

    private static double calculatePrice(ConstructorAndThisKeyword[] arr){
        double totalPrice = 0;
        for(ConstructorAndThisKeyword pizza: arr){
            totalPrice += pizza.price * pizza.quantity;
        }
        return totalPrice;
    }

    public static void main(String[] args) {
        ConstructorAndThisKeyword pizza1 = new ConstructorAndThisKeyword("Regular", 4);
        ConstructorAndThisKeyword pizza2 = new ConstructorAndThisKeyword("Large", 3);
        ConstructorAndThisKeyword[] pizza = new ConstructorAndThisKeyword[]{pizza1, pizza2};
        System.out.println("Total prize: " + calculatePrice(pizza));
    }

}
