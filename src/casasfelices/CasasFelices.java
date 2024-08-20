/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package casasfelices;

/**
 *
 * @author Usuario
 */
public class CasasFelices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Inmobiliaria inmobiliaria = new Inmobiliaria();
        Propiedad casa1 = new Casa(4, "Casa del Lago", 200000, 5);
        Departamento departamento1 = new Departamento(10, "Torre Alta", 150000, 8);
        Propiedad terreno1 = null;

        //agregar las propiedades al objeto inmobiliaria aplicando manejo de excepciones
        inmobiliaria.agregarPropiedad(terreno1);
        inmobiliaria.agregarPropiedad(casa1);
        inmobiliaria.agregarPropiedad(departamento1);

        //agregar instrucción para mostrar el inventario
        inmobiliaria.mostrarInventario();
        System.out.println("\nPrecio total de cada propiedad:");
        if (casa1 != null) {
            System.out.println("El precio de "+ casa1.getNombre()+" es :");
            casa1.calcularPrecioTotal();
        }
        if (departamento1 != null) {
            System.out.println("El precio de "+ departamento1.getNombre()+" es :");
            departamento1.calcularPrecioTotal(); 
        }
        if (terreno1 != null) {
            System.out.println("El precio de "+ terreno1.getNombre()+" es :");
            terreno1.calcularPrecioTotal();
        }
               double alquiler = departamento1.calcularAlquiler();

        // Imprimir el alquiler
        System.out.println("El alquiler del departamento es: " + alquiler);
    }

}
