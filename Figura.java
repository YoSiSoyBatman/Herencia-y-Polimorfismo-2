import java.awt.Graphics;
public abstract class Figura
{
    protected float area;
    private int posx;
    private int posy;
    public Figura(){
        area=0;
    }
    public Figura(int x, int y){
        posx=x;
        posy=y;
    }
    public float getArea(){
        return area;
    }
    abstract public void dibuja(Graphics g);
    protected int dimeX(){
        return posx;
    }
    protected int dimeY(){
        return posy;
    }
}
