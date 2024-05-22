/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.util.Comparator;
import java.util.Scanner;
import domain.Marca;
import interfaces.AgregarMarca;
import interfaces.AgregarMarca2;
import interfaces.ModificarProducto;
import interfaces.RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import service.MarcaService;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class MarcaClient2 implements ActionListener{

    static MarcaService marcaService = new MarcaService();
    static AgregarMarca2 agMarca;
    static Marca marca;
    

    public MarcaClient2(AgregarMarca2 agMarca){
        
        this.agMarca = agMarca;
        this.agMarca.btn_Listo_AgregarMarca2.addActionListener(this);
        this.agMarca.btn_Cancelar_AgregarMarca2.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource() == agMarca.btn_Listo_AgregarMarca2){
            adicionar();   
        }
            
    }
    
    
    public static void adicionar() {
        Marca nuevaMarca = new Marca();
        
        System.out.println("\nAdición de nueva Marca");
        System.out.println("======================");

        System.out.print("Ingrese la Marca del producto: ");
        nuevaMarca.setMarca(agMarca.txt_AgregarMarca2.getText());

       
        
        if (marcaService.adicionar(nuevaMarca)) {
            
            System.out.println("Marca añadido con éxito.");
            agMarca.txt_AgregarMarca2.setText("");
            
            //cerrar interfaz actual y mostrar interfaz anterior
             ModificarProducto rp = new ModificarProducto();
            rp.setVisible(true);
            agMarca.setVisible(false);
        } else {
            System.out.println("No se pudo añadir la Marca. Verifique los datos e intente nuevamente.");
        }
        
    }

   


    
}
