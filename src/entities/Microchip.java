
package entities;

import java.time.LocalDate;

public class Microchip extends Base {
    // Atributos id y eliminado heredados de Base
    private String codigo;
    private LocalDate fechaImplantacion;
    private String veterinaria;
    private String observaciones;
    private Long idMascota;
    
    // Constructor sobrecargado
    public Microchip(Long id, String codigo, LocalDate fechaImplantacion, String veterinaria, String observaciones) {
        super(id, false); // Atributo "eliminado" con valor default false.
        this.codigo = codigo;
        this.fechaImplantacion = fechaImplantacion;
        this.veterinaria = veterinaria;
        this.observaciones = observaciones;
    }
    
    // Constructor vacio
    public Microchip() {
        super();
    }
    
    // Getters & Setters

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFechaImplantacion() {
        return fechaImplantacion;
    }

    public void setFechaImplantacion(LocalDate fechaImplantacion) {
        this.fechaImplantacion = fechaImplantacion;
    }

    public String getVeterinaria() {
        return veterinaria;
    }

    public void setVeterinaria(String veterinaria) {
        this.veterinaria = veterinaria;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    public Long getIdMascota() {
        return idMascota;
    }
    
    public void setIdMascota(Long idMascota) {
        this.idMascota = idMascota;
    }

    @Override
    public String toString() {
        return "Microchip[ " + 
                "ID: " + getId() +
                " | Codigo: " + codigo + 
                " | Fecha de implantacion: " + fechaImplantacion + 
                " | Veterinaria: " + veterinaria + 
                " ]";
    }

}
