interface ChessPlayer{
    void moves();
}
class Queen implements ChessPlayer{
    public void moves(){
        System.out.println("up down lift Right diagonal -(by 1 step)");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("Up down lift Right ");
    }
}
public class apn121 {
   public static void main(String[] args) {
    Queen q = new Queen();
    q.moves();
   } 
}
