import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        ambulance ambulance = new ambulance();
        addObject(ambulance,309,562);
        ambulance.setLocation(312,561);
        ambulance.setLocation(319,555);
        ambulance.setLocation(314,554);
    }
    
    public void act(){
        if(Greenfoot.getRandomNumber(100) < 1)//jarak dan banyak mobil
        {        
            addObject(new car(), Greenfoot.getRandomNumber(200) + 200, 0);           
        }
        if(Greenfoot.getRandomNumber(500) < 1)//jarak dan banyak mobil
        {        
            addObject(new carred(), Greenfoot.getRandomNumber(200) + 200, 0);           
        }
        if(Greenfoot.getRandomNumber(10) < 2) //this makes trees randomly appear.
        {
            addObject(new tree(), Greenfoot.getRandomNumber(170), 0);  // keep them on left hand side of road
            addObject(new tree(), Greenfoot.getRandomNumber(170) + 440, 0); //keep them on right hand side of road
        }
        if(Greenfoot.getRandomNumber(500) < 2)//jarak dan banyak mobil
        {        
            addObject(new coin(), Greenfoot.getRandomNumber(200) + 200, 0); //posisi  
        }
    }
}
