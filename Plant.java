import greenfoot.*;

/**
 * Write a description of class Plant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Plant extends Player
{
    private int cost;
    MouseInfo m = Greenfoot.getMouseInfo();
    public Plant( int health, int sunCost) 
    {
        super( health );
        cost = sunCost;
        //Backyard.spendSun( sunCost );
    }

    public void spawn()
    {
        int c = (getX() - Backyard.XCORNER) / 84;
        int r = (getY() - Backyard.YCORNER) / 95;
        setLocation( 84 * c + 283, 97 * r + 129 );
    }

    public void harm()
    {
        decay();
        if( getHP() == 0 ) getWorld().removeObject(this); 
    }

    public int getCost()
    {
        return cost;
    }
    
    public abstract Plant buildPlant();
}
