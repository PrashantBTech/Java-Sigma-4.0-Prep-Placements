import java.util.*;
public class twenty3 {
    // arrays in java
    // int marks[]=new int[5];
    // to get length marks.length
    public static int linearsearch(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
           
        }
                return -1;
    }
    
    public static int linearsearch(String number[], String key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
           
        }
                return -1;
    }
public static void main(String[] args) {
    

    // linear search in array
    int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
    String menue[]={"smosa","burger","pizza","fries"};
    int key = 10;
    String key1="pizza";
    int index =linearsearch(numbers, key);
    int index1 =linearsearch(menue, key1);
    if(index == -1){
        System.out.println("not found!");
    }else{
        System.out.println("the number found at index "+ index);
    }
    System.out.println(" for the menue");
    if(index1 == -1){
        System.out.println("not found!");
    }else{
        System.out.println("the item found at index "+ index1);
    }

}
}
