/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import client.*;
import static client.CrearEmpleadoClient.registrarEmpleado;
import domain.Empleado;
import java.util.Comparator;
import java.util.Scanner;
import domain.Producto;
import interfaces.CodigoAutogenerado;
import interfaces.GestionarEmpleado;
import interfaces.ModificarEmpleado;
import interfaces.ModificarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import service.*;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class ModificarEmpleadoClient implements ActionListener {

    static EmpleadoService empleadoService = new EmpleadoService();
    static ModificarEmpleado modificarEmpleado = new ModificarEmpleado();

    //codigoAutogenerado
    public ModificarEmpleadoClient(ModificarEmpleado mpc) {
        this.modificarEmpleado = mpc;
        this.modificarEmpleado.btn_Modificar_ModificarEmpleado.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == modificarEmpleado.btn_Modificar_ModificarEmpleado) {
            modificar();
        }

    }

    public static void modificar() {

        System.out.println("\nModificación del Empleado");
        System.out.println("===========================");

        System.out.print("Ingrese el Id del Empleado: ");
        int idModificar = Integer.parseInt(modificarEmpleado.txt_Id_ModificarEmpleado.getText());

        Empleado empleado = empleadoService.consultarPorId(idModificar);

        Empleado empleadoModificado = new Empleado();

        //Id Empleado
        int idModificarint = empleado.getIdEmpleado();
        empleadoModificado.setIdEmpleado(idModificarint);

        //Codigo Empleado
        String codigoEmpleado = empleado.getCodigo();
        empleadoModificado.setCodigo(codigoEmpleado);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = modificarEmpleado.txt_Nombre_ModificarEmpleado.getText();
        empleadoModificado.setNombre(nombre);

        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = modificarEmpleado.txt_Apellido_ModificarEmpleado.getText();
        empleadoModificado.setApellido(apellido);

        System.out.print("Ingrese el DNI / pasaporte del empleado: ");
        String DNI = modificarEmpleado.txt_DNI_ModificarEmpleado.getText();
        empleadoModificado.setDni(DNI);

        System.out.print("Ingrese el sexo: ");
        Object sexo = modificarEmpleado.cbx_Sexo_ModificarEmpleado.getSelectedItem();
        String sex = sexo.toString();
        empleadoModificado.setSexo(sex);

        System.out.print("Ingrese el numero de contacto: ");
        String numeroContacto = modificarEmpleado.txt_NumeroContacto_ModificarEmpleado.getText();
        empleadoModificado.setNumeroContacto(numeroContacto);

        System.out.print("Ingrese el puesto de trabajo: ");
        Object seleccionPuestoTrabajo = modificarEmpleado.cbx_PuestoTrabajo_ModificarEmpleado.getSelectedItem();
        String puestoTrabajo = seleccionPuestoTrabajo.toString();
        empleadoModificado.setPuestoTrab(puestoTrabajo);

        System.out.print("Ingrese el estado de empleado: ");

        String estado = "";

        if (modificarEmpleado.ck_Activo_ModificarEmpleado.isSelected()) {
            estado = "Activo";
        } else if (modificarEmpleado.ck_Inactivo_ModificarEmpleado.isSelected()) {
            estado = "Inactivo";
        }

        empleadoModificado.setEstado(estado);

        if (empleadoService.modificar(idModificar, empleadoModificado)) {
            System.out.println("Empleado modificado con éxito.");

            GestionarEmpleado ge = new GestionarEmpleado();
            ge.setVisible(true);
            registrarEmpleado.setVisible(false);

        } else {
            System.out.println("No se pudo modificar el Empleado. Verifique los datos e intente nuevamente.");
        }
    }

}
