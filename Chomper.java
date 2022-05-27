import greenfoot.*;

/**
 * Write a description of class Chomper here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chomper extends Plant
{
    GifImage g = new GifImage( "Chomper.gif" );
    GifImage h = new GifImage( "ChomperAttack.gif" );
    GifImage i = new GifImage( "ChomperDigest.gif" );
    private boolean eating = false;
    private int acts;
    public Chomper()
    {
        super( 4, 150 );
    }
    public void act() 
    {
        spawn(); 
        if ( eating == true ) setImage( i.getCurrentImage() );
        else setImage( g.getCurrentImage() );
        if ( isTouching(Zombie.class) && eating == false )
        {
            eating = true;
            removeTouching(Zombie.class);
        }
        if ( eating == true )
        {
            acts++;
        }
        if ( acts >= 500 )
        {
            eating = false;
            acts = 0;
        }
    }  
    public Plant buildPlant()
    {
        return new Chomper();
    }
}
