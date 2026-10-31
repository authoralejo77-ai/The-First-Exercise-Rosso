import javax.swing.JOptionPane;

public class ExerciseFour {
    public static void main(String[] args) {
        String routeName = JOptionPane.showInputDialog("Enter route name:");
        double distanceKm = Double.parseDouble(
                JOptionPane.showInputDialog("Enter total distance (km):"));
        double kmPerGallon = Double.parseDouble(
                JOptionPane.showInputDialog("Enter km per gallon:"));
        double gallonPrice = Double.parseDouble(
                JOptionPane.showInputDialog("Enter gallon price:"));

        double gallonsNeeded = distanceKm / kmPerGallon;
        double tripCost = gallonsNeeded * gallonPrice;

        JOptionPane.showMessageDialog(null,
                "Ruta: " + routeName
                + "\nCombustible requerido: " + String.format("%.2f", gallonsNeeded) + " galones"
                + "\nCosto estimado del viaje: $" + String.format("%.2f", tripCost));
    }
}