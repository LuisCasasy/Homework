/****************
Luis Enrique Casas Yañez
MetersToInches.java
This program converts meters to inches.
******************/
import java.util.Scanner;
public class MetersToInches
{
  public static void main (String[]args)
  {
    Double CM; //Cantidad de metros que require
    Double PG; //Pulgadas que debe pedir
    Scanner in= new Scanner(System.in);
    System.out.println ("Enter the meters to use.");
    CM= in.nextDouble();
    PG=CM/0.0252;
    System.out.println ("the inches to required: " + PG);
  } //End main
} //End MetersToInches
