import java.io.PrintStream;

public class Main
{
  public static void main(String[] args)
  {
    char[][] map = new char[15][15];
    for (int i = 0; i < map.length; i++) {
      for (int j = 0; j < map.length; j++)
      {
        map[i][j] = 111;
        if ((i == 7) && (j == 12)) {
          map[i][j] = 109;
        }
        if ((i == 2) && (j == 3)) {
          map[i][j] = 99;
        }
        if ((i == 10) && (j == 10)) {
          map[i][j] = 120;
        }
      }
    }
    Map harta1 = new Map();
    Mouse soarece = new Mouse();
    Cheese cascaval = new Cheese();
    
    harta1.setMap(map);
    harta1.display();
    soarece.find(harta1);
    cascaval.find(harta1);
    while (!cascaval.isFound(harta1))
    {
      if (cascaval.getX() > soarece.getX()) {
        soarece.moveDown(harta1);
      }
      if (cascaval.getX() < soarece.getX()) {
        soarece.moveUp(harta1);
      }
      if (cascaval.getX() == soarece.getX())
      {
        if (cascaval.getY() > soarece.getY()) {
          soarece.moveRight(harta1);
        }
        if (cascaval.getY() < soarece.getY()) {
          soarece.moveLeft(harta1);
        }
      }
    }
    System.out.println();
    harta1.display();
  }
}
