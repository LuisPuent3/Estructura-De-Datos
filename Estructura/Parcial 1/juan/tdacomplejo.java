package juan;

//tda que representa un numero complejo
public class tdacomplejo {
    double real;
    double imaginario;
    public tdacomplejo(double real, double imaginario){
        this.real = real;
        this.imaginario = imaginario;
    }
    public tdacomplejo(){
        this.real = 0;
        this.imaginario = 0;
    }
    public tdacomplejo suma(tdacomplejo c){
        return new tdacomplejo(this.real+c.real, this.imaginario+c.imaginario);
    }
    public tdacomplejo resta(tdacomplejo c){
        return new tdacomplejo(this.real-c.real, this.imaginario-c.imaginario);
    }
    public tdacomplejo producto(tdacomplejo c){
        return new tdacomplejo(this.real*c.real-this.imaginario*c.imaginario, this.real*c.imaginario+this.imaginario*c.real);
    }
    public tdacomplejo division(tdacomplejo c){
        return new tdacomplejo((this.real*c.real+this.imaginario*c.imaginario)/(c.real*c.real+c.imaginario*c.imaginario), (this.imaginario*c.real-this.real*c.imaginario)/(c.real*c.real+c.imaginario*c.imaginario));
    }
    public boolean igual(tdacomplejo c){
        return this.real == c.real && this.imaginario == c.imaginario;
    }
    public String toString(){
        return String.valueOf(this.real)+" + "+String.valueOf(this.imaginario)+"i";
    }
    //main
    public static void main(String[] args){
        tdacomplejo c1 = new tdacomplejo(2,3);
        tdacomplejo c2 = new tdacomplejo(1,2);
        System.out.println("b1: "+c1);
        System.out.println("b2: "+c2);
        System.out.println("b1 + b2: "+c1.suma(c2));
        System.out.println("b1 - b2: "+c1.resta(c2));
        System.out.println("b1 * b2: "+c1.producto(c2));
        System.out.println("b1 / b2: "+c1.division(c2));
        System.out.println("b1 == b2: "+c1.igual(c2));
    }
}
