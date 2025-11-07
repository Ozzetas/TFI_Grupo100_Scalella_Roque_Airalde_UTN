
package dao;

import java.util.List;

public interface GenericDAO<T> {
    
    // Interfaz Generica para los metodos comunes de las demas entidades DAO (MascotaDAO y MicrochipDAO)
    
    // Metodos CRUD genericos (no contienen cuerpo de metodos)
    void crear(T entidad) throws Exception;
    
    T leer(Long id) throws Exception;
    
    List<T> leerTodos() throws Exception;
    
    void actualizar(T entidad) throws Exception;  
    
    void eliminar(Long id) throws Exception;
    
}
