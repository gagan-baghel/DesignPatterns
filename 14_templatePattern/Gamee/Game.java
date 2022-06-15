public abstract class Game {
   abstract void initialize();
   abstract void startPlay();
   abstract void endPlay();

   public void showadd(){
      System.out.println("showing add");
   }

   //template method
   public final void play(){
      
      //initialize the game
      showadd();
      initialize();

      //start game
      startPlay();
      showadd();


      //end game
      endPlay();
      showadd();

   }
}