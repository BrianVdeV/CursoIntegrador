/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import client.*;
import static client.ModificarEmpleadoClient.modificarEmpleado;
import domain.Empleado;
import interfaces.RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Scanner;
import domain.Producto;
import interfaces.CodigoAutogenerado;
import interfaces.GestionarAlmacen;
import interfaces.GestionarEmpleado;
import interfaces.RegistrarEmpleado;
import java.time.LocalDate;
import service.*;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class CrearEmpleadoClient implements ActionListener {

    static EmpleadoService empleadoService = new EmpleadoService();
    static RegistrarEmpleado registrarEmpleado = new RegistrarEmpleado();

    public CrearEmpleadoClient(RegistrarEmpleado registrarEmpleado) {

        this.registrarEmpleado = registrarEmpleado;
        this.registrarEmpleado.btn_Registrar_DatoEmpleado.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registrarEmpleado.btn_Registrar_DatoEmpleado) {
            adicionar();
        }

    }

    public static void adicionar() {
        Empleado nuevoEmpleado = new Empleado();

        System.out.println("\nAdición de Empleado Nuevo");
        System.out.println("======================");

        System.out.println("Crear Codigo para el Empleado");

        LocalDate fechaActual = LocalDate.now();

        String codigo = "";

        String txt1 = "Empl-";
        String dia = String.format("%02d", fechaActual.getDayOfMonth());
        String mes = String.format("%02d", fechaActual.getMonthValue());
        String año = String.format("%02d", fechaActual.getYear() % 100);

        Empleado[] idEmpleado = empleadoService.consultar();

        short tamaño = (short) idEmpleado.length;
        String tamañoFormat = String.format("%02d", (tamaño + 1));

        System.out.println(tamañoFormat);

        codigo = txt1 + dia + mes + año + tamañoFormat;

        System.out.println(codigo);

        nuevoEmpleado.setCodigo(codigo);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = registrarEmpleado.txt_Nombre_DatoEmpleado.getText();
        nuevoEmpleado.setNombre(nombre);

        System.out.print("Ingrese el apellido del empleado: ");
        String apellido = registrarEmpleado.txt_Apellido_DatoEmpleado.getText();
        nuevoEmpleado.setApellido(apellido);

        System.out.print("Ingrese el DNI / pasaporte del empleado: ");
        String DNI = registrarEmpleado.txt_DNI_DatoEmpleado.getText();
        nuevoEmpleado.setDni(DNI);

        System.out.print("Ingrese el sexo: ");
        Object sexo = registrarEmpleado.cbx_Sexo_DatoEmpleado.getSelectedItem();
        String sex = sexo.toString();
        nuevoEmpleado.setSexo(sex);

        System.out.print("Ingrese el numero de contacto: ");
        String numeroContacto = registrarEmpleado.txt_NumeroContacto_DatoEmpleado.getText();
        nuevoEmpleado.setNumeroContacto(numeroContacto);

        System.out.print("Ingrese el puesto de trabajo: ");
        Object seleccionPuestoTrabajo = registrarEmpleado.cbx_PuestoTrabajo_DatoEmpleado.getSelectedItem();
        String puestoTrabajo = seleccionPuestoTrabajo.toString();
        nuevoEmpleado.setPuestoTrab(puestoTrabajo);

        System.out.print("Ingrese el estado de empleado: ");

        String estado = "";

        if (registrarEmpleado.ck_Activo_DatoEmpleado.isSelected()) {
            estado = "Activo";
        } else if (registrarEmpleado.ck_Inactivo_DatoEmpleado.isSelected()) {
            estado = "Inactivo";
        }

        nuevoEmpleado.setEstado(estado);

        if (empleadoService.adicionar(nuevoEmpleado)) {
            System.out.println("producto añadido con éxito.");

            CodigoAutogenerado ge = new CodigoAutogenerado();
            
            ge.setVisible(true);
            ge.txt_CodigoAutogenerado.setText(codigo);

            modificarEmpleado.setVisible(false);

        } else {
            System.out.println("No se pudo añadir el producto. Verifique los datos e intente nuevamente.");
        }
    }

}
