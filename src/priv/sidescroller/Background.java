package priv.sidescroller;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created with IntelliJ IDEA.
 * User: olli
 * Date: 13/08/05
 * Time: 17:58
 * To change this template use File | Settings | File Templates.
 */
public class Background extends Map {
    public Background(float yOffset, float scrollspeed) {
        super(yOffset, scrollspeed);
    }

    public void draw(GameContainer gameContainer, Graphics graphics)
    {
        graphics.setColor(new Color(.2f,.2f,.8f));
        graphics.fillRect(0,0,500,yOffset);
        graphics.setColor(new Color(1f,1f,1f));
        graphics.fillRect(500-xOffset,20,100,40);
    }

    public void update(GameContainer gameContainer, int delta)
    {
        xOffset+=delta*scrollspeed*.1f;
        if(xOffset>600)
        {
            xOffset=0;
        }
    }
}
