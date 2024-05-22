/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import client.*;
import java.util.Comparator;
import java.util.Scanner;
import domain.Producto;
import interfaces.GestionarAlmacen;
import interfaces.ModificarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import service.*;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class ModificarProductoClient implements ActionListener{

    static ProductoService productoService = new ProductoService();
    static ModificarProducto modificarProducto = new ModificarProducto();
    
    public ModificarProductoClient(ModificarProducto mpc){
        this.modificarProducto = mpc;
        this.modificarProducto.btn_Modificar_ModificarProducto.addActionListener(this);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
        if(e.getSource() == modificarProducto.btn_Modificar_ModificarProducto){
            modificar();
        }
    
    }


   
    public static void modificar() {

        System.out.println("\nModificación del producto");
        System.out.println("===========================");

        System.out.print("Ingrese el Id del producto: ");
        int idModificar = Integer.parseInt( modificarProducto.txt_Id_ModificarProducto.getText());
        
        Producto producto = productoService.consultarPorId(idModificar);
        
        Producto productoModificado = new Producto();
        
//        int idModificarint = local.getIdLocal();
//        localModificado.setIdLocal(idModificarint);
        
        System.out.println("\nAdición de producto Nuevo");
        System.out.println("======================");

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = modificarProducto.txt_Nombre_ModificarProducto.getText();
        productoModificado.setNombre(nombre);

        System.out.print("Ingrese el codigo del producto: ");
        String codigo = modificarProducto.txt_Codigo_ModificarProducto.getText();
        productoModificado.setCodigo(codigo);

        System.out.print("Ingrese el precio de venta: ");
        float precio = Float.parseFloat(modificarProducto.txt_Precio_ModificarProducto.getText()) + 0.0f;
        productoModificado.setPrecioVenta(precio);

        System.out.print("Ingrese el stock: ");
        int stock = Integer.parseInt(modificarProducto.txt_Stock_ModificarProducto.getText());
        productoModificado.setStock(stock);

        System.out.print("Ingrese la marca: ");
        Object seleccionarMarca = modificarProducto.cbx_Marca_ModificarProducto.getSelectedItem();
        String marca = seleccionarMarca.toString();;
        productoModificado.setMarc(marca);

        System.out.print("Ingrese el tipo de mascota: ");
        Object seleccionTipoMascota = modificarProducto.cbx_Mascota_ModificarProducto.getSelectedItem();
        String tipoMascota = seleccionTipoMascota.toString();
        productoModificado.setTipoMasc(tipoMascota);

        if (productoService.modificar(idModificar, productoModificado)) {
            System.out.println("Producto modificado con éxito.");
            
            GestionarAlmacen ga = new GestionarAlmacen();
            ga.setVisible(true);
            modificarProducto.setVisible(false);
            
        } else {
            System.out.println("No se pudo modificar el Producto. Verifique los datos e intente nuevamente.");
        }
    }



}
