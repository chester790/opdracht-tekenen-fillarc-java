import java.awt.*;
import java.applet.*;

public class Fillarcjava extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(100,20,100,50,90,360);
        g.drawArc(100,20,100,50,90,360);
    }
}
