class NagpurPizzaStore extends PizzaStore
{
   Pizza createpizza(String name)
   {
     Pizza p = null;
     if(name.equalsIgnoreCase("Nagpur Cheese Pizza"))
     {
       p = new NagpurCheesePizza();
     }
     else if(name.equalsIgnoreCase("Nagpur Paneer Pizza"))
     {
       p = new NagpurPaneerPizza();
     }
     else if(name.equalsIgnoreCase("Nagpur Veggie Pizza"))
     {
       p = new NagpurVeggiePizza();
     }
        return (p);
   }
}
