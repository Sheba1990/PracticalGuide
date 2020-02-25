//#4
import java.applet.Applet;
import java.awt.*;
import java.util.Date;

public class FirstApplet extends Applet {

    private String date;

    public void init() {
        date = new Date().toString();// Date().toString() convert current date to string
    }

    public void paint(Graphics g) {
        g.drawString("Applet started: ", 50, 15);
        g.drawString(date, 50, 35);
    }
}
