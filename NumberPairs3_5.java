/*******************************
Luis Enrique Casas Yañez

NumberPairs3_5.java
*This program prints the even numbers between zero and one hundred
*******************************/
import javax.swing.JOptionPane;
public class NumberPairs3_5
{
  public static void main (String[] args)
  {
    int numerosPares = 2;
    while (numerosPares<=100)
    {
      JOptionPane.showMessageDialog(null, + numerosPares);
      numerosPares += 2;
    }
  }
}
