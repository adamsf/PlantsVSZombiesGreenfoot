import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Mower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mower extends SmoothMover
{
    public boolean killer = false;
    public void act() 
    {
        List list = getObjectsInRange(35, Zombie.class);
        Object z = new Object();
        if (list.size() > 0 ) z = list.get(0);
        if( z instanceof Zombie ) 
        {
            z = list.get(0);
            Zombie zom = (Zombie)z;
            if ( zom.getX() == this.getX()  )
            {          
                getWorld().removeObject(zom);
                killer = true;
            }
        }

        if ( killer ) move(2.5);
        if ( isAtEdge() ) getWorld().removeObject(this);
    }    
}
