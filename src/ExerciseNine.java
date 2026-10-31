import javax.swing.JOptionPane;

public class ExerciseNine {
    public static void main(String[] args) {
        String athleteName = JOptionPane.showInputDialog("Enter athlete name:");
        double weight = Double.parseDouble(
                JOptionPane.showInputDialog("Enter weight (kg):"));
        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height (m):"));

        double bmi = weight / (height * height);
        String diagnosis;

        if (bmi < 18.5) {
            diagnosis = "Bajo peso";
        } else if (bmi < 25.0) {
            diagnosis = "Peso normal";
        } else if (bmi < 30.0) {
            diagnosis = "Sobrepeso";
        } else {
            diagnosis = "Obesidad";
        }

        JOptionPane.showMessageDialog(null,
                "Paciente: " + athleteName
                + "\nIMC Calculado: " + String.format("%.2f", bmi)
                + "\nDiagnóstico Médico: " + diagnosis + ".");
    }
}

