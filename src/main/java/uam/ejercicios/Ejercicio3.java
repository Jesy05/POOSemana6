package uam.ejercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio3 {
    public static void ejecutar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos números tendrá el arreglo?"));
        int[] arr = new int[n];
        int contadorPares = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Número " + (i + 1) + ":"));
            if (arr[i] % 2 == 0) {
                contadorPares++;
            }
        }

        JOptionPane.showMessageDialog(null,
                "Arreglo: " + Arrays.toString(arr) +
                        "\nCantidad de números pares: " + contadorPares);
    }
}