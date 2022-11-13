package juan;

public class recursividad {
    //metodo para saber si la cadena es un palindromo de forma recursiva
    public static boolean palindromo(String cadena){
        if(cadena.length()==0 || cadena.length()==1){
            return true;
        }else if(cadena.charAt(0)==cadena.charAt(cadena.length()-1)){
            return palindromo(cadena.substring(1,cadena.length()-1));
        }else{
            return false;
        }
    }
    //metodo para potencia de forma recursiva
    public static int potencia(int base, int exponente){
        if(exponente==0){
            return 1;
        }else{
            return base*potencia(base,exponente-1);
        }
    }
    //metodo para antecesor de forma recursiva
    public static int antecesor(int n){
        if(n==0){
            return 0;
        }else{
            return n-1;
        }
    }
    //metodo para llenar un arreglo de forma recursiva
    public static void llenarArreglo(int arreglo[], int n){
        if(n==0){
            return;
        }else{
            arreglo[n-1]=n;
            llenarArreglo(arreglo,n-1);
        }
    }
    //main
    public static void main(String[] args) {
        //palindromo
        String cadena="anitalavalatina";
        System.out.println("La cadena "+cadena+" es un palindromo: "+palindromo(cadena));
        //potencia
        int base=2;
        int exponente=3;
        System.out.println("La potencia de "+base+" elevado a "+exponente+" es: "+potencia(base,exponente));
        //antecesor
        int n=5;
        System.out.println("El antecesor de "+n+" es: "+antecesor(n));
        //llenar arreglo
        int arreglo[]=new int[5];
        llenarArreglo(arreglo,5);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }


    
}
