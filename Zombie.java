import greenfoot.*;
import java.util.*;
/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Zombie extends Player
{
    private int hP;
    private long lastEat;
    private GifImage gif;
    private GifImage eatingGif;
    private static final int STOPGAMEX = 146;
    private static final int GGX = 694, GGY = 297;
    public Zombie( int hp, String img, String eatImg )
    {
        super(hp);
        hP = hp;
        gif = new GifImage(img);
        eatingGif = new GifImage(eatImg);
        lastEat = System.currentTimeMillis();
    }

    public void act()
    {

        setImage( gif.getCurrentImage() );
        if ( !eating() && !frozen() )move(-0.25);
        else if ( !eating() && frozen() ) move(-.125);
        else
        {
            eat( eatingGif );
        }
        if ( isTouching( Projectile.class ) )
        {
            hP--;
            removeTouching(Projectile.class);
        }
        if ( hP == 0 )
        {
            getWorld().removeObject(this);  
        }
        if(getX() < STOPGAMEX)
        {
            getWorld().addObject(new GG(), GGX, GGY);
            Greenfoot.stop();
        }
    }

    public boolean eating()
    {
        List list = getObjectsInRange(25, Plant.class); 
        if (list.size() > 0 )return list.get(0) != null;
        else return false;
    }

    public boolean frozen()
    {
        return false;
    }

    public void eat( GifImage eatGif )
    {        
        setImage(eatGif.getCurrentImage()); 

        Object p = getOneIntersectingObject(Plant.class);
        if( p instanceof Plant )
        {
            Plant d = (Plant)p;
            long elapsed = System.currentTimeMillis() - lastEat;
            if( elapsed >= 500 )
            {
                lastEat = System.currentTimeMillis();
                d.harm();
            }
        }

    }

}
