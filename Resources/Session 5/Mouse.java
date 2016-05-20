public class Mouse
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
  
  public boolean canMoveLeft(Map matrix)
  {
    char[][] map = matrix.getMap();
    if ((map[this.x][(this.y - 1)] == 'o') || (map[this.x][(this.y - 1)] == 'c')) {
      return true;
    }
    return false;
  }
  
  public boolean canMoveRight(Map matrix)
  {
    char[][] map = matrix.getMap();
    if ((map[this.x][(this.y + 1)] == 'o') || (map[this.x][(this.y + 1)] == 'c')) {
      return true;
    }
    return false;
  }
  
  public boolean canMoveUp(Map matrix)
  {
    char[][] map = matrix.getMap();
    if ((map[(this.x - 1)][this.y] == 'o') || (map[(this.x - 1)][this.y] == 'c')) {
      return true;
    }
    return false;
  }
  
  public boolean canMoveDown(Map matrix)
  {
    char[][] map = matrix.getMap();
    if ((map[(this.x + 1)][this.y] == 'o') || (map[(this.x + 1)][this.y] == 'c')) {
      return true;
    }
    return false;
  }
  
  public void moveLeft(Map matrix)
  {
    char[][] map = matrix.getMap();
    if (canMoveLeft(matrix))
    {
      map[this.x][this.y] = 45;
      
      map[this.x][(--this.y)] = 109;
      matrix.setMap(map);
    }
  }
  
  public void moveRight(Map matrix)
  {
    char[][] map = matrix.getMap();
    if (canMoveLeft(matrix))
    {
      map[this.x][this.y] = 45;
      map[this.x][(++this.y)] = 109;
      matrix.setMap(map);
    }
  }
  
  public void moveUp(Map matrix)
  {
    char[][] map = matrix.getMap();
    if (canMoveLeft(matrix))
    {
      map[this.x][this.y] = 124;
      map[(--this.x)][this.y] = 109;
      matrix.setMap(map);
    }
  }
  
  public void moveDown(Map matrix)
  {
    char[][] map = matrix.getMap();
    if (canMoveLeft(matrix))
    {
      map[this.x][this.y] = 124;
      map[(++this.x)][this.y] = 109;
      matrix.setMap(map);
    }
  }
  
  public void find(Map matrix)
  {
    char[][] map = matrix.getMap();
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++) {
        if (map[i][j] == 'm')
        {
          this.x = i;
          this.y = j;
        }
      }
    }
  }
}
