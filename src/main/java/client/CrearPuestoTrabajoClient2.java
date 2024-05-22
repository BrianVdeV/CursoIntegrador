/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import java.util.Comparator;
import java.util.Scanner;
import domain.PuestoTrabajo;
import interfaces.CrearPuestoTrabajo2;
import interfaces.ModificarEmpleado;
import interfaces.RegistrarEmpleado;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Action;
import service.PuestoTrabajoService;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class CrearPuestoTrabajoClient2 implements ActionListener{

    static PuestoTrabajoService puestoTrabajoService = new PuestoTrabajoService();
    static CrearPuestoTrabajo2 agPuestoTrabajo;
    static PuestoTrabajo puestoTrabajo;

    public CrearPuestoTrabajoClient2(CrearPuestoTrabajo2 agPuestoTrabajo){
        
        this.agPuestoTrabajo = agPuestoTrabajo;
        this.agPuestoTrabajo.btn_Registrar_CrearPuesto2.addActionListener(this);
        this.agPuestoTrabajo.btn_Cancelar_ModificarPuesto2.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {   
            adicionar();   
    }
    
    
    public static void adicionar() {
        PuestoTrabajo nuevaPuestoTrabajo = new PuestoTrabajo();
        
        System.out.println("\nAdición de nuevo PuestoTrabajo");
        System.out.println("======================");

        System.out.print("Ingrese el Puesto de Trabajo del empleado: ");
        nuevaPuestoTrabajo.setNombrePuesto(agPuestoTrabajo.txt_PuestoTrabajo_CrearPuesto2.getText());
        
        System.out.print("Ingrese la descripcion del puesto de Trabajo del empleado: ");
        nuevaPuestoTrabajo.setDescripción(agPuestoTrabajo.ta_DescripcionTrabajo_CrearPuesto2.getText());


        if (puestoTrabajoService.adicionar(nuevaPuestoTrabajo)) {
            System.out.println("PuestoTrabajo añadido con éxito.");
            agPuestoTrabajo.txt_PuestoTrabajo_CrearPuesto2.setText("");
            agPuestoTrabajo.ta_DescripcionTrabajo_CrearPuesto2.setText("");
            
            //cerrar interfaz y abrir el crear puesto trabajo 2
            ModificarEmpleado re = new ModificarEmpleado();
            re.setVisible(true);
            agPuestoTrabajo.setVisible(false);
        
        } else {
            System.out.println("No se pudo añadir la PuestoTrabajo. Verifique los datos e intente nuevamente.");
        }
        
    }

   


    
}
