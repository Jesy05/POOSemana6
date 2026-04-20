package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        int[] edades = new int[10];
        int edad;

        System.out.println("Ingresa 10 edades:");

        for(int i = 0; i < 10; i++){
            edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Ingresa la edad #" + (i + 1) + ": "));
            edades[i] = edad;
        }
        StringBuilder mensaje = new StringBuilder("Edades:\n");
        for (int e : edades) {
            mensaje.append(e).append("\n");
        }
        JOptionPane.showMessageDialog(null, mensaje.toString(), "Edades", JOptionPane.INFORMATION_MESSAGE);
    }
}
