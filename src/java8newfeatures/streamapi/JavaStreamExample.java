package java8newfeatures.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    public Product(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f));
        productsList.add(new Product(2,"Dell Laptop",30000f));
        productsList.add(new Product(3,"Lenevo Laptop",28000f));
        productsList.add(new Product(4,"Sony Laptop",28000f));
        productsList.add(new Product(5,"Apple Laptop",90000f));

        List<Float> productPriceList = new ArrayList<>();

        for(Product product: productsList){
            // Filtering data from List
            if(product.price < 30000){
                productPriceList.add(product.price); // Adding price to productPriceList
            }
        }

        System.out.println(productPriceList);

        List <Float> productPriceListWithStream = productsList.stream()
                .filter(p -> p.price > 30000)   //Filtering the product which price is more than 30000
                .map(p -> p.price)              //Fetching the price
                .collect(Collectors.toList());  //Collecting as list

        System.out.println(productPriceListWithStream);
    }
}
