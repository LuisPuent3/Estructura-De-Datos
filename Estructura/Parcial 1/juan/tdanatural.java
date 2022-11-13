package juan;

public class tdanatural {
    int numero;
    public tdanatural(int numero){
        this.numero = numero;
    }   
    public tdanatural(){
        this.numero = 0;
    }
    public tdanatural sucesor(){
        return new tdanatural(this.numero+1);
    }
    public tdanatural antecesor(){
        return new tdanatural(this.numero-1);
    }
    public tdanatural suma(tdanatural n){
        return new tdanatural(this.numero+n.numero);
    }
    public tdanatural diferencia(tdanatural n){
        return new tdanatural(this.numero-n.numero);
    }
    public boolean igual(tdanatural n){
        return this.numero == n.numero;
    }
    public String toString(){
        return String.valueOf(this.numero);
    }
    //main
    public static void main(String[] args){
        tdanatural n1 = new tdanatural(3);
        tdanatural n2 = new tdanatural(3);
        System.out.println("a1: "+n1);
        System.out.println("a2: "+n2);
        System.out.println("a1 + a2: "+n1.suma(n2));
        System.out.println("a1 - a2: "+n1.diferencia(n2));
        System.out.println("a1 == a2: "+n1.igual(n2));
        System.out.println("a1 + 1: "+n1.sucesor());
        System.out.println("a2 - 1: "+n2.antecesor());
    }
}


