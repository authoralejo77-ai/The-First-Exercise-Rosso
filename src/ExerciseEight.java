import javax.swing.JOptionPane;

public class ExerciseEight {
    public static void main(String[] args) {
        final double ORDINARY_HOURS = 44.0;
        final double EXTRA_RATE = 1.25;

        String operatorName = JOptionPane.showInputDialog("Enter operator name:");
        double hoursWorked = Double.parseDouble(
                JOptionPane.showInputDialog("Enter hours worked in the week:"));
        double hourlyRate = Double.parseDouble(
                JOptionPane.showInputDialog("Enter ordinary hourly rate:"));

        if (hoursWorked <= ORDINARY_HOURS) {
            double ordinaryPay = hoursWorked * hourlyRate;

            JOptionPane.showMessageDialog(null,
                    "Operario: " + operatorName
                    + "\nPago Ordinario (" + hoursWorked + "h): $" + ordinaryPay
                    + "\nTOTAL: $" + ordinaryPay);
        } else {
            double extraHours = hoursWorked - ORDINARY_HOURS;
            double ordinaryPay = ORDINARY_HOURS * hourlyRate;
            double extraPay = extraHours * hourlyRate * EXTRA_RATE;
            double totalPay = ordinaryPay + extraPay;

            JOptionPane.showMessageDialog(null,
                    "Operario: " + operatorName
                    + "\nPago Ordinario (44h): $" + ordinaryPay
                    + "\nPago Extras (" + extraHours + "h al 125%): $" + extraPay
                    + "\nTOTAL: $" + totalPay);
        }
    }
}
