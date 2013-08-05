package priv.sidescroller;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created with IntelliJ IDEA.
 * User: olli
 * Date: 13/08/03
 * Time: 17:17
 * To change this template use File | Settings | File Templates.
 */
public class MainChar {
    private float xPos,yPos,xOffset,yOffset,speed;
    private boolean walksup,walksdown;
    private Animation walking,idle;

    public MainChar(int xPos, int yPos, int speed, Animation walking, Animation idle)
    {
        this.xPos=xPos;
        this.yPos=yPos;
        this.speed=speed;
        this.idle = idle;
        this.walking = walking;
    }

    public void draw(GameContainer gameContainer, Graphics graphics)
    {
        walking.draw(xPos,yPos);
        graphics.drawRect(xPos,yPos,10,10);
    }

    public void update(GameContainer gameContainer, int delta)
    {
        this.xPos += delta* 0.1f;
    }
}
