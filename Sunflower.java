import greenfoot.*;

/**
 * Write a description of class Sunflower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sunflower extends Collector
{
    GifImage g = new GifImage("Sunflower.gif");
    public Sunflower()
    {
        super( 10, 25, 50 );
    }

    public void act() 
    {
        spawn();
        produce( 24000 );
        setImage(g.getCurrentImage());
    }    

    public Plant buildPlant()
    {
        return new Sunflower();

    }
}
