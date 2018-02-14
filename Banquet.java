/*********************
Luis Enrique Casas Yañez
Banquet.java
This program calcutes how much will be paid for a banquet
********************/
import javax.swing.JOptionPane;
public class Banquet
{
  public static void main(String[] args)
  {
    int np; //Numero de personas
    float tot; //Total que se va a pagar por el banquete
    np=Integer.parseInt(JOptionPane.showInputDialog("enter the number of people who will attend"));
    if (np>300)
    {
      tot=(np*75);
      JOptionPane.showMessageDialog(null, "The Smoked Lobster \n\n" + "Number of dishes: " + np + "\nPrice for each: $75.00" + "\nTotal price: $" + tot);
    }
    else if (np>200 && np<=300)
    {
      tot=(np*85);
      JOptionPane.showMessageDialog(null, "The Smoked Lobster \n\n" + "Number of dishes: " + np + "\nPrice for each: $85.00" + "\nTotal price: $" + tot);
    }
    else if (np<200)
    {
      tot=(np*95);
      JOptionPane.showMessageDialog(null, "The Smoked Lobster \n\n" + "Number of dishes: " + np + "\nPrice for each: $95.00" + "\nTotal price: $" + tot);
    }
  }
}
