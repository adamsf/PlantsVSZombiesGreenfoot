import greenfoot.*;
import java.util.*;
/**
 * Write a description of class PotatoMine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PotatoMine extends Plant
{
    private long arm;  
    public PotatoMine()
    {
        super(3, 25);
        setImage("PotatoMineNotReady.gif");
    }

    public void act() 
    {
        spawn();
        if(isTouching(Zombie.class))
        {
           removeTouching(Zombie.class);
           getWorld().removeObject(this);
        }
        long e = System.currentTimeMillis() - arm;
        if( e >= 15000 )
        {
            arm = System.currentTimeMillis();
            setImage("PotatoMine.gif");
        }
    }    

    public Plant buildPlant()
    {
        return new PotatoMine();
    }


    
}
