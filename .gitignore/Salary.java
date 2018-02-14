/*********************
Luis Enrique Casas Yañez
Salary.java
This program calculate the salary of a person.
*********************/
import java.util.Scanner;
public class Salary
{
  public static void main (String[]args)
  {
    Double HT; //Horas trabajadas
    Double PH; //Pago por hora
    Double SS; //Sueldo semanal
    Scanner in = new Scanner(System.in);
    System.out.println ("Enter the cost for hour");
    HT = in.nextDouble();
    System.out.println ("Enter the hours workes for week.");
    PH = in.nextDouble();
    SS=HT*PH;
    System.out.println ("the pay for week is: $" + SS);
  }
}
