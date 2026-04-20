package modelo;


import javax.swing.*;

public class Producto {
    private String nombre;
    private double precio;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public static void main(String[] args) {
        Producto[] lista = new Producto[5];

        for (int i = 0; i < lista.length; i++) {
            String n = JOptionPane.showInputDialog(null, "Nombre del producto #" + (i + 1) + ":");
            String pStr = JOptionPane.showInputDialog(null, "Precio de " + n + ":");

            double p = Double.parseDouble(pStr);

            lista[i] = new Producto(n, p);
        }

        StringBuilder resumen = new StringBuilder("Lista de Productos:\n");
        for (Producto prod : lista) {
            resumen.append("- ").append(prod.getNombre())
                    .append(": C$ ").append(prod.getPrecio()).append("\n");
        }

        JOptionPane.showMessageDialog(null, resumen.toString());
    }
}