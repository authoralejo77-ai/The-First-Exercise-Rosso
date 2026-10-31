import javax.swing.JOptionPane;

public class ExerciseTwelve {
    public static void main(String[] args) {
        double purchaseValue = Double.parseDouble(
                JOptionPane.showInputDialog("Enter purchase value:"));

        int isTuesday = JOptionPane.showConfirmDialog(null,
                "¿Hoy es Martes de Descuento?",
                "Martes de Descuento",
                JOptionPane.YES_NO_OPTION);

        double discountRate = 0.0;
        String promotion = "Sin descuento";

        if (isTuesday == JOptionPane.YES_OPTION) {
            String[] paymentOptions = {"Efectivo", "Tarjeta"};
            int paymentMethod = JOptionPane.showOptionDialog(null,
                    "Seleccione el medio de pago:",
                    "Medio de pago",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    paymentOptions,
                    paymentOptions[0]);

            if (paymentMethod == 0) {
                discountRate = 0.15;
                promotion = "Promoción Martes en Efectivo (15% Dto)";
            } else if (paymentMethod == 1) {
                discountRate = 0.10;
                promotion = "Promoción Martes con Tarjeta (10% Dto)";
            }
        } else {
            if (purchaseValue > 500000) {
                discountRate = 0.03;
                promotion = "Descuento general (3% Dto)";
            }
        }

        double discount = purchaseValue * discountRate;
        double totalToPay = purchaseValue - discount;

        JOptionPane.showMessageDialog(null,
                promotion
                + "\nDescuento: $" + discount
                + "\nTOTAL NETO A PAGAR: $" + totalToPay);
    }
}
