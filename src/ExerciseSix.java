import javax.swing.JOptionPane;

public class ExerciseSix {
    public static void main(String[] args) {
        final double MAX_TEMPERATURE = 4.0;
        final double LITER_PRICE = 3200.0;
        final double LOSS_RATE = 0.12;

        double temperature = Double.parseDouble(
                JOptionPane.showInputDialog("Enter current temperature (°C):"));
        double liters = Double.parseDouble(
                JOptionPane.showInputDialog("Enter liters of milk stored:"));

        if (temperature <= MAX_TEMPERATURE) {
            JOptionPane.showMessageDialog(null,
                    "Temperatura: " + temperature + " °C"
                    + "\nLa cadena de frío es óptima.");
        } 
        else {
            double inventoryValue = liters * LITER_PRICE;
            double estimatedLoss = inventoryValue * LOSS_RATE;

            JOptionPane.showMessageDialog(null,
                    "¡ALERTA DE EMERGENCIA! Cadena de frío comprometida."
                    + "\nTemperatura: " + temperature + " °C"
                    + "\nLitros almacenados: " + liters
                    + "\nValor del inventario: $" + inventoryValue
                    + "\nPérdida estimada (12%): $" + estimatedLoss);
        }
    }
}
