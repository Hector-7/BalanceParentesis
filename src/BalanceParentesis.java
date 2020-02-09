
public class BalanceParentesis {

    /*
    Cuerpo principal del programa, 
    se llama a la clase "Proceso"
    dando una cadena de texto
    para realizar la comprobacion 
    de la cadena ingresada
    */
    public static void main(String[] args) {
        
        Proceso p = new Proceso("(a +  z ∗(3 +x) − 5)) +  (4y + 4z) "); //se crea el objeto "p" junto con su cadena a forma de parametro
        System.out.println(p.equilibrada()); //Se realiza la comprobacion en booleano para comprobar
        System.out.println(p.Mensaje()); //En caso de ser "true" la comprobacion o "false" se regresa un mensaje
        }
    }