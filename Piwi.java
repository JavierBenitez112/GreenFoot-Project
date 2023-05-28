// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Piwi extends Actor
{

    /**
     * Act - do whatever the Piwi wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.isKeyDown("left")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")) {
            turn(5);
        }
        eatpizza();
        
        
    }

    /**
     * 
     */
    public void eatpizza()
    {
        if (isTouching(pizza.class)) {
            removeTouching(pizza.class);
        }
    }
}
