import java.util.Scanner;

public class A2E13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // variables a utilizar
        int num;
        int num2;
        int resultado;
        int num3;
        int num4;
        float resultado1;
        boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Sumar dos numeros");
            System.out.println("2. Dividir dos numeros");
            System.out.println("3. Salir");

            System.out.println("Escribe una de las opciones");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("Ingrese un numero");
                    num = sc.nextInt();
                    System.out.println("Ingrese un numero");
                    num2 = sc.nextInt();
                    resultado = num + num2;
                    System.out.println("El resultado de la suma es de: " + resultado);
                    break;
                case 2:

                    System.out.println("Ingrese un numero");
                    num3 = sc.nextInt();
                    System.out.println("Ingrese un numero");
                    num4 = sc.nextInt();
                    resultado1 = (float) num3 / num4;
                    if (num4 == 0) {
                        System.out.println("No se puede dividir dentro de 0");
                    } else {
                        System.out.println("El resultado de la division es de: " + resultado1);
                    }

                    break;

                case 3:
                    salir = true;
                    break;
                default:
                    System.out.println("Solo números entre 1 y 4");
            }

        }
    }

}
