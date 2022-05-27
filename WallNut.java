import greenfoot.*;

/**
 * Write a description of class WallNut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallNut extends Wall
{
    GifImage g = new GifImage("WallNut.gif");
    GifImage h = new GifImage("Wallnut_cracked1.gif");
    GifImage i = new GifImage("Wallnut_cracked2.gif");
    
    public WallNut()
    {
        super( 72, 50 );
    }
    public void act() 
    {
        spawn();
        crack(g, h, i, 24, 48);
    }    
    public Plant buildPlant()
    {
        return new WallNut();
    }
}
