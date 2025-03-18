// Polymorphism  -> Method Overriding

public class fiftyseven57 {
    public static void main(String[] args) {
        deer d = new deer();
        d.eat(); // Eats grass
        Animal a = new Animal();
        a.eat(); // Eats anything

    }
}
class Animal{
    void eat(){
        System.out.println("Eats anything");
    }
}
class deer extends Animal{
    void eat(){
        System.out.println("Eats grass");
    }
}