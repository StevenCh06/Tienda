
package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;


public interface ProductoService {
    
    //Retorna una lista de caegorias (activas o todas)
    public List<Producto> getProductos(boolean activos); // Firma de un metodo
    
    //Retorna na producto por ID
    public Producto getProducto(Producto producto);
    
    
    // Se inserta un nuevo registros si el ID de la producto esta vacío
    //Se actualiza el registro si el ID de la producto NO esta vacío
    public void save (Producto producto);
    
    // Se elimina el producto que tiene el id pasado por parámetro
    public void delete (Producto producto);
    
    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);
    
    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);
    
     //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);
    
}
