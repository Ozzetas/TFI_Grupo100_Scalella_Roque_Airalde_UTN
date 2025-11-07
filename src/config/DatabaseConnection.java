/*
Trabajo Final Integrador (Programacion 2)
Grupo 100: Mascota -- Microchip
Alumnos: Matias Scalella - Gabriel Osvaldo Roque - Milagros Abril Airalde
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    
    // ----- Datos de conexion a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/db_mascotas";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    // ----- Bloque para cargar el Driver JBDC
    static {
        try {
            // Se registra el driver MySQL en el DriverManager
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // Si no se encuentra el driver, lanza excepción en tiempo de ejecución
            throw new RuntimeException("Error: No se encontró el driver JDBC, ", e);
        }
    }
    
    // ----- Método estático que devuelve una conexión a la base de datos
    public static Connection getConnection() throws SQLException {
        
        // Validación simple para evitar URLs o credenciales vacías
        if (URL == null || URL.isEmpty() || USER == null || USER.isEmpty()) {
            throw new SQLException("Configuración de la base de datos incompleta o inválida");
        }
        
        // Se obtiene la conexión con DriverManager usando URL, usuario y contraseña
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
