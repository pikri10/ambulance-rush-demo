import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class parent here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class parent extends Actor
{
    /**
     * Act - do whatever the parent wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public void endOfRoad() // removes truck once it hits end of the world.
    {
        if(getY() >= 599||getY() <=0)
        {
            getWorld().removeObject(this);
        }
    }
    
    public void checkCollision(Actor i) // checks if the trucks spawn on top of eachother. will remove one.
    {
        if(i != null)
        {
            getWorld().removeObject(i);
        }        
     }
    public void driveDown(int speed) // moves trucks down the screen at 3 units.
    {
        setLocation(getX(), getY() + speed);
    } 
}
