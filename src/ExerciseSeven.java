import javax.swing.JOptionPane;

public class ExerciseSeven {
    public static void main(String[] args) {
        final int BOX_SIZE = 12;

        int tilesOrdered = Integer.parseInt(
                JOptionPane.showInputDialog("Enter number of tiles ordered:"));

        int completeBoxes = tilesOrdered / BOX_SIZE;
        int leftoverTiles = tilesOrdered % BOX_SIZE;

        if (leftoverTiles == 0) {
            JOptionPane.showMessageDialog(null,
                    "Pedido completo: Se despachan " + completeBoxes
                    + " cajas exactas (" + tilesOrdered + " uds).");
        } else {
            int missingTiles = BOX_SIZE - leftoverTiles;
            int completedUnits = completeBoxes * BOX_SIZE;

            JOptionPane.showMessageDialog(null,
                    "Pedido incompleto: Se arman " + completeBoxes
                    + " cajas completas (" + completedUnits + " uds)."
                    + " Faltan " + missingTiles
                    + " baldosas para completar la caja #" + (completeBoxes + 1) + ".");
        }
    }
}