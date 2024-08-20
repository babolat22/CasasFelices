/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package casasfelices;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Usuario
 */
public class Inmobiliaria {

    Map<String, Propiedad> inventario = new HashMap<>();

    public void agregarPropiedad(Propiedad propiedad) {
        try {
            inventario.put(propiedad.nombre, propiedad);

        } catch (IllegalArgumentException ex) {
            System.out.println("Datos incompletos o ya existe una propiedad con ese nombre"+ ex);
        }
    }

    public void mostrarInventario() {
        for (Map.Entry<String, Propiedad> entry : inventario.entrySet()) {
            System.out.print(entry.getKey() + " - ");
            System.out.println(entry.getValue());
        }
    }

    
}
