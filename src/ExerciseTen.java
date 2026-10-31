import javax.swing.JOptionPane;

public class ExerciseTen {
    public static void main(String[] args) {
        final double FIXED_CHARGE = 12000.0;

        double consumption = Double.parseDouble(
                JOptionPane.showInputDialog("Enter monthly consumption:"));

        int rate;
        String rateName;

        if (consumption <= 15) {
            rate = 2500;
            rateName = "Baja";
        } else if (consumption <= 30) {
            rate = 3800;
            rateName = "Media";
        } else {
            rate = 5200;
            rateName = "Alta";
        }

        double waterCost = consumption * rate;
        double totalToPay = waterCost + FIXED_CHARGE;

        JOptionPane.showMessageDialog(null,
                "Consumo: " + consumption + " m3 (Tarifa " + rateName + " $" + rate + "/m3)"
                + "\nCosto Agua: $" + waterCost
                + "\nCargo Fijo: $" + FIXED_CHARGE
                + "\nTOTAL: $" + totalToPay);
    }
}
