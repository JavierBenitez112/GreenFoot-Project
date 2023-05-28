// WARNING: This file is auto-generated and any changes to it will be overwritten
import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class foca extends Actor
{

    /**
     * Act - do whatever the foca wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(4);
        if (Greenfoot.getRandomNumber(100) < 10) {
            turn(Greenfoot.getRandomNumber(15) - 30);
        }
        eatpiwi();
    }

    /**
     * 
     */
    public void eatpiwi()
    {
        if (isTouching(Piwi.class)) {
            removeTouching(Piwi.class);
            getWorld().showText("PERDISTE", 300, 200);
        }
    }
}
