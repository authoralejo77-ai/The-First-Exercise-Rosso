import javax.swing.JOptionPane;

public class ExerciseEleven {
    public static void main(String[] args) {
        double baseSalary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter base salary:"));
        double monthlySales = Double.parseDouble(
                JOptionPane.showInputDialog("Enter monthly sales:"));

        double commissionRate;
        int commissionPercentage;

        if (monthlySales < 5000000) {
            commissionRate = 0.0;
            commissionPercentage = 0;
        } else if (monthlySales < 10000000) {
            commissionRate = 0.05;
            commissionPercentage = 5;
        } else if (monthlySales < 20000000) {
            commissionRate = 0.08;
            commissionPercentage = 8;
        } else {
            commissionRate = 0.12;
            commissionPercentage = 12;
        }

        double commission = monthlySales * commissionRate;
        double totalPay = baseSalary + commission;

        JOptionPane.showMessageDialog(null,
                "Nivel alcanzado: Comisión del " + commissionPercentage + "% ($" + commission + ")"
                + "\nSueldo Básico: $" + baseSalary
                + "\nPAGO TOTAL: $" + totalPay);
    }
}
