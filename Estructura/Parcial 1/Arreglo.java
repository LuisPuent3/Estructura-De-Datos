//programa que creara un arreglo
import java.util.ArrayList;
import java.util.Scanner;

public class Arreglo{
    
    ArrayList<Integer> arreglo ;

    public static void main(String[] args) {
        Arreglo a = new Arreglo();
        a.arreglo = new ArrayList<Integer>();
        a.menu();
    }

    public void menu(){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("-------------");
            System.out.println("1. Agregar");
            System.out.println("2. Mostrar");
            System.out.println("3. Primer elemento");
            System.out.println("4. Obtener elemento por posicion");
            System.out.println("5. Actualizar elemento por posicion");
            System.out.println("6. Eliminar elemento");
            System.out.println("7. Salir");
            System.out.println("Ingrese su opcion: ");
            opcion = sc.nextInt();
            System.out.println("-------------");
            switch(opcion){
                case 1:
                    agregar();
                    break;
                case 2:
                    mostrar();
                    break;
                case 3:
                    primerElemento();
                    break;
                case 4:
                    obtenerElemento();
                    break;
                case 5:
                    actualizarElemento();
                    break;
                case 6:
                    eliminarElemento();
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }while(opcion != 7);
    }

    public void agregar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        arreglo.add(numero);
    }

    public void mostrar(){
        for(int i = 0; i < arreglo.size(); i++){
            System.out.println(arreglo.get(i));
        }
    }

    public void primerElemento(){
        System.out.println(arreglo.get(0));
    }

    public void obtenerElemento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion");
        int posicion = sc.nextInt();
        System.out.println(arreglo.get(posicion));
    }

    public void actualizarElemento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion");
        int posicion = sc.nextInt();
        System.out.println("Ingrese el nuevo numero");
        int numero = sc.nextInt();
        arreglo.set(posicion, numero);
    }

    public void eliminarElemento(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la posicion");
        int posicion = sc.nextInt();
        arreglo.remove(posicion);
    }

}







    
