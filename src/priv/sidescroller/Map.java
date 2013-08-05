package priv.sidescroller;

import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;

/**
 * Created with IntelliJ IDEA.
 * User: olli
 * Date: 13/08/03
 * Time: 17:34
 * To change this template use File | Settings | File Templates.
 */
public class Map {
    private float yOffset,xOffset,scrollspeed;

    public Map(float yOffset, float scrollspeed)
    {
        this.yOffset=yOffset;
        this.scrollspeed=scrollspeed;
        this.xOffset=0;
    }

    public void update(GameContainer gameContainer, int delta)
    {
        xOffset+=delta*scrollspeed*.1f;
        if(xOffset>200)
        {
            xOffset=0;
        }
    }

    public void draw(GameContainer gameContainer, Graphics graphics)
    {
        for(int i=0;i<8;i++)
        {
            if(i%2 == 0)
            {
                graphics.setColor(new Color(0f,.8f,0f));
            }
            else
            {
                graphics.setColor(new Color(.2f,.8f,.2f));
            }
            graphics.fillRect(i*100-xOffset,yOffset,100,400-yOffset);
        }
    }
}
