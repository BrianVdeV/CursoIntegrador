/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import domain.Marca;
import domain.PuestoTrabajo;
import java.util.ArrayList;

/**
 *
 * @author JESSY
 */
public class CrearPuestoTrabajo_CB {
    
    ArrayList<PuestoTrabajo>lista;
    
    public CrearPuestoTrabajo_CB(){
        
       
        lista = new ArrayList<>();
        
    }
    
    public void AgregarPuestoTrabajo(PuestoTrabajo puestoTrabajo){
        
        lista.add(puestoTrabajo);
    }
    
    
}
