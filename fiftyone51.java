// first ever program of OOPs (Opject Oriented Programming)

public class fiftyone51 {
    public static void main(String[] args) {
        pen p1 = new pen(); // p1 object of pen class
        p1.setcolor("Blue"); // or p1.color = "Yellow";
        p1.settip(5);
        System.out.println(p1.tip + "," + p1.color);
    }
}
// we made the class pen
class pen {
    int tip;
    String color;

    void setcolor(String colors) {
        color = colors;
    }

    void settip(int size) {
        tip = size;
    }

}