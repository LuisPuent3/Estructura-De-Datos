

public class vector{
    //función recursiva que permita multiplicar los elementos de un vector
    public static int multiplicar(int[] vector, int n){
        if(n == 0){
            return 1;
        }else{
            return vector[n-1] * multiplicar(vector, n-1);
        }
    }


}
