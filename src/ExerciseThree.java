import javax.swing.JOptionPane;

public class ExerciseThree {
    public static void main(String[] args) {
        final int SECONDS_PER_HOUR = 3600;
        final int SECONDS_PER_MINUTE = 60;

        int totalSeconds = Integer.parseInt(
                JOptionPane.showInputDialog("Enter total rendering seconds:"));

        int hours = totalSeconds / SECONDS_PER_HOUR;
        int remainingSeconds = totalSeconds % SECONDS_PER_HOUR;
        int minutes = remainingSeconds / SECONDS_PER_MINUTE;
        int seconds = remainingSeconds % SECONDS_PER_MINUTE;

        JOptionPane.showMessageDialog(null,
                "Tiempo ingresado: " + totalSeconds + " seg"
                + "\n Equivale a: " + hours + " hora, "
                + minutes + " minuto y "
                + seconds + " segundo.");
    }
}