// Pragram of inheritance
// 1. Single level Inheritance (Animal -> Fish)

public class fiftythree53 {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.eat();
    }
}
//base class
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
//derived class
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}