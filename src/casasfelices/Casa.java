/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casasfelices;

/**
 *
 * @author Usuario
 */
public class Casa extends Propiedad{
    
    private int numHabitaciones;

    public Casa(int numHabitaciones, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        this.numHabitaciones = numHabitaciones;
    }
    
    @Override
    public void calcularPrecioTotal(){
        if (stock>10){
            precio=precio-(precio/0.5);
            System.out.println(precio);
        }else 
             System.out.println(precio);

    }
    
           
}
