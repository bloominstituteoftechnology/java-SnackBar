package snackBar;

public class Vmachine 
{
  private static int maxId = 0;
  private int id;
  private String name;

  public Vmachine(String name) 
  {
    maxId++;
    id = maxId;
    this.name = name;
  }

  public int getId()
  {
    return id;
  }

  // Vending Machine set and return name
  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
