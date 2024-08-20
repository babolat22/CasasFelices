/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casasfelices;

/**
 *
 * @author Usuario
 */
public class Departamento extends Propiedad implements Alquiler{
    private int numPisos;

    public Departamento(int numPisos, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        this.numPisos = numPisos;
    }

    @Override
    public double calcularAlquiler() {
    return precio * (1 + (numPisos * 0.10));
}    
}
