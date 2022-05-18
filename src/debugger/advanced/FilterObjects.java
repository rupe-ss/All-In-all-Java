package debugger.advanced;

import java.util.Arrays;
import java.util.List;

class Human{
    int age = 0;
    private final String name;

    public Human(String name) {
        this.name = name;
    }
}

class Man extends Human{
    public Man(String name) {
        super(name);
    }
}

class Women extends Human{

    public Women(String name) {
        super(name);
    }
}
public class FilterObjects {
    public static void main(String[] args) {
        List<Human> lists = Arrays.asList(new Man("Catborg"), new Women("Catlin"), new Man("Solti"));
        for(int i = 0; i < 10; i++){
            for (Human h: lists){
                FilterObjects.incrementAge(h);
            }
        }
    }

    static void incrementAge(Human j){
        j.age++;
    }
}
