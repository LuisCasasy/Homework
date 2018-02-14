/******************
Luis Enrique Casas Yañez
CompanyOfTelephone.java
this program calculates the tax
*******************/
import javax.swing.JOptionPane;
public class CompanyOfTelephone
{
  public static void main (String[]args)
  {
    int TI; //Tiempo
    String DI; //Tipo de dia
    String TU; //Turno
    double PAG; //Pago por el tiempo
    double IMP; //Impuesto
    double TOT; //Total que se va a pagar
    PAG=0;
    IMP=0;
    TI=Integer.parseInt(JOptionPane.showInputDialog("Enter the time you call hard"));
    if (TI<=5)
    {
      PAG=TI*1;
    }
    else if (TI>=6 && TI<=8)
    {
      PAG=(((TI-5)*0.80)+5.00);
    }
    else if (TI>=9 && TI<=10)
    {
      PAG=(((TI-8)*70)+7.40);
    }
    else if (TI>=10)
    {
      PAG=(((TI-10)*50)+8.80);
    }
    DI=JOptionPane.showInputDialog("Enter the type of day (Working day or Sunday)");
    switch(DI)
    {
      case "Sunday":
        IMP=PAG*.3;
      break;
      case "Working day":
        TU=JOptionPane.showInputDialog("Enter the turn of the call, Morning or Evening");
        switch(TU)
        {
          case "Morning":
            IMP=PAG*.15;
          break;
          case "Evening":
            IMP=PAG*.10;
          break;
        }
      break;
    }
    TOT=(PAG+IMP);
    JOptionPane.showMessageDialog(null, "Chimefon \n\n" + "Minutes spoken " + TI + "\nTime paymet $" + PAG + "\nTaxes $" + IMP + "\nTotal: $" + TOT );
  }
}
