import greenfoot.*;
public class SnowPea extends Shooter
{
    GifImage g = new GifImage("SnowPea.gif");
    public SnowPea()
    {
        super( 10, 1, 175 );
    }
    public void act() 
    {
        spawn();
        shoot(1500, "PB-10.gif");
        setImage( g.getCurrentImage() );
    }    
    
    public Plant buildPlant()
    {
        return new SnowPea();
    }
}
