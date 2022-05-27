import greenfoot.*;

/**
 * Write a description of class Sun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sun extends Actor
{
    private int distance;
    GifImage g = new GifImage("Sun.gif");
    public Sun( int fall )
    {
        distance = fall;
        getImage().scale(50, 50);
    }
    public void act()
    {       
        fall(distance);
        
        if ( Greenfoot.mouseClicked(this) )
        {
            Backyard.upSun();
            getWorld().removeObject(this);
        }
    } 
    public void fall( int limit )
    {
        if(getY() < limit )setLocation( getX(), getY() + 5 );
    }
}
