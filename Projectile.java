import greenfoot.*;

/**
 * Write a description of class Projectile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Projectile extends Actor
{
    private int speed;
    private String pic;
    public Projectile( String pic, int speed ) 
    {
        setImage(pic);
        this.speed = speed;
        this.pic = pic;
    }    
    public void act()
    {
        move(speed);
       if ( isAtEdge() )
       {
           getWorld().removeObject(this);
       }
    }
    public String getImg()
    {
        return pic;
    }
}
