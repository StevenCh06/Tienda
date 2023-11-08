
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    
    //Retorna una lista de caegorias (activas o todas)
    public List<Categoria> getCategorias(boolean activos); // Firma de un metodo
    
    //Retorna na categoria por ID
    public Categoria getCategoria(Categoria categoria);
    
    
    // Se inserta un nuevo registros si el ID de la categoria esta vacío
    //Se actualiza el registro si el ID de la categoria NO esta vacío
    public void save (Categoria categoria);
    
    // Se elimina el categoria que tiene el id pasado por parámetro
    public void delete (Categoria categoria);
    
    public List<Categoria> getCategoriasDescripcion (String descripcion) ;
}
