/******************************
Luis Enrique Casas Yañez
BiggerNumbre.java
This program calculates what is the highest value of two numbers
******************************/
import javax.swing.JOptionPane;
public class BiggerNumber
{
  public static void main(String[] args)
  {
    int A; //Primer valor para comparar
    int B; //Segundo valor para comparar
    int M; //Resultado de la comparación
    A=Integer.parseInt(JOptionPane.showInputDialog("Enter the first value"));
    B=Integer.parseInt(JOptionPane.showInputDialog("Enter the second value"));
    if (A>B)
    {
      M=A;
      JOptionPane.showMessageDialog(null, "The highest value is " + M);
    }
    else if (B>A)
    {
      M=B;
      JOptionPane.showMessageDialog(null, "The highest value is " + M);
    }
    else
    JOptionPane.showMessageDialog(null, "Impossible to perform, the numbers are the same");
  }
}
