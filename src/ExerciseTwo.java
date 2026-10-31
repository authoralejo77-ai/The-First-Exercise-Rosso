import javax.swing.JOptionPane;

public class ExerciseTwo {
    public static void main(String[] args) {
        final double IMPOCONSUMO_RATE = 0.08;

        double baseConsumption = Double.parseDouble(
                JOptionPane.showInputDialog("Enter base consumption:"));
        double tipPercentage = Double.parseDouble(
                JOptionPane.showInputDialog("Enter tip percentage (e.g. 10 for 10%):"));
        int numberOfPeople = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of people:"));

        double impoconsumo = baseConsumption * IMPOCONSUMO_RATE;
        double tip = baseConsumption * (tipPercentage / 100);
        double totalBill = baseConsumption + impoconsumo + tip;
        double feePerPerson = totalBill / numberOfPeople;

        JOptionPane.showMessageDialog(null,
                "Consumo: $" + baseConsumption
                + "\nImpoconsumo (8%): $" + impoconsumo
                + "\nPropina (" + tipPercentage + "%): $" + tip
                + "\nTOTAL FACTURA: $" + totalBill
                + "\n---> Cuota por cada amigo (" + numberOfPeople + " personas): $" + feePerPerson);
    }
}
