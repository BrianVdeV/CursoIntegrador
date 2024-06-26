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
public class ProductoStockAscendenteOrder implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        
        Integer O1 = o1.getStock();
        Integer O2 = o2.getStock();
        
        return O1.compareTo(O2);
    }
    
}
