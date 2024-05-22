/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.util.Comparator;
import java.util.Scanner;
import domain.TipoMascota;
import interfaces.AgregarMascota2;
import interfaces.ModificarProducto;
import interfaces.RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import service.TipoMascotaService;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class AgregarMascotaClient2 implements ActionListener{

    static TipoMascotaService tipoMascotaService = new TipoMascotaService();
    static AgregarMascota2 agMascota;
    static TipoMascota tipoMascota;

    public AgregarMascotaClient2(AgregarMascota2 agMascota){
        
        this.agMascota = agMascota;
        this.agMascota.btn_Listo_AgregarMascota2.addActionListener(this);
        this.agMascota.btn_Cancelar_AgregarMascota2.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {   
            adicionar();   
            
    }
    
    
    public static void adicionar() {
        TipoMascota nuevaTipoMascota = new TipoMascota();
        
        System.out.println("\nAdición de nueva TipoMascota");
        System.out.println("======================");

        System.out.print("Ingrese la TipoMascota perteneciente al producto: ");
        nuevaTipoMascota.setMascota(agMascota.txt_AgregarMascota2.getText());


        if (tipoMascotaService.adicionar(nuevaTipoMascota)) {
            System.out.println("TipoMascota añadido con éxito.");
            agMascota.txt_AgregarMascota2.setText("");
            
            //cerrar interfaz y abrir el anterior
            ModificarProducto rp = new ModificarProducto();
            rp.setVisible(true);
            agMascota.setVisible(false);
        } else {
            System.out.println("No se pudo añadir la TipoMascota. Verifique los datos e intente nuevamente.");
        }
        
    }

   


    
}
