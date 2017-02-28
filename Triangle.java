
import java.awt.Graphics;
public class Triangle extends Figura
{
    private float base;
    private float altura;
    public Triangle(float b, float h){
        base=b;
        altura=h;
    }
    public void calcArea(){
        area=base*altura/2;
    }
    public void dibuja(Graphics g){
        
    }
}
