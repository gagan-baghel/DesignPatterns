class Test
{
        public static void main(String[] args)
        {
                //Hometheater ht = Hometheater(l,p,s,a,pp,dp,cd);
                Hometheater ht = Hometheater.createhometheater();
                
                ht.watchmovie();
                System.out.println();
                ht.stopmovie();
        }
}
