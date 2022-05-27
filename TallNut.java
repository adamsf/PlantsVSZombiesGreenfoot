import greenfoot.*;

/**
 * Write a description of class TallNut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TallNut extends Wall
{
    GifImage a = new GifImage( "TallNut.gif" );
    GifImage b = new GifImage( "TallnutCracked1.gif" );
    GifImage c = new GifImage( "TallnutCracked2.gif");
    
    public TallNut()
    {
        super( 144, 125);
        
    }
   
    public void act() 
    {
        spawn();
        crack( a, b, c, 48, 96);
    }    
    public Plant buildPlant()
    {
        return new TallNut();
    }
}
