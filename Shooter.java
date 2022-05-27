import greenfoot.*;

/**
 * Write a description of class Shooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Shooter extends Plant
{
    private int damage;
    private static final long TIME = 1000;
    private long lastShot;
    public Shooter( int health, int dmg, int cost ) 
    {
        super(health, cost);
        damage = dmg; 
        lastShot = System.currentTimeMillis();
    }  

    public void shoot( int t, String img )

    {  long elapsed = System.currentTimeMillis() - lastShot;
        if ( elapsed >= t )
        {
            lastShot = System.currentTimeMillis();
            getWorld().addObject( new Projectile(img, 5), getX() + 37, getY() - 21);
        }
    }
    
}
