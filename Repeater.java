import greenfoot.*;

/**
 * Write a description of class Repeater here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Repeater extends Shooter
{
    GifImage g = new GifImage("Repeater.gif");
    public Repeater()
    {
        super( 5, 1, 200 );
    }
    public void act() 
    {
        spawn();
        shoot(1500, "PB01.gif");
        shoot(1000, "PB01.gif");
        setImage(g.getCurrentImage());
    }    
    public Plant buildPlant()
    {
        return new Repeater();
    }
}
