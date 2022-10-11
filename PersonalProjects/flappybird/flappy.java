package flappybird;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.Timer;
import java.awt.event.ActionListener;

public class flappy implements ActionListener 
{
    public static flappy flappy;

    public final int WIDTH = 800, HEIGHT = 800;

    public Renderer renderer;

    public flappy()
    {
        JFrame jframe = new JFrame();
        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jframe.add(renderer);
        jframe.setSize(WIDTH, HEIGHT);
        jframe.setVisible(true);
        jframe.setResizable(false);

        timer.start();
    }

    public static void main(String[] args) 
    {
        flappy = new flappy();

        
    }

    public void repaint(Graphics g) 
    {
        System.out.println();
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        renderer.repaint();
        
    }
    
}
