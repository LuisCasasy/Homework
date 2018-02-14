/***********************
Luis Enrique Casas Yañez
Milk.java
This program calculates what will be charged for a gallon of milk.
*************************/
import java.util.Scanner;
public class Milk
{
  public static void main (String[]args)
  {
    int L; //Cantidad de litros que produce
    double PG; //Precio del galón
    double TG; //Cantidad de galones que produce
    double GA; //Ganancia por la entrega de leche


    //veificar tipo de dato utilizado
    System.out.println ("Enter the cost per gallonn");
    Scanner PG1 = new Scanner (System.in);
    PG=PG1.nextInt();
    System.out.println ("Enter the liters sold");
    Scanner L1 = new Scanner (System.in);
    L=L1.nextInt();
    TG=L*3.785;
    System.out.println ("the gallon produced today is:  " + TG);
    GA=TG*PG;
    System.out.println ("the gain of the day is: $" + GA);
  }
}
