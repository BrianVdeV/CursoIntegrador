/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import domain.Marca;
import java.util.ArrayList;

/**
 *
 * @author JESSY
 */
public class CrearMarca_CB2 {
    
    ArrayList<Marca>lista;
    
    public CrearMarca_CB2(){
        
       
        lista = new ArrayList<>();
        
    }
    
    public void AgregarMArca(Marca marca){
        
        lista.add(marca);
    }
    
    
}
