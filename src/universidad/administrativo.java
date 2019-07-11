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
public class administrativo extends personal {
    private String cargo,fechacontrato;
    
    public administrativo(String tipodocumento,String documento,String apellidos,String nombre,int edad ,boolean activo,String cargo,String fechacontrato){
    
        super(tipodocumento,documento,apellidos,nombre,edad,activo);
    
    this.cargo=cargo;
    this.fechacontrato=fechacontrato;
    }
    public String mostrar(){
    String resultado="";
    resultado=mostrarinfo()+"/t"+cargo+"/t"+fechacontrato;
    return resultado;
    }
public void setcargo (String cargo){
    this.cargo=cargo;
    }
    public void setfechacontrato(String fechacontrato){
         this.fechacontrato=fechacontrato;
    }

}