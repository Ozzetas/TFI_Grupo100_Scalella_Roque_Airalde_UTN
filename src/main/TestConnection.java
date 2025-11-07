/*
Trabajo Final Integrador (Programacion 2)
Grupo 100: Mascota -- Microchip
Alumnos: Matias Scalella - Gabriel Osvaldo Roque - Milagros Abril Airalde
 */
package main;

import config.DatabaseConnection;
import java.sql.Connection;
import java.sql.SQLException;

public class TestConnection {
    public static void main(String[] args) {
        
        System.out.println("🔄 Intentando conectar a la base de datos...");

        // try-with-resources: cierra la conexión automáticamente al finalizar
        try (Connection conn = DatabaseConnection.getConnection()) {
            if (conn != null && !conn.isClosed()) {
                System.out.println("✅ Conexión exitosa a la base de datos 'db_mascotas'.");
            } else {
                System.out.println("⚠️ La conexión se estableció, pero parece cerrada.");
            }
        } catch (SQLException e) {
            System.err.println("❌ Error al conectar con la base de datos: " + e.getMessage());
        }
    }
}
