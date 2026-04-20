package main;

import javax.swing.JOptionPane;

import uam.ejercicios.*;

public class Main {
    public static void main(String[] args) {
        String[] opciones = {"Suma", "Mayor", "Pares", "Invertir", "Duplicados", "Salir"};

        while (true) {
            String seleccion = (String) JOptionPane.showInputDialog(
                    null,
                    "Seleccione el ejercicio a ejecutar:",
                    "Controlador de Ejercicios - Semana 6",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);

            if (seleccion == null || seleccion.equals("Salir")) break;

            switch (seleccion) {
                case "Suma" -> Ejercicio1.ejecutar();
                case "Mayor" -> Ejercicio2.ejecutar();
                case "Pares" -> Ejercicio3.ejecutar();
                case "Invertir" -> Ejercicio4.ejecutar();
                case "Duplicados" -> Ejercicio5.ejecutar();
            }
        }
    }
}