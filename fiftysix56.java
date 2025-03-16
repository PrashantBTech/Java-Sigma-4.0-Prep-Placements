// 3.  Hybrid Inheritance

public class fiftysix56 {
    public static void main(String[] args) {

        Parrot p = new Parrot();
        p.eat();
        p.Fly();
        p.name();
        Shark s = new Shark();
        s.eat();
        s.swims();
        s.name();
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

class Fish extends Animal {
    void swims() {
        System.out.println("Swims");
    }
}

class Bird extends Animal {
    void Fly() {
        System.out.println("Flys");
    }
}

class Shark extends Fish {
    void name() {
        System.out.println("Iam Shark");
    }
}

class Parrot extends Bird {
    void name() {
        System.out.println("Iam Parrot");
    }
}