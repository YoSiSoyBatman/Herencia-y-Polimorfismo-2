
/**
 * Write a description of class Mine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mine
{
    public static void main(String []args){
        Triangle tri=new Triangle(4,6);
        Circle cir=new Circle(10);
        Square squ=new Square(5);
        tri.calcArea();
        cir.calcArea();
        squ.calcArea();
        /*System.out.println(tri.getArea());
        System.out.println(cir.getArea());
        System.out.println(squ.getArea());*/
        Figura [] figs=new Figura[3];
        figs[0]=tri;
        figs[1]=cir;
        figs[2]=squ;
        System.out.println(figs[0].getArea());
        System.out.println(figs[1].getArea());
        System.out.println(figs[2].getArea());
    }
}
