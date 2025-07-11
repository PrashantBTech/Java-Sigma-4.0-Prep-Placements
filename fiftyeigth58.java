// Program of abstract class

public class fiftyeigth58 {
    public static void main(String[] args) {
        mustang m = new mustang();
        // Animal -> horse -> mustang
        m.walk();
        horse h = new horse();
        h.walk();

    }
}

abstract class Animal {
    Animal() {
        System.out.println("Animal Constructor called");
    }

    abstract void walk();
}

class horse extends Animal {
    horse() {
        System.out.println("horse Constructor called");
    }

    void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class mustang extends horse {
    mustang() {
        System.out.println("mustang Constructor called");
    }
}