/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casasfelices;

/**
 *
 * @author Usuario
 */
abstract class Propiedad {

    String nombre;
    double precio;
    int stock;

    public Propiedad(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void calcularPrecioTotal() {
        if (stock > 10  ) {
            precio = precio - (precio / 0.5);
            System.out.println(precio);
        }else 
             System.out.println(precio);

    }

    @Override
    public String toString() {
        return "Propiedad{" + "nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + '}';
    }

}
