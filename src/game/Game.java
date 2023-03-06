package game;
import city.cs.engine.*;
import city.cs.engine.Shape;
import org.jbox2d.common.Vec2;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



import javax.swing.JFrame;

import java.awt.*;
import java.io.IOException;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

/**
 * Your main game entry point
 */
public class Game {
    private static String arg;


    /** Initialise a new Game. */
    public Game() {

        //1. make an empty game world
        World world = new World();

        //2. populate it with bodies (ex: platforms, collectibles, characters)

      /*  //make the ground
        Shape shape = new BoxShape(11, 0.5f);
        StaticBody ground = new StaticBody(world, shape);
        ground.setPosition(new Vec2(0f, -11.5f));

        // make a platform
       /* Shape platformShape = new BoxShape(3.5f, 0.5f);
        StaticBody platform1 = new StaticBody(world, platformShape);
        platform1.setPosition(new Vec2(-8, 5.5f));


        //make a character (with an overlaid image)
       /* Shape studentShape = new BoxShape(1,1);
        DynamicBody student = new DynamicBody(world, studentShape);
        student.setPosition(new Vec2(0,0));
        student.addImage(new BodyImage("data/tank.png", 4))*/


        //3. make a view to look into the game world
        arg = "data/intro.gif";

        ImageIcon icon = new ImageIcon(arg);

        UserView view = new UserView(world, 800, 600);


        //optional: draw a 1-metre grid over the view
        //view.setGridResolution(1);


        //4. create a Java window (frame) and add the game
        //   view to it
        final JFrame frame = new JFrame("Tanks");
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        JLabel l = new JLabel();
        f.setSize(800, 600);
        f.setVisible(true);
        l.setIcon(icon);
        p.add(l);
        f.getContentPane().add(p);
        frame.setLocationRelativeTo(null);
        f.setResizable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(view);
        Image image = Toolkit.getDefaultToolkit().getImage("data/intro.gif");
        if (elapsedTimeMsec >= 5200 && elapsedTimeMsec < 6100){

            f.getContentPane().add(p);
        }

        // enable the frame to quit the application
        // when the x button is pressed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationByPlatform(true);
        // don't let the frame be resized
        frame.setResizable(false);
        // size the frame to fit the world view
        frame.pack();
        // finally, make the frame visible
        frame.setVisible(true);

        //optional: uncomment this to make a debugging view
        //  JFrame debugView = new DebugViewer(world, 500, 500);

        // start our game world simulation!
        world.start();
    }

    /** Run the game. */
    public static void main(String[] args) {

        new Game();

       // audio();
    }


   /* public static void audio() {
        try {
            File file = new File("audio.wav");
            Clip clip = AudioSystem.getClip();
            clip.open(AudioSystem.getAudioInputStream(file));
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
        } catch (Exception e) {
            System.err.println("Put the music.wav file in the sound folder if you want to play background music, only optional!");
        }
    }*/





}
