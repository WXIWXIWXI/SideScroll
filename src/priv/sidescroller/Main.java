package priv.sidescroller;

import org.newdawn.slick.*;

import static java.lang.Math.random;

public class Main extends BasicGame {
    MainChar mainChar;

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
        Image mov1 = new Image("data/Main/Moving/Main Moving 1.png");
        Image [] moving = {mov1, new Image("data/Main/Moving/Main Moving 2.png"), mov1, new Image("data/Main/Moving/Main Moving 3.png")};
        Image [] idle = {new Image("data/Main/Idle/Main Idle 1.png"), new Image("data/Main/Idle/Main Idle 2.png"), new Image("data/Main/Idle/Main Idle 3.png")};

        int [] duration = {100, 100, 100, 100};
        int [] durationIdle = {300, 300, 300};
        mainChar = new MainChar(100,100,10,new Animation(moving,duration,true),new Animation(idle,durationIdle,true));
    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {
        mainChar.update(gameContainer, delta);
    }

    @Override
    public void render(GameContainer gameContainer, Graphics graphics) throws SlickException {
        mainChar.draw(gameContainer, graphics);
    }
}
