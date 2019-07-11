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
public class alumnos extends personal  {
    private String codigo,facultad,programa;
    private int semestre ;

    public alumnos(String tipodocumento, String documento, String nombre, String apellidos, int edad, boolean activo,String codigo,String facultad , String programa,int semestre) {
        super(tipodocumento, documento, nombre, apellidos, edad, activo);
        this.codigo = codigo;
        this.facultad = facultad;
        this.programa = programa;
        this.semestre = semestre;
    }
public String mostrar(){
String resultado="";
resultado=mostrarinfo()+"/t"+codigo+"/t"+facultad+"/t"+programa+"/t"+semestre;
return resultado;
} 
  public void setcodigo(String codigo){
         this.codigo=codigo;
  }
         public void setfacultad(String facultad){
         this.facultad=facultad;
         }
         public void setprograma(String programa){
         this.programa=programa;
    }
          public void setsemestre(int semestre){
         this.semestre=semestre;
   
    
}
}
