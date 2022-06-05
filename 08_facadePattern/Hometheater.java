class Hometheater
{
        static Hometheater ht;
        static Lights l = new Lights();
        static Projector p = new Projector();
        static Screen s = new Screen();
        static Amplifier a = new Amplifier();
        static popper pp = new popper();
        static Dvdplayer dp = new Dvdplayer();
        static CD cd = new CD();
        private Hometheater(Lights l,Projector p,Screen s,Amplifier a,popper pp,Dvdplayer dp,CD cd)
        {
                this.l=l;
                this.p=p;
                this.s=s;
                this.a=a;
                this.pp=pp;
                this.dp=dp;
                this.cd=cd;
        }
        public void watchmovie()
        {       
                l.on();
                l.dim();
                pp.onpop();
                p.onpro();
                s.screenup();
                dp.on();
                cd.on();
                a.setvol(15,cd,dp);
        }
        public void stopmovie()
        {
                l.off();
                pp.offpop();
                p.offpro();
                s.screendown();
                dp.off();
                cd.off();
        }      
        static Hometheater createhometheater()
        {
                if (ht ==null)
                {
                        ht = new Hometheater(l,p,s,a,pp,dp,cd);
                }
                return ht;
        }
}
