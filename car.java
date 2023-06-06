import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car extends parent

{
    int speed = 3;
    
    public void act() 
    {
        driveDown(speed);        
        car a = new car();
        Actor i = getOneIntersectingObject(car.class);
        checkCollision(i);
        endOfRoad();
    }
    
    
    
 
    
    
    
}
