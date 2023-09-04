import java.util.Scanner;

public class recursividad {
    public static void main(String[] args) {
        Scanner escaner= new Scanner (System.in);
        int base, potencia,resultado;

        System.out.println("Ingrese la base");
        base = escaner.nextInt();
        System.out.println("Ingrese ahora la potencia");
        potencia = escaner.nextInt();
        escaner.close();
        do {
            if (potencia <= 0) {
            System.out.println("solo numeros positivos");
            }
        } while (potencia <= 0);
        resultado = base;
        for (int i=1; i<potencia;i++){
            resultado = (resultado*base);
        }
        System.out.println("El resultado de "+base+" a la "+potencia+" es " + resultado);
    }
}
