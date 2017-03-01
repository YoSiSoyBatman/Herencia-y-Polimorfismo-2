import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.util.ArrayList;
public class Lienzo extends JPanel
{
    private ArrayList <Figura> figs;
    private Graphics2D g2;
    public void Lienzo(){
         figs=new ArrayList <Figura>();
         Triangle tri=new Triangle(4,6);
         Circle cir=new Circle(10);
         Square squ=new Square(5);
         tri.calcArea();
         cir.calcArea();
         squ.calcArea();
         figs.add(tri);
         figs.add(cir);
         figs.add(squ);
         for(Figura f:figs){
             f.dibuja(g2);
         }
    }
    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2=(Graphics2D)g;
        //g2.drawString("Hello cold world!",100,200);
        
        Triangle tri=new Triangle(4,6);
        Circle cir=new Circle(10);
        Square squ=new Square(5);
        tri.calcArea();
        cir.calcArea();
        squ.calcArea();
        for(Figura f:figs){
            f.dibuja(g2);
        }
        
    }
}
