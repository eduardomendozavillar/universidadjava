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
public class personal { 

    protected String tipodocumento,nombre,apellidos,documento;
    protected int edad;
    protected boolean activo;

    public personal(String tipodocumento, String documento , String nombre, 
            String apellidos, int edad , boolean activo){

    this.tipodocumento=tipodocumento;
    this.documento=documento;
    this.apellidos=apellidos;
    this.nombre=nombre;
    this.edad=edad;
    this.activo=activo;
        
}
    public String mostrarinfo(){
    String resultado="";
    String estado="";
    if (this.activo){
    estado="activo"; 
    }else{
    estado="inativo";
    }
    resultado=tipodocumento+"/t"+documento+"/t"+nombre+"/t"+edad+"/t"+apellidos+"/t"+activo;
    return resultado;
    }
    public void setedad (int edad){
    this.edad=edad;
    }
     public void seteactivo (boolean activo){
    this.activo=activo;
    }
}
