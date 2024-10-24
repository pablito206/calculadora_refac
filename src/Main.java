import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);




        int opcion = scn.nextInt();
        double num1 = 0, num2= 0, resultado;
        double num0 = 0;


        do{
            menu();
            try {
                if(opcion >=1 && opcion<=5){
                    System.out.println("Introduce el primero numero: ");
                    num1 = scn.nextDouble();
                    System.out.println("Introduce el segundo numero: ");
                    num2 = scn.nextDouble();
                }
                switch (opcion){
                    case 1:
                        suma(num1,num2) ;
                        break;
                    case 2:
                        resta(num1,num2); ;
                        break;
                    case 3:
                        multiplicacion(num1,num2); ;
                        break;
                    case 4:
                        division(num1,num2); ;
                        break;
                    case 5:
                        potencias(num1,num2); ;
                        break;
                    case 6: factorial(num0); ;
                        break;
                    case 0:
                        System.out.println("Saliendo de la calculadora. Good Bye"); ;
                        break;
                    default:
                        System.out.println("La opcion seleccionada no es valida");
                }

            }catch (InputMismatchException error){
                System.out.println("Error, introduce un numero dentro del rango");
                scn.next();
                opcion = -1; // forzar para que vuelva al menu anterior
            }
        }while (opcion !=0);
            scn.close();
        }





    public static void menu(){
        System.out.println(("------ CALCULADORA ------"));
        System.out.println("1-Suma");
        System.out.println("2-Resta");
        System.out.println("3-Multiplicacion");
        System.out.println("4-Division");
        System.out.println("5-Potencia");
        System.out.println("6-Factoriales");
        System.out.println("0-Salir");
        System.out.print("Elige tu opcion:  ");
    }
    public static void suma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("El resultado de la suma es: " + resultado);
    }
    public static void resta(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("El resultado de la resta es: " + resultado);
    }
    public static void multiplicacion(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("El resultado de la multiplicacion es: " + resultado);
    }
    public static void division(double num1, double num2) {
        double resultado = num1 / num2;
        System.out.println("El resultado de la division es: " + resultado);
    }
    public static void potencias(double num1, double num2) {
        double resultado = Math.pow(num1,num2);
        System.out.println("El resultado de la potencia es: " + resultado);
    }
    public static void factorial(double num1, double num2) {
        System.out.print("Introduce un numero entero :");
        int num0 = scn.nextInt();
        if ( num0 < 0){
            System.out.println("No podemos hayar el factorial de un numero negativo ");
        }else {
            long resultado = 1;
            for( int i = 1; i <=num0; i++){
                resultado *=i;
            }
            System.out.println("El factorial de "+ num0+"es de:"+resultado);
        }

    }
}