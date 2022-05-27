import greenfoot.*;

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Actor
{
    private long lastClick;
    private int [] ys = {32, 96, 160, 224, 288, 352, 416, 480};
    private Plant [] plants = {new Peashooter(), new Sunflower(), 
            new TallNut(), new WallNut(), new PotatoMine(), new SnowPea(), 
            new Chomper(), new Repeater()};
    private long lastP;        
    public Square()
    {
        setImage("Square.png");        
    }

    public void act() 
    {        
        MouseInfo m = Greenfoot.getMouseInfo();
        Plant p = plants[(this.getY() / 64)];
        long e = System.currentTimeMillis() - lastP;
        if( e >= 500 )
        {
            lastP = System.currentTimeMillis();
            if ( Backyard.getSuns() >= p.getCost() && Greenfoot.isKeyDown("enter") )
            {
                getWorld().addObject(p.buildPlant(), m.getX(), m.getY());
                Backyard.spendSun(p.getCost());
            }
        }
        scroll();
    }    

    public void scroll()
    {

        long elapsed = System.currentTimeMillis() - lastClick;

        if ( elapsed >= 75 )
        {
            lastClick = System.currentTimeMillis();
            if (Greenfoot.isKeyDown( "up" ) && getY() > 32)
                setLocation( getX(), getY() - 64);
            if (Greenfoot.isKeyDown( "down" ) && getY() < 480) 
                setLocation( getX(), getY() + 64);
        }

    }
}
