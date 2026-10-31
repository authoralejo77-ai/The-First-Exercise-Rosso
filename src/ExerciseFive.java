import javax.swing.JOptionPane;

public class ExerciseFive {
    public static void main(String[] args) {
        final double FREE_WEIGHT = 23.0;
        final double EXTRA_KILO_PRICE = 15000.0;

        String passengerName = JOptionPane.showInputDialog("Enter passenger name:");
        double ticketPrice = Double.parseDouble(
                JOptionPane.showInputDialog("Enter ticket price:"));
        double luggageWeight = Double.parseDouble(
                JOptionPane.showInputDialog("Enter luggage weight (kg):"));

        double surcharge = 0.0;
        String alert = "";

        if (luggageWeight > FREE_WEIGHT) {
            double extraKilos = luggageWeight - FREE_WEIGHT;
            surcharge = extraKilos * EXTRA_KILO_PRICE;
            alert = "[ALERTA] Equipaje con sobrepeso de " + extraKilos + " kg. Recargo aplicado: $" + surcharge + "\n";
        }

        double totalToPay = ticketPrice + surcharge;

        JOptionPane.showMessageDialog(null,
                alert
                + "Pasajero: " + passengerName
                + "\nTotal final a pagar en mostrador: $" + totalToPay);
    }
}