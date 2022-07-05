package learning.java.opps;

/*
What is encapsulation ?
    1. The process of binding property of class to method.
    2. This will force someone to use method to access data of object instead of accessing directly.
Why we need encapsulation ?
    1. It is for security purpose, for example with method we can log the message that someone is accessing or updating the data while it is impossible to do without method.
    2. We can decide or add logic how data changes, for example if there is property age of person in class. Then we can add logic that someone can't change the age of person to 1000 years because that doesn't make sense that person will live for 1000 years.
 */
class Encapsulation{
    private int id;
    private String name;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "learning.java.opps.Encapsulation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.setId(10);
        encapsulation.setName("learning.java.opps.Encapsulation Lesson");
        encapsulation.setDescription("Learning encapsulation");
        System.out.println(encapsulation.toString());
    }
}
