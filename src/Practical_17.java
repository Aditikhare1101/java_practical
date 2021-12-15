import java.awt.*;
import java.awt.event.*;
public class Practical_17 extends Frame implements MouseListener{
    Label l;
    Practical_17(){
        setBackground(Color.green);
        addMouseListener(this);
        l=new Label();
        l.setBounds(20,50,700,700);
        add(l);
        setSize(700,700);
        setLayout(null);
        setVisible(true);
    }
    public void mouseClicked(MouseEvent e) {
        l.setFont(new Font("Algerian", Font.PLAIN, 70));
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setFont(new Font("Algerian", Font.PLAIN, 70));
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setFont(new Font("Algerian", Font.PLAIN, 70));
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setFont(new Font("Algerian", Font.PLAIN, 70));
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setFont(new Font("Algerian", Font.PLAIN, 70));
        l.setText("Mouse Released");
    }
    public static void main(String[] args) {
        new Practical_17();
    }
}