import javax.swing.JOptionPane;

public class ExerciseOne {
    public static void main(String[] args){
        //String name = "CoffeetTime";
        String nameRecolector = "";
        double harvestedCoffee = 0.0;
        final double KILO_PRICE = 1.200;
        nameRecolector = JOptionPane.showInputDialog("Enter your name:");
        harvestedCoffee = Double.parseDouble(JOptionPane.showInputDialog("Enter coffee kg:"));

        double grossPay = harvestedCoffee * KILO_PRICE;
        double totalToPay = grossPay - (grossPay * 0.04);

        JOptionPane.showConfirmDialog(null, 
            "YOUR NAME IS: " + nameRecolector + "\nHAVESTED COFFEE: " + harvestedCoffee + 
            "\n KILO PRICE: " + KILO_PRICE + "\nPESO: " + harvestedCoffee + "\n GROSS PAY: " + grossPay + 
            "\n RETENTION: (4%) / PAY IS:  " + totalToPay , "\nCOFFEE TIME", JOptionPane.INFORMATION_MESSAGE );
    }
}
