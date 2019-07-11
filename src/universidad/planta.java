/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author usuario
 */
public class planta extends docente{
    private String fechacontrato;
    private int canproyectos;
    public planta(String fechacontrato, int canproyectos, String tipodocumento, String documento, String nombre, String apellidos, int edad, boolean activo, String profecion, String asignatura) {
        super(tipodocumento, documento, nombre, apellidos, edad, activo, profecion, asignatura);
        this.fechacontrato = fechacontrato;
        this.canproyectos = canproyectos;
    }
    public String mostrar (){
    String resultado="";
    resultado = mostrarinfo()+"/t"+profecion+"/t"+asignatura+"/t"+fechacontrato+"/t"+canproyectos;
    return resultado ;
    
    }
}
