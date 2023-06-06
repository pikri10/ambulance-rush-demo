import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ambulance here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ambulance extends Actor

{
    int point = 0;
    
    public void act() 
    {
        getWorld().showText("Score:"+point,70,30);
        checkKeyPress();
        end();
    }
    
    public void checkKeyPress()
    {
        if(Greenfoot.isKeyDown("left"))
        {
            if(getX()>= 215){
                setLocation(getX() -2, getY());}
        }
        if(Greenfoot.isKeyDown("right"))
        {
            if(getX()<=398){
                setLocation(getX() +2, getY());}
        }
        if(Greenfoot.isKeyDown("up")){
        {       
                setLocation(getX(), getY()-2);}
        }
        if(Greenfoot.isKeyDown("down")){
        {       
                setLocation(getX(), getY()+2);}
        }
        if(Greenfoot.isKeyDown("space")) //this is my shoot key
         {
            //fire();
         } 
    }
     public void end(){
        if(isTouching(car.class))
       {
           getWorld().showText("Game Over \n Score "+point,300,300);
           Greenfoot.stop();
           
       }
        if(isTouching(carred.class))
       {
           getWorld().showText("Game Over \n Score "+point,300,300);
           Greenfoot.stop();
           
       }
       if(isTouching(coin.class))
       {
           point = point+10;
           removeTouching(coin.class);
           
       }
       if(point == 50)
        {
            getWorld().showText("Demo Complete!", 300, 300);
            Greenfoot.delay(200);
        }
       
        }
}
