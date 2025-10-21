/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg251025_garciaramos;

/**
 *
 * @author UFG
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pila miPila = new Pila(5);
        
        //SE VERIFICA SI LA PILA ESTÁ VACÍA
        System.out.println("¿La pila está vacía?" + miPila.estaVacia()); //DEVOLVERÁ TRUE O FALSE
        System.out.println();
        
        System.out.println("AGREGANDO VALORES CON MÉTODO PUSH()");
        miPila.push(10); //AGREGANDO EL VALOR ENTERO 10
        miPila.push(20); //AGREGANDO EL VALOR ENTERO 20
        miPila.push(30); //AGREGANDO EL VALOR ENTERO 30
        miPila.push(40); //AGREGANDO EL VALOR ENTERO 40
        miPila.push(50); //AGREGANDO EL VALOR ENTERO 50
        
        System.out.println();
        
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila" + miPila.tamano() + " elementos");
        System.out.println();
        
        System.out.println("AGREGAR ELEMENTO NUEVO CONLA PILA LLENA");
        miPila.push(60);
        System.out.println();
        
        System.out.println("VERIFICACIÓN DEL ÚLTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: " + miPila.peek());
        
        System.out.println("EXTRAER VALORES DE LA PILA");
        System.out.println("Se ha extraído el valor de: "+ miPila.pop()); //SE EXTRAE EL ULTIMO DE LA PILA
        System.out.println("Se ha extraído el valor de: "+ miPila.pop()); 
        System.out.println();
        
        System.out.println("MOSTRANDO VALORES DE LA PILA");
        miPila.mostrar();
        System.out.println("Tamaño actual de la pila "+ miPila.tamano() + " elementos");
        System.out.println();
        
        System.out.println("SE EXTRAEM TODOS LOS ELEMENTOS DE LA PILA");
        //SE RECORREN LOS VALORES DE LA PILA
        while (!miPila.estaVacia()){
            System.out.println("Se ha extraído el valor de: " + miPila.pop());
        }
        System.out.println();
        
        miPila.pop();
        System.out.println();
        
        System.out.println("VERIFICACIÓN DEL ÚLTIMO VALOR AGREGADO");
        System.out.println("El elemento de la cima es: " + miPila.peek());
        System.out.println();
    }
}
