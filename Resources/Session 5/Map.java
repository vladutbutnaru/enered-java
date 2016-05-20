import java.io.PrintStream;

public class Map
{
  char[][] map = new char[15][15];
  
  public char[][] getMap()
  {
    return this.map;
  }
  
  public void setMap(char[][] map)
  {
    this.map = map;
  }
  
  public void display()
  {
    for (int i = 0; i < this.map.length; i++)
    {
      for (int j = 0; j < this.map.length; j++) {
        System.out.print(this.map[i][j] + " ");
      }
      System.out.println();
    }
  }
}
