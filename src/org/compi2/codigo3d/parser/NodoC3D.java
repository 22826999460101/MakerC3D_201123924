package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad;
    private String etqv;
    private String etqf;
    public NodoC3D(String cad) {
        this.cad = cad;
    }


    NodoC3D() {
        cad = "";
        etqv="";
        etqf="";
    }
    
    public String getCad(){
        return cad;
    }
     public String getEtqv(){
        return etqv;
    }
      public String getEtqf(){
        return etqf;
    }
     
    public void setEtqv(String etq){
        etqv = etq;
    }
      public void setEtqf(String etq){
        etqf = etq;
    }
}
