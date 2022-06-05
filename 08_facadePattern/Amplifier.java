class Amplifier
{
        
        void setvol(int level,CD cd,Dvdplayer dp)
        {      
                System.out.println("Set volume to "+level);
                cd.setvol(level);
                dp.setvol(level);

        }
        
}
