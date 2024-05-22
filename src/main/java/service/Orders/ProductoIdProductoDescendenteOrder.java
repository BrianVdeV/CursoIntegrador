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
public class ProductoIdProductoDescendenteOrder implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        
        return o2.getIdProducto().compareTo(o1.getIdProducto());
    }
    
}
