package priv.sidescroller;

import org.newdawn.slick.*;

import static java.lang.Math.random;

public class Main extends BasicGame {
    private int x=0;

    public Main()
    {
        super("Sidescroller");
    }

    public static void main(String[] args) {
        try
        {
            AppGameContainer app = new AppGameContainer(new Main());
            app.setDisplayMode(500, 400, false);
            app.start();
        }
        catch (SlickException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        x+=delta*1;
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {

        graphics.setColor(new Color(0.0f,0.8f,0.0f));
        graphics.fillRect(0,0,500,400);
        graphics.setColor(new Color(1.f,1.f,1.f));
        graphics.fillRect(x,100,20,20);

    }
}
