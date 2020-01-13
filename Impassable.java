public class Impassable extends Tile {
  public Impassable() {

  }
  public void display() {
    System.out.print("X "); 
  }

   public boolean isPassable() {
    return false; 
  }
}