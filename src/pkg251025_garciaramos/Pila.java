/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg251025_garciaramos;

/**
 *
 * @author UFG
 */
public class Pila {
    
    private int[] elementos;
    private int cima;
    private int capacidad;
    
    
    //METODO CONSTRUCTOR DE LA CLASE PILA
    //AL INSTANCIAR UNA NUEVA VARIABLE DE TIPO PILA, ENTONCES
    //SE CREARA EN MEMORIA UN OBJETO CON LOS ATRIBUTOS QUE ESTAN
    //DENTRO DE ESTE CONSTRUCTOR
    public Pila(int tamano){
        
        this.capacidad = tamano; //CANTIDAD DE ELEMENTOS QUE SE VAN A ALMACENAR
        this.elementos = new int[this.capacidad]; //SE CREA UN NUEVO ARREGLO DE TIPO ENTERO
        this.cima = -1; //EL VALOR POR DEFECTO DE LA CIMA ES -1
    }
    
    //METODO PARA VERIFICAR SI LA PILA ESTA VACIA, ES DECIR, SI NO HAY ELEMENTOS
    //O VALORES APILADOS    
    public boolean estaVacia(){
        if(this.cima == -1){
            //EL VALOR DE LA CIMA ES -1 POR LO TANTO, LA PILA ESTA VACIA
            return true;
        }else{
        //EL AVLOR DE LA CIMA ES UN NUMERO DIFERENTE DE -1 POR LO TANTO
        //LA PILA SI TIENE AL MENOS UN VALOR O UN ELEMENTO
            return false;
    }
}

    public boolean estaLlena(){
        if (this.cima == (this.capacidad -1)){
        //EL VALOR DE LA CIMA ES IGUAL A LA CANTIDAD DE ELEMENTOS
            return true;
    }else{
        //EL VALOR DE LA CIMA ES DIFERENTE A LA CANTIDAD DE ELEMENTOS
            return false;
        }
    }

    //DEVUELVE EL VALOR DE LA CIMA, ES DECIR EL VALOR DEL ULTIMO ELEMENTO
    //QUE FUE INSERTADO EN EL ARREGLO
    public int tamano(){
        return this.cima + 1;
    }
    
    //METODO PARA AGREGAR ELEMENTOS AL ARREGLO, ES DECIR A LA PILA
    //PRIMERO SE DEBE REALIZAR LA VERIFICACION DEL TAMAÑO DE LA PILA
    //UNA VEZ VERIFICADA SE PUEDE AGREGAR EL ELEMENTO AL ARREGLO    
    public void push(int elemento){
        if(estaLlena()){
            System.out.println("La pila está llena, no puede agregar el vaor: " + elemento);
            //return;
        }else{
            this.cima++; //SE INCREMENTA EL VALOR DE LA CIMA
            this.elementos[this.cima] = elemento;
            System.out.println("El valor: " + elemento + "fue agregado a la pila");
            }
        }
    
    //METODO PARA EXTRAER UN ELEMENTO DE LA PILA(EL ULTIMO QUE HA SIDO INSERTADO AL ARREGLO)
    public int pop(){
        
        //SE VERIFICA QUE LA PILA NO ESTÉ VACÍA PARA PODER EXTRAER UN ELEMENTO
        if(estaVacia()){
            //SI ESTÁ VACÍA, POR LO TANTO, SE NOTIFICA AL USUARIO
            System.out.println("La pila está vacía, no puede hacer la extracción del elemento");
            //NO SE REALIZA NINGUNA ACCION
            return -1;
        }else{
            //SI HAY ELEMENTOS QUE EXTRAER, POR LO TANTO, SE CREA UNA NUEVA VARIABLE
            //QUE ALMACENARÁ EL VALOR QUE SERÁ EXTRAIDO
            int elementoExtraido = this.elementos[this.cima]; //LA NUEVA VARIABLE POSEE EL VALOR DEL ULTIMO ELEMENTO INSERTADO AL ARREGLO
            this.cima--; //SE REDUCE EL VALOR DE LA CIMA DEBIDO A QUE YA SE EXTRAJO UN ELEMENTO
            return elementoExtraido; //SE DEUELVE AL USUARIO EL VALOR QUE FUE EXTRAÍDO
        }
    }
    
    //MÉTODO PARA VERIFICAR EL ÚLTIMO VALOR INSERTADO, ES DECIR, VER EL VALOR QUE
    //SE PUEDE EXTRAER DE LA PILA
    public int peek(){
        
        //VERIFICA SI ESTA VACIA
        if(estaVacia()){
            //SI ESTA VACIA, POR LO TANTO, SE MOSTRARA EL MENSAJE AL USUARIO
            System.out.println("La pila está vacía");
            //NO SE REALIZA NINGUNA ACCIÓN
            return -1;
        }else{
            //SE DEVUELVE AL USUARIO EL ÚLTIMO ELEMENTO QUE FUE INSERTADO
            //Y QUE ES EL PRÓXIMO ELEMENTO A SER EXTRAÍDO
            return this.elementos[this.cima];
        }
    }
    
    
    //MÉTODO PARA IMPRIMIR LOS VALORES QUE POSEE UNA PILA, ES DECIR,
    //IMPRIMIR TODOS LOS VALORES DEL ARREGLO, DESDE EL ÚLTIMO QUE FUE
    //AGREGADO, HASTA EL PRIMERO (EN ESE ORDEN)
    public void mostrar(){
        
        //SE VERIFIVA QUE LA PILA NO ESTÉ VACÍA
        if(estaVacia()){
            //SÍ ESTÁ VACÍA, POR LO TANTO NO REALIZA NADA
            System.out.println("La pila está vacía");
        }else{
            //SE IMPRIME LA SALIDA DEL USUARIO
            System.out.println("Contenido de la pila (desde la cima, hasta la base de la pila)");
            //SE INICIA UNA ESTRUCTURA CON CORCHETE
            System.out.println("[");
            //SE DEBE RECORRER EL ARREGLO DE LA PILA PARA PODER IMPRIMIR CADA VALOR
            //EN LA ESTRUCTURA ITERATIVA SE INICIA DESDE EL VALOR DE LA CIMA, ES DECIR
            //DESDE LA ÚLTIMA POSICIÓN AGREGADA AL ARREGLO, MIENTRAS EL VALOR DE "i" SEA
            //MAYOR QUE CERO (ES DECIR QUE AÚN NO HA LLEGADO A LA BASE DE LA PILA), EL VALOR
            //DE "i" ESTARÁ EN DECREMENTO HASTA LLEGAR A CERO
            for(int i = this.cima; i >= 0; i--){
                //SE IMPRIME CADA VALOR EN SU POSICIÓN CORRESPONDIENTE DE MANERA CONTINUA(SIN SALTOS DE LINEA)
                System.out.println(this.elementos[i]);
                //SE VERIFICA SI EL VALOR DE "i" ES MAYOR QUE CERO PARA PODER IMPRIMIR UN CARACTER
                if(i > 0){
                    //NO HA LLEGADO A CERO, POR LO TANTO, SE PUEDE IMPRIMIR UNA COMA
                    System.out.println(","); //SE IMPRIME UNA COMA
                }
            }
            
            //SE CIERRA LA ESTRUCTURA DE CORCHETE PARA LA SALIDA DEL USUARIO FINAL
            System.out.print("]");
        }
    }
    
}