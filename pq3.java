// Youhave3towersandNdisksofdifferentsizeswhichcanslideontoanytower.Thepuzzlestartswithdiskssortedinascendingorderofsizefromtoptobottom(i.e.,eachdisksitsontop of an even larger one)
// tower of hanoi
public class pq3 {
    public static void towerofHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println("transfer disk " + n + "from " + src + " to " + dest);
            return;
        }
        // transfer top n-1 from src to helper using dest as 'helper'
        towerofHanoi(n - 1, src, dest, helper);
        // transfer nth from src to dest
        System.out.println("transfer disk " + n + "from " + src + " to " + dest);
        // transfer n-1 from helper to dest using src as 'helper'
        towerofHanoi(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        int n = 3;
        towerofHanoi(n, "A", "H", "D");
    }
}
