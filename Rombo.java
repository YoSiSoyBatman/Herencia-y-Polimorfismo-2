import java.awt.Graphics;
public class Rombo extends Figura
{
    private float dMayor;
    private float dMenor;
    public Rombo(float dM, float dm){
        dMayor=dM;
        dMenor=dm;
    }
    public void calcArea(){
        area=dMayor*dMenor/2;
    }
    @Override public void dibuja(Graphics g){
        
    }
}
