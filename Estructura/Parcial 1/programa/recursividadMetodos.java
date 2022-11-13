package programa;
//libreria scanner
import java.util.Scanner;

public class recursividadMetodos {
    // funcion factorial con recursividad
    public static int factorial(int n){
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);//caso base 
        }
    }
    //metodo para calcular la potencia de un numero con recursividad
    public static int potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        }else{
            return base*potencia(base,exponente-1);
        }
    }
    //metodo para fibonacci con recursividad
    public static int fibonacci(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);//caso base
        }
    }
    //metodo para calcular el mcd con recursividad
    public static int mcd(int a, int b){
        if(b==0){
            return a;
        }else{
            return mcd(b,a%b);//caso base
        }
    }
    //torre de hanoi con recursividad
    public static void hanoi(int n, char origen, char auxiliar, char destino){
        if(n==1){
            System.out.println("Mover disco de "+origen+" a "+destino);
        }else{
            hanoi(n-1,origen,destino,auxiliar);//caso base
            System.out.println("Mover disco de "+origen+" a "+destino);
            hanoi(n-1,auxiliar,origen,destino);//caso base
        }
    }
    //metodo main para probar los metodos
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        System.out.println("El factorial de "+numero+" es "+factorial(numero));
        System.out.println("Ingrese la base");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente");
        int exponente = sc.nextInt();
        System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+potencia(base,exponente));
        System.out.println("Ingrese un numero");
        int numero2 = sc.nextInt();
        System.out.println("El numero de fibonacci de "+numero2+" es "+fibonacci(numero2));
        System.out.println("Ingrese el primer numero");
        int numero3 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        int numero4 = sc.nextInt();
        System.out.println("El mcd de "+numero3+" y "+numero4+" es "+mcd(numero3,numero4));
        System.out.println("Ingrese el numero de discos");
        int numero5 = sc.nextInt();
        hanoi(numero5,'A','B','C');
    }

}
