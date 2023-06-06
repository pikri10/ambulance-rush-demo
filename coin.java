import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class coin extends parent
{
    int speed = 3;
    public void act() 
    {
        driveDown(speed);
        endOfRoad();
    }
    
   
}
