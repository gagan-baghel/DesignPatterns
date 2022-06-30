class MumbaiPaneerPizza extends Pizza
{ 
  MumbaiPaneerPizza()
  {
    name = "Mumbai Paneer Pizza";
    sauce ="tomato ketchup";
    dough = "whole wheat";
  }
  public void lotsofpaneer()
  {
    System.out.println("Adding lots of paneer... ");
  }
  public void lotsofonion()
  {
    System.out.println("Adding lots of onion... ");
  }
  public void prepare()
  {
    System.out.println("Preparing mumbai paneer pizza...");
  }
}
