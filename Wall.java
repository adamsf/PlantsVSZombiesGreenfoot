import greenfoot.*;

/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Wall extends Plant
{
    
    public Wall( int health, int cost ) 
    {
        super( health, cost );
        
    }    
    
    public void crack( GifImage a, GifImage b, GifImage c, int phase1, int phase2 )
    {
        if ( getHP() < phase1 ) 
        {
            setImage(c.getCurrentImage());
        }
        else if (getHP() < phase2 )
        {
            setImage(b.getCurrentImage());
        }
        else setImage(a.getCurrentImage());
    }
}
