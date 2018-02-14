/********************
Luis Enrique Casas Yañez
floor.java
This program calculates the area of floor.
********************/
import java.util.Scanner;
public class floor
{
  public static void main (String[]args)
  {
    Double B; //Base del triangulo y del rectangulo
    Double A; //Añtura del triangulo y rectangulo unidos
    Double C; //altura del rectangulo
    Double AT; //Area del triangulo
    Double AR; //Area del Rectangulo
    Double Area; //Area de la figura
    Scanner in= new Scanner(System.in);
    System.out.println ("enter the widht of the two figures");
    B = in.nextDouble();
    System.out.println ("enter the weigth of the complete figure");
    A = in.nextDouble();
    System.out.println ("enter the weigth of the rectangle");
    C = in.nextDouble();
    AT = (B*(A-C))/2;
    AR = (B*C);
    Area = AT+AR;
    System.out.print ("The total area is: " + Area + " meters");
  }
}
