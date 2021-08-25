import java.awt.*;
import java.awt.geom.Line2D;

public class Star {

    private int x;
    private int y;


    public Star(int x, int y){
        this.x = x;
        this.y = y;
    }



    public void draw(Graphics2D g2){

        Line2D.Double line1 = new Line2D.Double(x, y+10, x, y-10);
        Line2D.Double line2 = new Line2D.Double(x+10, y-10, x-10, y+10);
        Line2D.Double line3 = new Line2D.Double(x+10, y, x-10, y);
        Line2D.Double line4 = new Line2D.Double(x-10, y-10, x+10, y+10);

        g2.draw(line1);
        g2.draw(line2);
        g2.draw(line3);
        g2.draw(line4);

    }
}
