/********************
hreeFigures.java
*This program helps to calculate the area of a figure.
*****/
import java.util.Scanner;
public class AreaOfFigure
{
  public static void main (String[]args)
  {
    Double R; //Base del triangulo rectangulo y radio
    Double H; //Hipotenusa del triangulo Rectangulo
    Double C; //Cateto faltante
    Double AT; //Area triangular
    Double AC; //Area circular
    Double PI=3.1416; //Constante
    Double Area; //Area de la figura
    Scanner in = new Scanner(System.in);
    System.out.println ("Enter meters");
    System.out.println ("enter radius of the half sphere");
    R= in.nextDouble();
    AC = ((PI*(R*R))/2);
    System.out.println ("measurement taken from the tip of the figure to the beginning of the radius");
    H = in.nextDouble();
    C = (Math.sqrt((H*H)+(R*R)));
    AT=(C*R);
    Area = AC + AT;
    System.out.println ("The area is: " + Area + " meters");
  } //End ThreeFigures
} //End main
