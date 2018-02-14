/*******************
Luis Enrique Casas Yañez
Pool.java
This program calculates what a person will pay for filling a pool.
********************/
import java.io.*;
public class Pool
{
  public static void main(String[]args) throws IOException
  {
    BufferedReader bufLeer = new BufferedReader(new InputStreamReader(System.in));
    float A; //Altura de la alberca
    float L; //Largo de la alberca
    float N; //Ancho de la alberca
    float CM; //Costo del metro cubico
    float V; //Volumen de la alberca
    float PAG; //Pago a realizar por el consumo
    System.out.println ("Enter the costo for meter cubic of water");
    CM=Float.parseFloat(bufLeer.readLine());
    System.out.println ("Enter the height of the pool");
    A=Float.parseFloat(bufLeer.readLine());
    System.out.println ("Enter the long of the pool");
    L=Float.parseFloat(bufLeer.readLine());
    System.out.println ("Enter the width of the pool");
    N=Float.parseFloat(bufLeer.readLine());
    V=A*L*N;
    PAG=CM*V;
    System.out.println ("the total to pay is: $" + PAG );
  }//End main
} //End pool
