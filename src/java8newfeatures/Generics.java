package java8newfeatures;

class Animal<T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void print(){
        System.out.println(value);
    }

    public <T> void clean(T type){
        System.out.println(type);
    }

    public <T,R> R action(T t, R r){
        return r;
    }
}

public class Generics {
    public static void main(String[] args) {
        Animal<Integer> animal = new Animal<>();
        animal.value = 20;
        animal.print();
        animal.clean(30);
        System.out.println(animal.action(30,78));
    }
}
