import greenfoot.*;
import javax.swing.Timer;
import java.awt.*;
/**
 * Write a description of class Peashooter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peashooter extends Shooter
{
    GifImage g = new GifImage("Peashooter.gif");
    public Peashooter( ) 
    {
        super( 3, 1, 100 );       
    } 
    public void act()
    {
        spawn();
        shoot(1500, "PB01.gif");
        setImage(g.getCurrentImage());
    }   
    public Plant buildPlant()
    {
        return new Peashooter();
    }
}
