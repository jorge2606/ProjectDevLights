/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmocadena;

/**
 *
 * @author Jorge
 */
public class OperacionesCadena {
    
    private String cadena;
    public OperacionesCadena(){
        this.cadena = "aaabccddd";
    }
    
    public OperacionesCadena(String p_cadena){
        this.cadena = p_cadena;
    }
    
    private void setCadena(String p_cadena){
        this.cadena = p_cadena;
    }
    
    public String getCadena(){
       return this.cadena;
    }
    
    private char[] convertir_a_array(){
        char[] cadena_aux = new char[this.getCadena().length()];
        for(int i = 0; i < this.getCadena().length(); i++){
            cadena_aux[i] = this.getCadena().charAt(i);
        }
        return cadena_aux;        
    }
    
    public char[] eliminarAdyacentes(){
        char aux = ' ';
        boolean cont = false;
        char[] cadena_aux = this.convertir_a_array();
        for(int i = 0; i < cadena_aux.length; i++){
            //pregunto si el caracter actual es igual al anterior aaabccddd
            if (aux == cadena_aux[i]){
                cont = true;
            }else{
                cont = false;
            }
            //si es True elimino el caracter anterior y el actual
            if (cont == true){
                //System.out.println(this.getCadena().charAt(i)+" "+aux);
                //System.out.println(this.getCadena().substring(i, this.getCadena().length()));
                cadena_aux[i-1] = ' ';
                cadena_aux[i] = ' ';
                //System.out.println(this.getCadena().substring(i, this.getCadena().length()));  
            }
            aux = cadena_aux[i];
        }
        return cadena_aux;
    }
}
