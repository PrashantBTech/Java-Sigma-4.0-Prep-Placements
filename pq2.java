// You are given a number (eg -  2019), convert it into a String of english like“two zero one nine”.  Use a recursive function to solve this problem

public class pq2 {
    static String[] numbers = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void change(int a) {
        if (a == 0) {
            return;
        }
        int lastdigit = a % 10;
        change(a / 10);
        System.out.println(numbers[lastdigit]);

    }

    public static void main(String[] args) {
        int a = 123;
        change(a);
    }
}
