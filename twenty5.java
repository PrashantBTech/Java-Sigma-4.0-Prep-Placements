// Binary search in array{Sorted array}

public class twenty5 {

    public static int binsearch(int[] number, int key) {
        int start = 0, end = number.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (number[mid] == key) {
                return mid; // index of mid
            }
            if (number[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int key = 10;
        int index = binsearch(numbers, key);
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + index);
        }
    }
}
// t.c = O(log n){ less than linear time complexity}