import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        System.out.println("5-Potencia");



        System.out.println("Elije tu opcion: ");
        int opcion = scn.nextInt();

        double num1, num2, resultado;


            System.out.println("Dime un numero: ");
             num1 = scn.nextInt();
            System.out.println("Dime un numero: ");
             num2 = scn.nextInt();




        if (opcion == 1) {
            resultado = num1 + num2;
            System.out.println("El resultado de la suma del numero " + num1 + " " + "y " + num2 + " " + "es" + " " + resultado);
        } else if (opcion == 2) {
            resultado = num1 - num2;
            System.out.println("El resultado de la resta del numero " + num1 + " " + "y " + num2 + " " + "es" + " " + resultado);
        } else if (opcion == 3) {
            resultado = num1 * num2;
            System.out.println("El resultado de la multiplicacion del numero " + num1 + " " + "y " + num2 + " " + "es" + " " + resultado);
        } else if (opcion == 4) {
            resultado = num1 / num2;
            if (num2 == 0){
                System.out.println("No se puede divir entre o");
            }else {
                System.out.println("El resultado de la division del numero " + num1 + " " + "y " + num2 + " " + "es" + " " + resultado);
            }
        } else if (opcion == 5) {
            resultado = Math.pow(num1, num2);
            System.out.println("El resultado de la potencia del numero " + num1 + " " + "y " + num2 + " " + "es" + " " + resultado);
        }else{
            System.out.println("La opcion elegida no es valida, porfavor selecciona otra opcion");
        }
    }
}