/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repository.producto.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import domain.Producto;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import static repository.marca.impl.MarcaFileRepository.removeDuplicates;
import repository.producto.ProductoRepository;

/**
 *
 * @author Timothy
 *
 * Implementa un CRUD (Create, Read, Update y Delete) basado en Arreglos para la
 * clase Producto
 *
 *
 */
public class ProductoFileRepository implements ProductoRepository {

    private static final String RUTA_ARCHIVO = "productos.txt";
    public static final int TAMANIO_INICIAL = 10;
    private static Producto[] productos = new Producto[TAMANIO_INICIAL];
    private static int size = 0;
    private static int secuenciaId = 1;  // Variable estática para generar idProductoes

    // Constructor
    public ProductoFileRepository() {
        loadFromFile();
    }

    private void loadFromFile() {
        File file = new File(RUTA_ARCHIVO);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }

        try (Scanner scanner = new Scanner(file, StandardCharsets.UTF_8)) {
            while (scanner.hasNextLine()) {
                if (size >= productos.length) {
                    productos = Arrays.copyOf(productos, productos.length * 2);
                }

                String line = scanner.nextLine();
                String[] fields = line.split("\\|");
                Producto producto = new Producto();
                producto.setIdProducto(Integer.valueOf(fields[0]));
                producto.setNombre(fields[1]);
                producto.setCodigo(fields[2]);
                producto.setPrecioVenta(Float.parseFloat(fields[3]));
                producto.setStock(Integer.parseInt(fields[4]));
                producto.setMarc(fields[5]);
                producto.setTipoMasc(fields[6]);
                productos[size++] = producto;
                if (secuenciaId <= producto.getIdProducto()) {
                    secuenciaId = producto.getIdProducto() + 1;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        try {
            removeDuplicates(RUTA_ARCHIVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveToFile() { //try with resources //AutoCloseable
        try (PrintWriter out = new PrintWriter(new FileWriter(RUTA_ARCHIVO))) {
            for (int i = 0; i < size; i++) {
                Producto producto = productos[i];
                out.println(producto.getIdProducto() + "|" 
                        + producto.getNombre() + "|"
                        + producto.getCodigo()+ "|"
                        + producto.getPrecioVenta()+ "|"
                        + producto.getStock() + "|"
                        + producto.getMarc() + "|"
                        + producto.getTipoMasc());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        try {
            removeDuplicates(RUTA_ARCHIVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // CREATE
    @Override
    public void create(Producto producto) {
        if (size == productos.length) {
            // Redimensionar el arreglo
            Producto[] nuevoArreglo = new Producto[size * 2];
            System.arraycopy(productos, 0, nuevoArreglo, 0, size);
            productos = nuevoArreglo;
        }

        try {
            removeDuplicates(RUTA_ARCHIVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        producto.setIdProducto(secuenciaId);  // Asignar el idProducto automático
        secuenciaId++;  // Incrementar el contador para el próximo artículo

        productos[size] = producto;
        size++;
        saveToFile();
    }

    @Override
    public Producto read(int idProducto) {
        for (int i = 0; i < size; i++) {
            if (productos[i].getIdProducto().equals(idProducto)) {
                return productos[i];
            }
        }
        
        try {
            removeDuplicates(RUTA_ARCHIVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return null;
    }

    @Override
    public Producto[] readAll() {
        Producto[] activeArticles = new Producto[size];
        System.arraycopy(productos, 0, activeArticles, 0, size);
        return activeArticles;
    }

    @Override
    public Producto[] readAllWithOrder(Comparator criterio) {
        Producto[] activeArticles = readAll();
        Arrays.sort(activeArticles, criterio);
        return activeArticles;
    }

    // UPDATE
    @Override
    public boolean update(int idProducto, Producto updatedProducto) {
        for (int i = 0; i < size; i++) {
            if (productos[i].getIdProducto().equals(idProducto)) {
                updatedProducto.setIdProducto(idProducto);
                productos[i] = updatedProducto;
                saveToFile();
                return true;
            }
        }
        
        try {
            removeDuplicates(RUTA_ARCHIVO);
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        
        return false;
    }

    // DELETE
    @Override
    public boolean delete(int idProducto) {
        for (int i = 0; i < size; i++) {
            if (productos[i].getIdProducto().equals(idProducto)) {
                // Desplazar los elementos restantes
                System.arraycopy(productos, i + 1, productos, i, size - i - 1);
                size--;
                saveToFile();
                return true;
            }
        }
        return false;
    }


        public static void removeDuplicates(String filePath) throws IOException {
        // Lee todas las líneas del archivo
        List<String> lines = Files.readAllLines(Paths.get(filePath));

        // Usa un LinkedHashSet para mantener el orden y eliminar duplicados
        Set<String> uniqueLines = new LinkedHashSet<>(lines);

        // Escribe las líneas únicas de vuelta al archivo
        Files.write(Paths.get(filePath), uniqueLines);
    }

}
