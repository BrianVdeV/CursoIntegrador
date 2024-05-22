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
public class ProductoMarcaAscendenteOrder implements Comparator<Producto> {

    @Override
    public int compare(Producto o1, Producto o2) {
        
        return o1.getMarca().compareTo(o2.getMarca());
    }
    
}
