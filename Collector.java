import greenfoot.*;

/**
 * Write a description of class Collector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Collector extends Plant
{
    private int production;
    private long last;
    public Collector(int health, int suns, int cost) 
    {
        super(health, cost);
        production = suns;
    }    
    public void produce( int between )
    {
        long elapsed = System.currentTimeMillis() - last;
        if ( elapsed >= between )
        {
            last = System.currentTimeMillis();
            Sun s = new Sun(getY() + 50);
            getWorld().addObject( s, getX(), getY());
            s.setRotation(270);
            
        }
    }
}
