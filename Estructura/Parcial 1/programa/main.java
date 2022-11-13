package programa;
//libreria scanner
import java.util.Scanner;

//main para mandar a llamar los metodos del archivo recursividadMetodos.java
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int numero = sc.nextInt();
        System.out.println("El factorial de "+numero+" es "+recursividadMetodos.factorial(numero));
        System.out.println("--------------------");
        System.out.println("Ingrese la base");
        int base = sc.nextInt();
        System.out.println("Ingrese el exponente");
        int exponente = sc.nextInt();
        System.out.println("El resultado de "+base+" elevado a "+exponente+" es "+recursividadMetodos.potencia(base,exponente));
        System.out.println("--------------------");
        System.out.println("Ingrese un numero para calcular el fibonacci");
        int fibo = sc.nextInt();
        System.out.println("El fibonacci de "+fibo+" es "+recursividadMetodos.fibonacci(fibo));
        System.out.println("--------------------");
        System.out.println("Ingrese el primer numero para calcular el mcd");
        int mcd1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero para calcular el mcd");
        int mcd2 = sc.nextInt();
        System.out.println("El mcd de "+mcd1+" y "+mcd2+" es "+recursividadMetodos.mcd(mcd1,mcd2));
        System.out.println("--------------------");
        System.out.println("Ingrese el numero de discos");
        int discos = sc.nextInt();
        recursividadMetodos.hanoi(discos,'A','B','C');
    }
}

