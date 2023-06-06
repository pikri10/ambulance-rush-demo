import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tree extends parent
{
    int speed = 3;
    
    public void act() 
    {
       driveDown(speed );        
       car a = new car();
       Actor i = getOneIntersectingObject(tree.class);
        checkCollision(i);
        endOfRoad();
    }
    
    
}
