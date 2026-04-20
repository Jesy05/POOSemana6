package uam.ejercicios;
import javax.swing.JOptionPane;

public class Ejercicio2 {
    public static void ejecutar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo:"));
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor [" + i + "]:"));
        }

        int mayor = arr[0];
        for (int num : arr) {
            if (num > mayor) mayor = num;
        }
        JOptionPane.showMessageDialog(null, "El número mayor es: " + mayor);
    }
}