// given a route containing 4a directions[E,W,N,S], Find the shortest path to reach destination

public class fortytwo42 {
    public static float shortpath(String path){
        int x=0,y=0;
        for (int i = 0; i < path.length(); i++) {
            char dir =path.charAt(i);
            //south
            if (dir == 'S') {
                y--;
            }
            //north
            else  if (dir == 'N') {
                y++;
            }
            //west
            else  if (dir == 'W') {
                x--;
            }
            //east
            else{
                x++;
            }
        }
        int x2= x*x;
        int y2=y*y;
        return (float)Math.sqrt(x2+y2);// displacement formula √[(x2-x1)²+(y2-y1)²].
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(shortpath(path));
    }
}
// Time Complexity : O(n)