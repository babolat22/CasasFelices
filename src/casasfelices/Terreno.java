/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casasfelices;

/**
 *
 * @author Usuario
 */
public class Terreno extends Propiedad {
    private int area;

    public Terreno(int area, String nombre, double precio, int stock) {
        super(nombre, precio, stock);
        this.area = area;
    }
      @Override
    public void calcularPrecioTotal(){
          try {
            if (stock>10){
                precio=precio-(precio/0.5);
                        System.out.println(precio);
            }else 
                 System.out.println(precio);

          } catch (Exception e ) {
              System.out.println("No se puede devolver una cuenta a un dato mal guardado");
          }
       
    }
}
