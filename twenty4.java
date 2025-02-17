// java program to fing smallest and largest number in an array
//for min infinity = Integer.MIN_VALUE
//for max infinity = Integer.MAX_VALUE

public class twenty4 {
    public static int largest(int num[]){
        int large=  Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(large<num[i]){
                large=num[i];
            }
        }
        return large;
    }
    public static int smallest(int num[]){
        int small=  Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if(small>num[i]){
                small=num[i];
            }
        }
        return small;
    }
    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10,1, 12, 14, 16 };
        int large=largest(numbers);
        int small=smallest(numbers);
        System.out.println("the largest number is "+large);
        System.out.println("the smallest number is "+small);
    }
}
