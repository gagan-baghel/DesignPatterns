class MumbaiPizzaStore extends PizzaStore
{
   Pizza createpizza(String name)
   {
     Pizza p = null;
     if(name.equalsIgnoreCase("Mumbai Cheese Pizza"))
     {
       p = new MumbaiCheesePizza();
     }
     else if(name.equalsIgnoreCase("Mumbai Paneer Pizza"))
     {
       p = new MumbaiPaneerPizza();
     }
     else if(name.equalsIgnoreCase("Mumbai Veggie Pizza"))
     {
       p = new MumbaiVeggiePizza();
     }
    return (p);
   }
}
