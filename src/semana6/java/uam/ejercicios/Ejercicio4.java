package uam.ejercicios;

import javax.swing.JOptionPane;
import java.util.Arrays;

public class Ejercicio4 {
    public static void ejecutar() {
        int n = Integer.parseInt(JOptionPane.showInputDialog("Tamaño del arreglo a invertir:"));
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Valor en posición [" + i + "]:"));
        }

        String original = Arrays.toString(arr);

        int inicio = 0;
        int fin = n - 1;
        while (inicio < fin) {
            int temp = arr[inicio];
            arr[inicio] = arr[fin];
            arr[fin] = temp;
            inicio++;
            fin--;
        }

        JOptionPane.showMessageDialog(null,
                "Original: " + original +
                        "\nInvertido: " + Arrays.toString(arr));
    }
}