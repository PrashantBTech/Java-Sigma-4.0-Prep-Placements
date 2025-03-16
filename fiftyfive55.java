// 3. Hierarchical Inheritance

public class fiftyfive55 {
    public static void main(String[] args) {
        Mamal m = new Mamal();
        m.eat();
        Fish f = new Fish();
        f.swims();
        f.eat();
        Bird b = new Bird();
        b.eat();
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
    void walks(){
        System.out.println("Walks");
    }
}

class Fish extends Animal {
    void swims(){
        System.out.println("Swims");
    }
} 
class Bird extends Animal {
    void Fly(){
        System.out.println("Flys");
    }
} 