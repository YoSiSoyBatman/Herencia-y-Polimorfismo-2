
/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square extends Figura
{
    private float lado;
    public Square(float l){
        lado=l;
    }
    public void calcArea(){
        area=lado*lado;
    }
}
