

public class Grid {

  private final int height = 5; 
  private final int width = 5; 
  private Tile[][] tiles = new Tile[height][width]; 
  private int row = 0; 
  private int col = 0;
  private int c1 = 0;
  private int c2 = 3;
  private int c3 = 0;
  private int c4 = 3;

 
  public Grid() {
    tiles[0][0] = new Passable();
    tiles[0][1] = new Impassable();
    tiles[0][2] = new Passable();
    tiles[0][3] = new Passable();
    tiles[0][4] = new Passable();
    tiles[1][0] = new Passable();
    tiles[1][1] = new Passable(); 
    tiles[1][2] = new Passable();
    tiles[1][3] = new Passable();
    tiles[1][4] = new Passable();
    tiles[2][0] = new Passable();
    tiles[2][1] = new Passable();
    tiles[2][2] = new Passable();
    tiles[2][3] = new Passable();
    tiles[2][4] = new Passable();
    tiles[3][0] = new Passable();
    tiles[3][1] = new Passable();
    tiles[3][2] = new Passable();
    tiles[3][3] = new Passable();
    tiles[3][4] = new Passable();
    tiles[4][0] = new Passable();
    tiles[4][1] = new Passable();
    tiles[4][2] = new Passable();
    tiles[4][3] = new Passable();
    tiles[4][4] = new Passable();
    this.displayAll();
  }

  public Tile[][] getGrid() {
    return tiles; 
  }

  
  public void move(Direction dir) {
     Tile t = new Passable(); 
    switch(dir) {
      case LEFT: 
        if (col - 1 >= 0) {
            t = tiles[row][col-1];
          if (t.isPassable()) {
            col--; 
          }
        }
       
      break;
        case RIGHT: 
       
        if (col + 1 < width) {
           t = tiles[row][col+1];
           if(t.isPassable()) { 
            col++;
           }
        }
      break;  
      case UP: 
        
        if ( row - 1 >= 0) {
          t = tiles[row-1][col];
          if(t.isPassable()) {
            row--; 
          }
        }
      break;

      case DOWN:
      if(row + 1 < height) {
        t = tiles[row+1][col];
        if (t.isPassable()) {
          row++; 
        }
      }
      break;

      default: 
      break; 
     
    }
     System.out.println(row + ", " + col); 

    this.displayAll(); 
  }

  private void displayAll() {
    for(int i = 0; i < 5; i++) {
      for(int j = 0; j < 5; j++) {
        if(i == row && j == col) {
          System.out.print("p ");
        }
        else {
          tiles[i][j].display(); 
        }
        
      }
      System.out.println(); 
    }
    System.out.println(); 
  }
  
}