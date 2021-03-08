package snackbarapplication;

public class VendingMachine
{

  //feilds ✔️
  private int maxId = 0;

  private int id;
  private String name;

// Constructor✔️
  public VendingMachine(String name)
  {
    maxId++;
    id = maxId;

    this.name = name;
  }

// Getters and Setters~
// id✔️
  public int getId()
  {
    return id;
  }

// name✔️
  public String getName()
  {
    return name;
  }
  public void setName(String name)
  {
    this.name = name;
  }

}
