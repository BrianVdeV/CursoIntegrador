/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import domain.TipoMascota;
import java.util.ArrayList;
import javax.swing.JComboBox;

/**
 *
 * @author JESSY
 */
public class CrearMascotas_CB {
    
    ArrayList<TipoMascota>lista;
    
    public CrearMascotas_CB(){
        
        
        lista = new ArrayList<>();
        
    }
    
    public void AgregarTipoMascota(TipoMascota tipoMascota){
        
        lista.add(tipoMascota);
    }
    

    
    

    
    
}
