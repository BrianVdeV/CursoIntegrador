/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.util.Comparator;
import java.util.Scanner;
import domain.Marca;
import interfaces.AgregarMarca;
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
public class MarcaClient implements ActionListener{

    static MarcaService marcaService = new MarcaService();
    static AgregarMarca agMarca;
    static Marca marca;
    

    public MarcaClient(AgregarMarca agMarca){
        
        this.agMarca = agMarca;
        this.agMarca.btn_Listo_AgregarMarca.addActionListener(this);
        this.agMarca.btn_Cancelar_AgregarMarca.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {  
        if(e.getSource() == agMarca.btn_Listo_AgregarMarca){
            adicionar();   
        }
            
    }
    
    
    public static void adicionar() {
        Marca nuevaMarca = new Marca();
        
        System.out.println("\nAdición de nueva Marca");
        System.out.println("======================");

        System.out.print("Ingrese la Marca del producto: ");
        nuevaMarca.setMarca(agMarca.txt_AgregarMarca.getText());

        
        
        if (marcaService.adicionar(nuevaMarca)) {
            
            System.out.println("Marca añadido con éxito.");
            agMarca.txt_AgregarMarca.setText("");
            
            //cerrar interfaz actual y mostrar interfaz anterior
            RegistrarProducto rp = new RegistrarProducto();
            rp.setVisible(true);
            agMarca.setVisible(false);
        } else {
            System.out.println("No se pudo añadir la Marca. Verifique los datos e intente nuevamente.");
        }
        
    }

   


    
}
