
/**
 * Write a description of class Circle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Circle extends Figura
{
    private float radio;
    public Circle(float r){
        radio=r;
    }
    public void calcArea(){
        area=radio*radio*(float)3.1416;
    }
}
