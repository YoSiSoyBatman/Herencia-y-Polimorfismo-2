import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
public class Lienzo extends JPanel
{
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        g2.drawString("Hello cold world!",100,200);
        g2.drawRect(80,180,140,30);
    }
}
