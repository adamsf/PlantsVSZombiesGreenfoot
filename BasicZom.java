import greenfoot.*;

/**
 * Write a description of class BasicZom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BasicZom extends Zombie
{   
    GifImage g = new GifImage("Zombie.gif"); 
    public BasicZom( )
    {
        super( 10, "Zombie.gif", "ZombieAttack.gif" );
    }
    public void act()
    {
        super.act();
        
    }
}
