
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
    
}
