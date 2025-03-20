// Example 5: ShowTwoNumbers.java
import javax.swing.JOptionPane;

public class calculate2number {
    public static void main(String[] args) {
        String strNum1, strNum2;
        

        strNum1 = JOptionPane.showInputDialog(null,
            "Please input the first number: ", "Input the first number",
            JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,
            "Please input the second number: ", "Input the second number",
            JOptionPane.INFORMATION_MESSAGE);
        double Num1 = Double.parseDouble(strNum1);
        double Num2 = Double.parseDouble(strNum2);
        Double sum= Num1 + Num2;
        double diff = Num1 - Num2;
        double product=Num1*Num2;
        double quotient= Num1/Num2;
        String strNotification = "the sum is" + sum + "\n" + "the difference is" + diff + "\n" + "the product is" + product + "\n"+ "the quotient is" + quotient;

        JOptionPane.showMessageDialog(null, strNotification,
            "Show two numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
