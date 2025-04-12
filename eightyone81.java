// ArrayList :  Inbuilt and Linear datatype , having Dynamic Size
// Basic Operations : Add element , get element, remove element, set element at index, contains element , ... 

import java.util.ArrayList;

public class eightyone81 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // get element
        int a = list.get(1);
        System.out.println(a);

        // print AL {.size() for length}
        System.out.println("Printed array list");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // remove element { .remove(index )}
        System.out.println("Removed element of index 1");
        list.remove(1);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // set element at a index { .set(index, value)}
        System.out.println("Set a value at index 1 -> 0");
        list.set(1, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // contains element { .contain(element) -> T/F}
        System.out.println("Check if array list contains element 2");
        System.out.println(list.contains(2));

        // another type of add function { .add(index , element) }
        System.out.println("another type of add function, added 2 at index 1");
        list.add(1, 2);
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }
}
