import greenfoot.*;

/**
 * Write a description of class SunCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SunCounter extends Actor
{
    public SunCounter()
    {
        setImage("SunCounter.png");
        getImage().scale(190, 97);
    }
    public void act() 
    {       
        if ( Backyard.getSuns() < 0 ) getWorld().showText( "0", 154, 78); 
        else getWorld().showText("" + Backyard.getSuns(), 154, 78);
    }    
}
