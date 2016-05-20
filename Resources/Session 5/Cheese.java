public class Cheese
{
  int x;
  int y;
  
  public int getX()
  {
    return this.x;
  }
  
  public void setX(int x)
  {
    this.x = x;
  }
  
  public int getY()
  {
    return this.y;
  }
  
  public void setY(int y)
  {
    this.y = y;
  }
  
  public boolean isFound(Map matrix)
  {
    char[][] map = matrix.getMap();
    if (map[this.x][this.y] == 'm') {
      return true;
    }
    return false;
  }
  
  public void find(Map matrix)
  {
    char[][] map = matrix.getMap();
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        if (map[i][j] == 'c')
        {
          this.x = i;
          this.y = j;
        }
      }
    }
  }
}

