/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import client.*;
import static client.LoginClient.usuarioService;

import java.util.Comparator;
import java.util.Scanner;
import domain.Usuario;
import interfaces.RecuperarContraseña;
import interfaces.VisualizarCuentaCambiada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import main.Main;
import service.*;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
//public class ModificarClient implements ActionListener {
//
//    // Servicio para manejar usuarios
//    static UsuarioService usuarioService = new UsuarioService();
//    // Vista para la recuperación de contraseña
//    static RecuperarContraseña recuperarContraseña;
//    // Vista para visualizar la cuenta cambiada
//    static VisualizarCuentaCambiada visualizarCuentaCambiada;
//
//    public ModificarClient(RecuperarContraseña recuperarContraseña, VisualizarCuentaCambiada visualizarCuentaCambiada) {
//        this.recuperarContraseña = recuperarContraseña;
//        this.visualizarCuentaCambiada = visualizarCuentaCambiada;
//        this.recuperarContraseña.btn_Cambiar_RecuContra.addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        modificar();
//    }
//
//    public void modificar() {
//        System.out.println("\nModificación del Usuario");
//        System.out.println("===========================");
//
//        int idModificar = 1; // ID del usuario a modificar
//
//        Usuario usuarioModificado = new Usuario();
//
//        // Obtener los datos de la vista de recuperación de contraseña
//        String nombreUsuario = recuperarContraseña.txt_NombreUsuario_RecuContra.getText();
//        usuarioModificado.setNombreUsuario(nombreUsuario);
//
//        String contraseña = recuperarContraseña.txt_Contraseña_RecuContra.getText();
//        usuarioModificado.setContraseña(contraseña);
//
//        if (usuarioService.modificar(idModificar, usuarioModificado)) {
//            System.out.println("Usuario modificado con éxito.");
//            
//            visualizarCuentaCambiada.setVisible(true);
//            recuperarContraseña.setVisible(false);
//            
//            // Actualizar la vista después de la modificación
//            consultarYActualizarVista(idModificar);
//        } else {
//            System.out.println("No se pudo modificar el Usuario. Verifique los datos e intente nuevamente.");
//        }
//    }
//
//    public void consultarYActualizarVista(int idConsultar) {
//        Usuario usuario = usuarioService.consultarPorId(idConsultar);
//        if (usuario != null) {
//            visualizarCuentaCambiada.txt_NombreUsuario_VisuCuentaCamb.setText(usuario.getNombreUsuario());
//            visualizarCuentaCambiada.txt_Contraseña_VisuCuentaCamb.setText(usuario.getContraseña());
//        } else {
//            System.out.println("No se encontró el usuario con el ID especificado.");
//        }
//    }
//
//    public static void main(String[] args) {
//        // Inicialización de las vistas
//        RecuperarContraseña recuperarContraseña = new RecuperarContraseña();
//        VisualizarCuentaCambiada visualizarCuentaCambiada = new VisualizarCuentaCambiada();
//        ModificarClient modificarClient = new ModificarClient(recuperarContraseña, visualizarCuentaCambiada);
//
//        // Mostrar la vista de recuperación de contraseña
//        recuperarContraseña.setVisible(true);
//    }
//}
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//public class ModificarClient implements ActionListener {
//
//    static UsuarioService usuarioService = new UsuarioService();
//    static RecuperarContraseña recuperarContraseña;
//    static VisualizarCuentaCambiada visualizarCuentaCambiada;
//
//    public ModificarClient(RecuperarContraseña recuperarContraseña) {
//        this.recuperarContraseña = recuperarContraseña;
//        this.recuperarContraseña.btn_Cambiar_RecuContra.addActionListener(this);
//    }
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        modificar();
//    }
//
//    public static void modificar() {
//        System.out.println("\nModificación del Usuario");
//        System.out.println("===========================");
//
//        int idModificar = 1; // Suponiendo que el ID del usuario a modificar es 1
//
//        Usuario usuarioModificado = new Usuario();
//        usuarioModificado.setNombreUsuario(recuperarContraseña.txt_NombreUsuario_RecuContra.getText());
//        usuarioModificado.setContraseña(recuperarContraseña.txt_Contraseña_RecuContra.getText());
//
//        if (usuarioService.modificar(idModificar, usuarioModificado)) {
//            System.out.println("Usuario modificado con éxito.");
//            
//
//
//
//            actualizarVista();
//        } else {
//            System.out.println("No se pudo modificar el Usuario. Verifique los datos e intente nuevamente.");
//        }
//    }
//
//    public static void actualizarVista() {
//        if (visualizarCuentaCambiada == null) {
//            visualizarCuentaCambiada = new VisualizarCuentaCambiada();
//        }
//
//        Usuario usuario = usuarioService.consultarPorId(1); // Consulta el usuario modificado
//        if (usuario != null) {
//            visualizarCuentaCambiada.txt_NombreUsuario_VisuCuentaCamb.setText(usuario.getNombreUsuario());
//            visualizarCuentaCambiada.txt_Contraseña_VisuCuentaCamb.setText(usuario.getContraseña());
//            visualizarCuentaCambiada.setVisible(true);
//        } else {
//            System.out.println("No se encontró el usuario con el ID especificado.");
//        }
//    }
//}
public class ModificarClient implements ActionListener {

    static UsuarioService usuarioService = new UsuarioService();
    static RecuperarContraseña recuperarContraseña;
    static VisualizarCuentaCambiada visualizarCuentaCambiada;

    public ModificarClient(RecuperarContraseña recuperarContraseña) {
        this.recuperarContraseña = recuperarContraseña;
        this.recuperarContraseña.btn_Cambiar_RecuContra.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        modificarYVisualizarCuenta();
    }

    public static void modificarYVisualizarCuenta() {
        System.out.println("\nModificación del Usuario");
        System.out.println("===========================");

        int idModificar = 1; // Suponiendo que el ID del usuario a modificar es 1

        Usuario usuarioModificado = new Usuario();
        usuarioModificado.setNombreUsuario(recuperarContraseña.txt_NombreUsuario_RecuContra.getText());
        usuarioModificado.setContraseña(recuperarContraseña.txt_Contraseña_RecuContra.getText());

        if (usuarioService.modificar(idModificar, usuarioModificado)) {
            System.out.println("Usuario modificado con éxito.");

            if (visualizarCuentaCambiada == null) {
                visualizarCuentaCambiada = new VisualizarCuentaCambiada();
            }

            Usuario usuario = usuarioService.consultarPorId(1); // Consulta el usuario modificado
            if (usuario != null) {
                visualizarCuentaCambiada.txt_NombreUsuario_VisuCuentaCamb.setText(usuario.getNombreUsuario());
                visualizarCuentaCambiada.txt_Contraseña_VisuCuentaCamb.setText(usuario.getContraseña());
                visualizarCuentaCambiada.setVisible(true);
                recuperarContraseña.dispose(); // Cierra la ventana actual
            } else {
                System.out.println("No se encontró el usuario con el ID especificado.");
            }

        } else {
            System.out.println("No se pudo modificar el Usuario. Verifique los datos e intente nuevamente.");
        }
    }

   
}
