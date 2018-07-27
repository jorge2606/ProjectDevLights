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
public class AlgoritmoCadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OperacionesCadena op = new OperacionesCadena("aaabccddd");
        OperacionesCadena op1= new OperacionesCadena("aabc");
        OperacionesCadena op2= new OperacionesCadena("aaabbcccccc1233");
        
        String cadena1 = "";
        String cadena2= "";
        String cadena3 = "";
        
        System.out.println("------------------------------------------");
        for(int j = 0; j < op.eliminarAdyacentes().length; j++){
            if (op.eliminarAdyacentes()[j] != ' '){
                cadena1 = cadena1 + op.eliminarAdyacentes()[j];
            }
        }
        System.out.println("Entrada: aaabccddd");
        System.out.println("Salida: "+ cadena1);
        System.out.println("------------------------------------------");
        for(int k = 0; k < op1.eliminarAdyacentes().length; k++){
            if (op1.eliminarAdyacentes()[k] != ' '){
                cadena2 = cadena2 + op1.eliminarAdyacentes()[k];
            }
        }
        System.out.println("Entrada: aabc");
        System.out.println("Salida: "+ cadena2);
        System.out.println("------------------------------------------");
        for(int l = 0; l < op2.eliminarAdyacentes().length; l++){
            if (op2.eliminarAdyacentes()[l] != ' '){
                cadena3 = cadena3 + op2.eliminarAdyacentes()[l];
            }
        }
        System.out.println("Entrada: " + op2.getCadena());
        if (cadena3 != ""){
            System.out.println("Salida: "+ cadena3);
        }else{
            System.out.println("String Vacío");
        }
    }
    
}
