/******************
Luis Enrique Casas Yañez
Suits.java
This program calculates how much a suit with a discount has been applied
*******************/
import javax.swing.JOptionPane;
public class Suits
{
  public static void main(String[] args)
  {
    double ct; //cost of the suit
    double de; //discount that will be obtained
    double pf; //final price of the suit
    ct=Double.parseDouble(JOptionPane.showInputDialog("Enter the price of suit"));
    if (ct>=2500)
    {
      de=(ct*0.15);
      pf=(ct-de);
      JOptionPane.showMessageDialog(null, "Suit \n\n" + "Price of suit: $" + ct + "\nDiscount: $" + de + "\nFinal price: $" + pf );
    }
    else if (ct<2500)
    {
      de=(ct*0.8);
      pf=(ct-de);
      JOptionPane.showMessageDialog(null, "Suit \n\n" + "Price of suit: $" + ct + "\nDiscount: $" + de + "\nFinal price: $" + pf );
    }

  }
}
