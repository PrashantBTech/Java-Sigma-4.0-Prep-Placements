// Interfaces program

public class fiftynine59 {
    public static void main(String[] args) {
        queen q =new queen();
        q.moves();
        rook r = new rook();
        r.moves();
    }
}
interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal(in all dir)");
    }
}
class rook implements chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

// to implement multiple inheritance
// interfaces: a,b -> inherits by class c
// class c implements a,b{ };