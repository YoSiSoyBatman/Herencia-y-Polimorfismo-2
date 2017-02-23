
/**
 * Write a description of class Triangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
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
}
