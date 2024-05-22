/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Orders;

import java.util.Comparator;
import domain.Producto;

/**
 *
 * @author Timothy
 */
public class ProductoPrecioVentaDescendenteOrder implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        
        Float O1 = o1.getPrecioVenta();
        Float O2 = o2.getPrecioVenta();
        
        return O2.compareTo(O1);
    }
    
}
