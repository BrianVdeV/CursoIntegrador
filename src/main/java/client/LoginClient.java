/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import client.*;
import java.util.Comparator;
import java.util.Scanner;
import domain.Usuario;
import interfaces.Login;
import interfaces.VistaPrevia;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import main.Main;
import service.*;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class LoginClient implements ActionListener{

    static UsuarioService usuarioService = new UsuarioService();
    static Login login;

    
    public LoginClient (Login login){
        this.login = login;
        this.login.btn_Ingresar_Login.addActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
//        adicionar();
consultarPorIdYValidarUsuario();
    
    }

    
    
    
    public static void adicionar() {
        Usuario nuevoUsuario = new Usuario();

        System.out.println("\nAdición de Usuario Nuevo");
        System.out.println("======================");

        System.out.print("Ingrese el nombre de usuario: ");
        String nombre = "admin";
        nuevoUsuario.setNombreUsuario(nombre);

        System.out.print("Ingrese la contraseña del usuario: ");
        String codigo = "12345678";
        nuevoUsuario.setContraseña(codigo);


        if (usuarioService.adicionar(nuevoUsuario)) {
            System.out.println("Usuario añadido con éxito.");

        } else {
            System.out.println("No se pudo añadir el usuario. Verifique los datos e intente nuevamente.");
        }
    }
    
    
    
    
    
    
    
    private static void consultarPorIdYValidarUsuario() {

        int puntosValidacion = 0;
        
        System.out.println("\nConsulta de Local por Id");
        System.out.println("===============================");

        System.out.print("Ingrese el identificador del local a consultar: ");
        int idConsultar = 1;

        Usuario usuario = usuarioService.consultarPorId(idConsultar);
        if (usuario != null) {
            
            String nombreUsuario = login.txt_NombreUsuario_Login.getText();
            String contraseñaUsuario = login.txt_Contraseña_Login.getText();
            
            
           
            
            if(usuario.getIdUsuario().equals(nombreUsuario)){
                puntosValidacion = 1;
            }else{
                System.out.println("el Nombre de Usuario no es el correcto");
                puntosValidacion = 0;
            }
                   
            if(usuario.getContraseña().equals(contraseñaUsuario)){
                puntosValidacion = 1;
            }else{
                System.out.println("la contraseña no es el correcto");
                puntosValidacion = 0;
            }
            
            if(puntosValidacion == 1){
                
                VistaPrevia vp = new VistaPrevia();
                vp.setVisible(true);
                login.setVisible(false);
                
            }else{
                System.out.println("vuelva a ingresar sus datos");
            }
            
            
        } else {
            System.out.println("No se encontró usuario existente.");
        }
        
        
    }
    


    

    
}
