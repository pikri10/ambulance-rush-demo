import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class carred here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class carred extends parent
{
    int speed = 5;
    
    public void act() 
    {
        driveDown(speed);        
        car a = new car();
        Actor i = getOneIntersectingObject(car.class);
        checkCollision(i);
        endOfRoad();
    }    
}
