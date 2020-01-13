import java.util.Scanner; 
public class Main {
  public static void main(String[]args){
    Grid grid = new Grid(); 
    Scanner s = new Scanner(System.in);
    int i = 0; 
    while(i == 0) {
    System.out.print("Move:");
    String nextMove = s.next(); 
    if(nextMove.equalsIgnoreCase("up")) {
      grid.move(Direction.UP); 
    }
    if(nextMove.equalsIgnoreCase("down")) {
      grid.move(Direction.DOWN); 
    }
    if(nextMove.equalsIgnoreCase("left")) {
      grid.move(Direction.LEFT); 
    }
    if(nextMove.equalsIgnoreCase("right")) {
      grid.move(Direction.RIGHT); 
    }

  }
}
}