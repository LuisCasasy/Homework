/*****************
luis Enrique Casas Yañez
Circumference.java
This program asks for the radius of a circle and shows its circumference.
*******************/
import java.util.Scanner;
public class Circumference
{
  public static void main (String[]args)
  {
    double R;
    double PI=3.1416;
    double Area;
    Scanner in = new Scanner (System.in);
    System.out.println ("Enter the radio of circle");
    R=in.nextDouble();
    Area=PI*(R*R);
    System.out.println ("The circumference of the circle is:  " + Area);
  } //End Main
} //End Circumference
