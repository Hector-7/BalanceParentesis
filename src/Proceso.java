
import java.util.Stack;

/*
Clase de nombre Proceso, se crean las variables privadas para el uso de la comprobacion
*/
public class Proceso {
    
    private String cadena; //Cadena privada para uso de la clase Proceso
    private Stack<Character> letras = new Stack<Character>(); //Variable "letras" en modo de caracter para uso de pila
    
    /*
    Metodo Proceso para igualar la cadena ingresada con la variable privada
    */
    public Proceso(String cadena){
        
        this.cadena = cadena;
    }
    
    /*
    Proceso booleano de nombre "equilibrada" para comprobar que es una cadena equilibrada o no
    */
    public boolean equilibrada(){
        
        char arreglo_letras[] = cadena.toCharArray(); //Se convierte la cadena a tipo arreglo de caracteres
        
        /*
        Se crea un proceso for para navegar por cada nodo y verificar los parentesis
        */
        for(int i=0; i<arreglo_letras.length;i++){
            if(arreglo_letras[i] == '('){
                letras.push('('); //Se encuentra un parentesis "(" y se agrega al arreglo (pila)
            }
            else if(arreglo_letras[i] == ')'){ // Accion en caso de encontrar un parentesis que cierra ")"
                if (letras.contains(')')){ // En caso de que en la pila ya se encuentre un parentesis de cerrar, no se quitara, sino se agregara otro para evitar que el proceso de resultado verdadero
                    letras.push(')');}
                else if(letras.empty()){//En caso de que la pila este vacia pero se encuentre un parentesis ")" se ingresa al registro para evitar un regreso de "true" aunque se encuentren parentesis sin cerrar
                    letras.push(')');
                }else{
                    letras.pop(); // En caso de que se encuentre un parentesis cerrado pero en la pila este uno de apertura, se borrara el de apertura para generar el equilibrio
                }
            }
        }
        return letras.empty(); //En el caso de que la pila este vacia por cualquier parentesis, se regresa el valor de "true" o "false"
    }
    /*
    El metodo de mensaje se utiliza para comprobar que la cadena es o no equilibrada base a un mensaje
    */
    public String Mensaje(){
        if (letras.empty()== true){
            System.out.println("Cadena equilibrada");
        }else{
            System.out.println("Cadena no equilibrada");
        }
        return ("");
    }
}