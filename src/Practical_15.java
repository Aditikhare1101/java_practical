import java.applet.*;
import java.awt.*;

public class Practical_15 extends Applet{

    public void init() {
        setBackground(Color.BLACK);
    }
    public void paint(Graphics g) {
        setBounds(2,2,2000,2000);
        g.setColor(Color.GREEN);
        g.setFont(new Font("Algerian", Font.BOLD, 40));
        g.drawString("Hey, Aditi Khare here, #AK!:)", 0, 50);
        showStatus("#AK");
    }
}
