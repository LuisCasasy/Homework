/******************
GetPassword.java
Luis Enrique Casas Yañez
this class this class verifies the password that is entered
******************/
import javax.swing.*;
  public class GetPassword{
    public static void main(String[] args) {
      Password contra;
      contra = new Password();
      String pass;
      pass =JOptionPane.showInputDialog("Enter The Password");
      contra.setPassword(pass);
      if (contra.getNum()>=2 && contra.getMinusculas()>=2 && contra.getMayusculas()>=1){
        JOptionPane.showMessageDialog(null,"the password is correcta \n saving");
      }else{
        JOptionPane.showMessageDialog(null,"the password is weak \n 1. 1 Capital letter\n 2. need two letter lower case\n minimun 3 numbers\n try again");
      }
    }
}
