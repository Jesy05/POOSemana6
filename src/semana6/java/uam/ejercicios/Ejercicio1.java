package uam.ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio1 {
    public static void ejecutar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números sumarás?"));
        int[] arr = new int[n];
        int suma = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Número " + (i + 1) + ":"));
            suma += arr[i];
        }
        JOptionPane.showMessageDialog(null, "La suma total es: " + suma);
    }
}