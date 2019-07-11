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
public class docente extends personal{
    protected String profecion ,asignatura;

    public docente(String tipodocumento, String documento, String nombre, 
            String apellidos, int edad, boolean activo, String profecion ,String asignatura) {
        super(tipodocumento, documento, nombre, apellidos, edad, activo);
        this.profecion=profecion;
        this.asignatura=asignatura;
    }
    public void setasignatura(String asignatura){
         this.asignatura=asignatura;
}
}