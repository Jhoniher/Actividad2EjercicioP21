//Calculo de perimetro, semiperimetro y area de un triangulo
import java.util.Scanner;
public class EjercicioPropuesto21 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        System.out.println("Ingrese el primer lado del triangulo: ");
        int lado1=entrada.nextInt();
        System.out.println("Ingrese el segundo lado del triangulo: ");
        int lado2=entrada.nextInt();
        System.out.println("Ingrese el tercer lado del triangulo: ");
        int lado3=entrada.nextInt();
        int perimetro=lado1+lado2+lado3;
        double semiperimetro=(lado1+lado2+lado3)/2;
        //Formula de Heron:
        double area=Math.sqrt((semiperimetro*(semiperimetro-lado1)*(semiperimetro-lado2)*(semiperimetro-lado3)));
        System.out.println("El perimetro del triangulo es: "+perimetro);
        System.out.println("El semiperimetro del triangulo es: "+semiperimetro);
        System.out.println("El area del triangulo es: "+area);

    }
}
