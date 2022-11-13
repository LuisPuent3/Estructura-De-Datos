package juan;

//TDA que llena un arreglo
public class tdaarreglo {
    int[] arreglo;
    public tdaarreglo(int[] arreglo){
        this.arreglo = arreglo;
    }
    public tdaarreglo(){
        this.arreglo = new int[0];
    }
    public tdaarreglo llenar(int n){
        int[] arreglo = new int[n];
        for(int i=0; i<n; i++){
            arreglo[i] = i;
        }
        return new tdaarreglo(arreglo);
    }
    public String toString(){
        String s = "";
        for(int i=0; i<this.arreglo.length; i++){
            s += String.valueOf(this.arreglo[i])+" ";
        }
        return s;
    }
    //metodo que obtiene el 1er elemento del arreglo
    public int primerElemento(){
        return this.arreglo[0];
    }
    //metodo que obtiene el metodo por posicion
    public int elementoPosicion(int n){
        return this.arreglo[n];
    }
    //metodo que elimina elemento del arreglo
    public tdaarreglo eliminarElemento(int n){
        int[] arreglo = new int[this.arreglo.length-1];
        for(int i=0; i<this.arreglo.length; i++){
            if(i<n){
                arreglo[i] = this.arreglo[i];
            }else if(i>n){
                arreglo[i-1] = this.arreglo[i];
            }
        }
        return new tdaarreglo(arreglo);
    }
    //main para llamar a todos los metodos de la clase
    public static void main(String[] args) {
        tdaarreglo arreglo = new tdaarreglo();
        arreglo = arreglo.llenar(10);
        System.out.println(arreglo);
        System.out.println(arreglo.primerElemento());
        System.out.println(arreglo.elementoPosicion(5));
        arreglo = arreglo.eliminarElemento(5);
        System.out.println(arreglo);
    }

}
