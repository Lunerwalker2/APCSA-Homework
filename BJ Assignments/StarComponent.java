import javax.swing.*;
import java.awt.*;

public class StarComponent extends JComponent {

    public void paintComponent(Graphics g){


        Graphics2D g2 = (Graphics2D) g;


        Star star1 = new Star(getWidth() - 40, getHeight() - 100);
        Star star2 = new Star(getWidth() - 90, getHeight() - 100);
        Star star3 = new Star(getWidth() - 60, getHeight() - 40);


        star1.draw(g2);
        star2.draw(g2);
        star3.draw(g2);


    }
}
