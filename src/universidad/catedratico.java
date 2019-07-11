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
public class catedratico extends docente {
    private  String fechainicio, fechafin;
    
public catedratico(String tipodocumento, String documento, String nombre, 
        String apellidos, int edad, boolean activo, String profecion, 
        String asignatura,String fechainicio,String fechafin) {
   super(tipodocumento, documento, nombre, apellidos, edad, activo, profecion, asignatura);
   this.fechainicio=fechainicio;
   this. fechafin=fechafin;
    }
    public String mostrar(){
    String resultado="";
    resultado=mostrarinfo()+"/t"+asignatura+"/t"+profecion+"/t"+fechainicio+"/t"+fechafin;
    return resultado;
    } 
}
