import greenfoot.*;
import java.util.Timer;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends SmoothMover 
{
    private int health;
    public Player( int hp ) 
    {
        health = hp;
    }    
    public int getHP()
    {
        return health;
    }
    public void decay()
    {
        health--;
    }
}
