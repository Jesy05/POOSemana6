package uam.ejercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio5 {
    public static void ejecutar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("¿Cuántos elementos quieres ingresar?"));
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Dato " + (i + 1) + ":"));
        }

        int[] temporal = new int[n];
        int cantidadUnicos = 0;

        for (int i = 0; i < n; i++) {
            boolean yaExiste = false;

            for (int j = 0; j < cantidadUnicos; j++) {
                if (arr[i] == temporal[j]) {
                    yaExiste = true;
                    break;
                }
            }

            if (!yaExiste) {
                temporal[cantidadUnicos] = arr[i];
                cantidadUnicos++;
            }
        }

        int[] resultado = Arrays.copyOf(temporal, cantidadUnicos);

        JOptionPane.showMessageDialog(null,
                "Arreglo original: " + Arrays.toString(arr) +
                        "\nSin duplicados: " + Arrays.toString(resultado));
    }
}