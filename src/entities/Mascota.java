
package entities;

import java.time.LocalDate;

public class Mascota extends Base {
    // Atributos id y eliminado heredados de Base
    private String nombre;
    private String especie;
    private String raza;
    private LocalDate fechaNacimiento;
    private String duenio;
    private Microchip microchip; // Atributo que establece relacion 1-1
    
    // Constructor sobrecargado
    public Mascota(Long id, String nombre, String especie, String raza, LocalDate fechaNacimiento, String duenio, Microchip microchip) {
        super(id, false); // Atributo "eliminado" con valor default false.
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.fechaNacimiento = fechaNacimiento;
        this.duenio = duenio;
    }
    
    // Constructor vacio
    public Mascota() {
        super();
    }
    
    // Getters & Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getDuenio() {
        return duenio;
    }

    public void setDuenio(String duenio) {
        this.duenio = duenio;
    }

    public Microchip getMicrochip() {
        return microchip;
    }

    public void setMicrochip(Microchip microchip) {
        this.microchip = microchip;
    }

    @Override
    public String toString() {
        return "Mascota[ " + 
                "ID: " + getId() +
                " | Nombre: " + nombre + 
                " | Especie: " + especie + 
                " | Raza: " + raza + 
                " | Fecha de nacimiento: " + fechaNacimiento + 
                " | Dueño: " + duenio + 
                " | Eliminado: " + isEliminado() +
                " ]";
    }
}
