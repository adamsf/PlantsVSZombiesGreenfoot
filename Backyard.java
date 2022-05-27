import greenfoot.*;
import java.util.*; 
public class Backyard extends World
{
    private GreenfootImage img = getBackground();
    public static final int XCORNER = 259;
    public static final int YCORNER = 72;
    private static int suns = 50;
    private static final int ZOMX = 1070;
    private static final int [] YS = {120, 215, 310, 405, 500};
    private static Zombie a = new BasicZom();
    private static Zombie b = new BasicZom();
    private static Zombie c = new ConeZom();
    private static Zombie d = new BucketZom();  
    private static long lastGen;
    private static long lastSun;
    private static final Zombie [] ZOMBIES = {a, b, c, d}; 
    public Backyard()
    {    
        super(1400, 600, 1); 
        setPaintOrder(GG.class, Sun.class, Square.class, Zombie.class);
        addObject( new SunCounter(), 203, 49 );
        addObject(new Square(), 52, 32);
        suns = 100;
        for ( int i = 0; i < 5; i++ )
        {
            addObject( new Mower(), 209, 122 + 97 * i);
        }
        for ( int j = 0; j < 8; j++ )
        {
            addObject( new SeedPacket( "P" + (j + 1)), 54, 32 + 64 * j);
        }

    }

    public static void upSun()
    {
        suns += 25;
    }

    public static void spendSun( int cost )
    {
        suns -= cost;
    }

    public static int getSuns()
    {
        return suns;
    }

    public void generate()
    {
        long elapsed = System.currentTimeMillis() - lastGen;
        Zombie zom = ZOMBIES[ (int)(Math.random() * ZOMBIES.length) ];
        int yLoc = YS[ (int)(Math.random() * YS.length) ];
        if( elapsed >= 7500 )
        {
            lastGen = System.currentTimeMillis();
            addObject( zom, ZOMX, yLoc );
        }
    }

    public void act()
    {
        generate();
        long e = System.currentTimeMillis() - lastSun;
        int f = (int)(Math.random() * 200)+ 100;
        Sun s = new Sun(f); 
        if( e >= 10000 )
        {
            lastSun = System.currentTimeMillis();
            addObject(s, (int)(Math.random() * 1000) + 200, 0);
            s.fall(f);
        }
    }
}
