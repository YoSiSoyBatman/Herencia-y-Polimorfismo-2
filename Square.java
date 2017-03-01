import java.awt.Graphics;
public class Square extends Figura
{
    private float lado;
    public Square(float l){
        lado=l;
    }
    public void calcArea(){
        area=lado*lado;
    }
    @Override public void dibuja(Graphics g){
        
    }
}
