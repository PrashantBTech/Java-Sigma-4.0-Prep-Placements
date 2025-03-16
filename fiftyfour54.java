// 2. MultiLevel Inheritance


public class fiftyfour54 {
    public static void main(String[] args) {

        Dog Tom = new Dog();
        Tom.eat();
        Tom.Breed = "Huskey";
        Tom.legs =4;
        System.out.println(Tom.legs);
    }

}

class Animal {
    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mamal extends Animal {
    int legs;
}

class Dog extends Mamal {
    String Breed;
}
