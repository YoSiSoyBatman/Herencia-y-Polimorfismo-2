import java.awt.Graphics;
public class Circle extends Figura
{
    private float radio;
    public Circle(float r){
        radio=r;
    }
    public void calcArea(){
        area=radio*radio*(float)3.1416;
    }
    @Override public void dibuja(Graphics g){
        
    }
}
