package Ejercicios_hoja;

import java.util.Scanner;

public class EjecutorPilaInvertida {

    static Scanner sc = new Scanner(System.in);
    static PilaInvertida pila = new PilaInvertida();
    
    public static void main(String[] args) {
        System.out.println("Sí corre el static main");
        
        menu();
    }
    
    public static void menu(){
    int eleccion;
    boolean salir = false;
    while(salir != true){
        System.out.println("----------------------------------------");
        System.out.println("Seleccione qué desea hacer");
        System.out.println("1.Añadir un nuevo elemento\n2.Pop\n3.Mostrar el primer elemento\n4.Preguntar si está vacía"
                + "\n5.Ver el tamaño de la fila\n6.Limpiar\n7.Mostrar la lista invertida\n8.Salir");
        eleccion = sc.nextInt();
    
        switch(eleccion){
            case 1: añadir();
            break;
            case 2: if(!pila.estaVacia()){
                System.out.println(pila.pop());
            }
            break;
            case 3: if(!pila.estaVacia()){
                System.out.println(pila.cima());
            }else{
                System.out.println("La pila está vacía");
            }
            case 4: pila.estaVacia();
            break;
            case 5: System.out.println("El tamaño es: "+pila.tamaño);
            break;
            case 6: if(!pila.estaVacia()){
                pila.limpiar();
                System.out.println("Pila limpia");
            }else{
                System.out.println("La pila está vacía");
            }
            break;
            case 7: pila.invertir();
            break;
            case 8: salir = true;
            break;
            default: System.out.println("La opción que seleccionó no existe, seleccione otra");
            break;
        }
    }
    }
    
    public static void añadir(){
        System.out.println("Ingrese el elemento");
        pila.push(sc.next());
    }
}