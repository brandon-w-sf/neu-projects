public class Passable extends Tile {
  public Passable() {

  }
  public void display() {
    
    System.out.print("O "); 
  }

  public boolean isPassable() {
    return true; 
  }
}