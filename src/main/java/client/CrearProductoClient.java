/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import client.*;
import interfaces.RegistrarProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Comparator;
import java.util.Scanner;
import domain.Producto;
import interfaces.GestionarAlmacen;
import service.*;
import util.StringsUtil;

/**
 *
 * @author Timothy
 */
public class CrearProductoClient implements ActionListener {

    static ProductoService productoService = new ProductoService();
    static RegistrarProducto registrarProducto = new RegistrarProducto();

    public CrearProductoClient(RegistrarProducto registrarProducto) {

        this.registrarProducto = registrarProducto;
        this.registrarProducto.btn_Crear_RegistrarProducto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == registrarProducto.btn_Crear_RegistrarProducto) {
            adicionar();
        }

    }

    public static void adicionar() {
        Producto nuevoProducto = new Producto();

        System.out.println("\nAdición de producto Nuevo");
        System.out.println("======================");

        System.out.print("Ingrese el nombre del producto: ");
        String nombre = registrarProducto.txt_Nombre_RegistrarProducto.getText();
        nuevoProducto.setNombre(nombre);

        System.out.print("Ingrese el codigo del producto: ");
        String codigo = registrarProducto.txt_Codigo_RegistrarProducto.getText();
        nuevoProducto.setCodigo(codigo);

        System.out.print("Ingrese el precio de venta: ");
        float precio = Float.parseFloat(registrarProducto.txt_PrecioVenta_RegistrarProducto.getText()) + 0.0f;
        nuevoProducto.setPrecioVenta(precio);

        System.out.print("Ingrese el stock: ");
        int stock = Integer.parseInt(registrarProducto.txt_Stock_RegistrarProducto.getText());
        nuevoProducto.setStock(stock);

        System.out.print("Ingrese la marca: ");
        Object seleccionarMarca = registrarProducto.cbx_Marca_RegistrarProducto.getSelectedItem();
        String marca = seleccionarMarca.toString();;
        nuevoProducto.setMarc(marca);

        System.out.print("Ingrese el tipo de mascota: ");
        Object seleccionTipoMascota = registrarProducto.cbx_TipoMascota_RegistrarProducto.getSelectedItem();
        String tipoMascota = seleccionTipoMascota.toString();
        
        
        nuevoProducto.setTipoMasc(tipoMascota);

        if (productoService.adicionar(nuevoProducto)) {
            System.out.println("producto añadido con éxito.");

            GestionarAlmacen ga = new GestionarAlmacen();
            ga.setVisible(true);
            registrarProducto.setVisible(false);

        } else {
            System.out.println("No se pudo añadir el producto. Verifique los datos e intente nuevamente.");
        }
    }

}
