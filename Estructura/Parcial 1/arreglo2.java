import java.util.Scanner;

public class arreglo2 {

    int numero[];

    Scanner lectura = new Scanner(System.in); 


    public arreglo2 (int tam){
        numero= new int[tam];
    }

    public void llenarA(){
        for(int i=0; i<numero.length;i++){
            System.out.println("ingrese el dato");
            int dato=lectura.nextInt();
        }
    }

    public void imprimirA(){
        for(int i=0; i<numero.length;i++)
        {
            System.out.println(numero[i]);
        }
    }

    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("ingrese el tamaño del arreglo");
        int tam=lectura.nextInt();
        arreglo2 obj = new arreglo2(tam);
        obj.llenarA();
        obj.imprimirA();

    }
}
    

